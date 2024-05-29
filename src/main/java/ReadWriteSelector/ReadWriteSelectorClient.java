package ReadWriteSelector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ReadWriteSelectorClient {
    public static void main(String[] args) throws IOException {
        try (SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost", 8080))){
            ByteBuffer buffer = ByteBuffer.allocate(256);
            buffer.put("Hello Server".getBytes());
            buffer.flip();
            socketChannel.write(buffer);
            buffer.clear();
            System.out.println("Server: " + new String(buffer.array()).trim());
        }
    }
}
