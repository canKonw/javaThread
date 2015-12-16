package com.hh.lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 15-12-16.
 * 运行结果
 * Thread-0得到了锁
 Thread-1得到了锁
 Thread-0释放了锁
 Thread-1释放了锁
 在insert方法中的lock变量是局部变量，每个线程执行该方法时都会保存一个副本，那么理所当然每个线程执行到lock.lock()处获取的是不同的锁，所以就不会发生冲突。
 */
public class MyLockOne {
        public static void main(String[] args)  {
            final MyLockOne test = new MyLockOne();

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
            Lock lock = new ReentrantLock();    //注意这个地方
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
