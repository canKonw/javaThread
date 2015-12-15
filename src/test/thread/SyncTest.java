import com.hh.thread.SyncOne;
import com.hh.thread.SyncTwo;
import org.junit.Test;

/**
 * Created by Administrator on 15-12-15.
 */
public class SyncTest {

    @Test
    public void test1(){
        new Thread(){
            public void run(){
              new SyncOne().say();
            }
        }.start();
        System.out.println("-------------");
        new Thread(){
            public void run(){
                new SyncOne().say();
            }
        }.start();
        System.out.println("-------------");
    }


    @Test
    public void test2(){
        new Thread(){
            public void run(){
                new SyncTwo().say();
            }
        }.start();
        new Thread(){
            public void run(){
                new SyncTwo().say();
            }
        }.start();
    }

}
