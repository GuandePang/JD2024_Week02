package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("服务器已启动，等待客户端连接...");

            //监听客户端连接
            Socket socket = serverSocket.accept();
            System.out.println("客户端已连接：" + socket.getInetAddress());

            //接收数据
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String message = reader.readLine();
            System.out.println("客户端消息：" + message);

            //发送数据
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.println("Hello, Client");
            writer.flush();

            //关闭连接
            writer.close();
            reader.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
