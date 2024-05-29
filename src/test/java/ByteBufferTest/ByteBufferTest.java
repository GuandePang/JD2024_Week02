package ByteBufferTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteBufferTest {
    public static void main(String[] args) {
        //获取channel
        try (FileChannel channel = new FileInputStream("src/main/java/ByteBufferTest/data.txt").getChannel()){
            final ByteBuffer buffer = ByteBuffer.allocate(1024);
            //读取文件内容，存入缓冲区
            channel.read(buffer);
            //切换为读模式
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
            //清空缓冲区，重置为写模式
            buffer.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
