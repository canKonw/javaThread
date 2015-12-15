package com.hh.thread;

/**
 * Created by Administrator on 15-12-15.
 * 多相称同步锁测试对象2
 */
public class SyncTwo {
    static Object object = new Object();
    public SyncTwo(){
        System.out.println("kkkk");
    }
    public void say(){
        synchronized (object){
            System.out.println("------ i am here 2");
            try {
                Thread.sleep(3000);
            }catch (Exception e){

            }
        }
    }
}
