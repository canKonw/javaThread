package com.hh.thread;

import java.io.IOException;

/**
 * Created by Administrator on 15-12-15.
 * 线程sleep时不会释放锁
 */
public class MyThreadSync{

    private int i = 10;
    private Object object = new Object();

    public static void main(String[] args) throws IOException {
        MyThreadSync test = new MyThreadSync();
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();
        thread1.start();
        thread2.start();
    }



    class MyThread extends Thread{
        @Override
        public void run() {
            synchronized (object){
                System.out.println("----i="+i++);
                System.out.println("线程"+Thread.currentThread().getId()+"进入睡眠状态");
                try {
                    Thread.currentThread().sleep(2000);
                }catch (Exception e){
                    System.out.println("----e:"+e.getMessage());
                }
                System.out.println("线程"+Thread.currentThread().getId()+"结束睡眠状态");
                System.out.println("----i="+i++);
            }
        }
    }
}
