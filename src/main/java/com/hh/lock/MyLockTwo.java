package com.hh.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 15-12-16.
 * Thread-0得到了锁
 Thread-0释放了锁
 Thread-1得到了锁
 Thread-1释放了锁
 这里锁使用的同一个对象  所以必须等第一个解锁了第二个才能拿到
 */
public class MyLockTwo {
    private  Lock lock = new ReentrantLock();   //注意这个地方
    public static void main(String[] args)  {
        final MyLockTwo test = new MyLockTwo();
        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }

}
