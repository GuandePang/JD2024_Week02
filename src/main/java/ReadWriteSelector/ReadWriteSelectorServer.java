package ReadWriteSelector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class ReadWriteSelectorServer {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("localhost", 8080));
        //设置通道成非阻塞模式
        serverSocketChannel.configureBlocking(false);
        //把通道注册到选择器上，并监听事件状态
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while(true){
            selector.select();
            //创建存储就绪的选择建的迭代器
            Iterator<SelectionKey> KeyIterator = selector.keys().iterator();
            while(KeyIterator.hasNext()){
                SelectionKey key = KeyIterator.next();

                KeyIterator.remove();
                if(key.isAcceptable()){
                    handleAccept(key);
                } else if (key.isReadable()) {
                    handleRead(key);
                } else if (key.isWritable()) {
                    handleWrite(key);
                }
            }
        }
    }

    //处理接受连接请求
    private static void handleAccept(SelectionKey key) throws IOException{
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
        //接受连接
        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        //将新的连接注册到选择器上，并监听读事件
        socketChannel.register(key.selector(), SelectionKey.OP_READ);
    }

    //处理接受读请求
    private static void handleRead(SelectionKey key) throws IOException{
        SocketChannel socketChannel = (SocketChannel) key.channel();
        //创建缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(256);
        //读取缓冲区
        int bytesRead = socketChannel.read(buffer);
        //如果缓冲区没有数据，则关闭通道
        if (bytesRead == -1){
            socketChannel.close();
        } else {
            //切换到通道读模式
            buffer.flip();
            //将数据写回到客户端
            socketChannel.write(buffer);
            //设置通道对写操作感兴趣
            key.interestOps(SelectionKey.OP_WRITE);
        }
    }

    private static void handleWrite(SelectionKey key) throws IOException{
        SocketChannel socketChannel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(256);
        //写入缓冲区
        buffer.put("Message from server".getBytes());
        //切换到读模式
        buffer.flip();
        //写入通道
        socketChannel.write(buffer);
        key.interestOps(SelectionKey.OP_READ);
    }
}
