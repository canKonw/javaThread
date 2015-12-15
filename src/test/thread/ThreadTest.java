import com.hh.thread.MyRunnable;
import com.hh.thread.MyThread;
import com.hh.thread.MyThreadSync;
import org.junit.Test;

/**
 * Created by Administrator on 15-12-15.
 */
public class ThreadTest {

    /**
     *
     * 1）thread1和thread2的线程ID不同，thread2和主线程ID相同，说明通过run方法调用并不会创建新的线程，而是在主线程中直接运行run方法，跟普通的方法调用没有任何区别；
     　2）虽然thread1的start方法调用在thread2的run方法前面调用，但是先输出的是thread2的run方法调用的相关信息，说明新线程创建的过程不会阻塞主线程的后续执行。
     */
    @Test
    public  void  testThread() throws Exception{
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        MyThread myThread1 = new MyThread("我的线程1");
        MyThread myThread2 = new MyThread("我的线程2");
        myThread1.start();
        Thread.sleep(3000);
        myThread2.run();
    }

    /**
     * 这种方式必须将Runnable作为Thread类的参数，然后通过Thread的start方法来创建一个新线程来执行该子任务。如果调用Runnable的run方法的话，是不会创建新线程的，这根普通的方法调用没有任何区别。
     */
    @Test
    public  void testRunnable(){
        System.out.println("我的主线程："+Thread.currentThread().getId());
        MyRunnable myRunnable = new MyRunnable();
         Thread thread = new Thread(myRunnable);
        thread.start();
    }



}
