import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Administrator on 15-12-15.
 */
public class IoTest {

    @Test
    public void channelTest()  throws IOException{
        File file = new File("E:/aa.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel channel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer =ByteBuffer.allocate(1024);
        String str = "this is  channel test";
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();//必须调用
        channel.write(byteBuffer);
        channel.close();
        fileOutputStream.close();

    }
}
