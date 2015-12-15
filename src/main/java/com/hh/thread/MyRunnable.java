package com.hh.thread;

/**
 * Created by Administrator on 15-12-15.
 * 继承runable接口必须重写run方法
 */
public class MyRunnable implements Runnable {

    public MyRunnable() {

    }
    @Override
    public void run() {
        System.out.println("子线程ID："+Thread.currentThread().getId());
    }
}
