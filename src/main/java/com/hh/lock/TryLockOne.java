package com.hh.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 15-12-16.
 * ----name:Thread-0获得了锁
 ----name:Thread-1获得锁失败
 ----name:Thread-0释放了锁
 lock.tryLock()或返回一个状态
 如果该所被使用，就会返回获得锁失败，不会一直等待，知道获得锁
 */
public class TryLockOne {
   private Lock lock = new ReentrantLock();
   //private Lock lock = new ReentrantLock(true);  使用公平锁

    public static void main(String[] args) {
        final TryLockOne tryLockOne = new TryLockOne();
        new Thread(){
            public void run(){
                tryLockOne.insert(Thread.currentThread());
            }
        }.start();
        new Thread(){
            public void run(){
                tryLockOne.insert(Thread.currentThread());
            }
        }.start();
    }
    private  void insert(Thread thread){

        if(lock.tryLock()){ //lock.tryLock(2000, TimeUnit.SECONDS)  可是设置等待的时间
          try {
              System.out.println("----name:"+thread.getName()+"获得了锁");
              Thread.sleep(2000);
          }catch (Exception e){

          }finally {
              lock.unlock();
              System.out.println("----name:"+thread.getName()+"释放了锁");
          }
        }else {
            System.out.println("----name:"+thread.getName()+"获得锁失败");
        }
    }
}
