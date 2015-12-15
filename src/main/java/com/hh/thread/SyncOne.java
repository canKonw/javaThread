package com.hh.thread;

/**
 * Created by Administrator on 15-12-15.
 * 多线程同步锁测试对象1
 */
public class SyncOne {
    public SyncOne(){
        System.out.println("uuuuu");
    }

    public synchronized static void say(){
        System.out.println("------ iam here 1");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("----e:"+e.getMessage());
        }

    }
}
