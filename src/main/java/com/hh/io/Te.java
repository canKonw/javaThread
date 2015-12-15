package com.hh.io;

/**
 * Created by Administrator on 15-12-15.
 */
public class Te {
    final  static Object object = new Object();
    public synchronized void say(){
        synchronized (object){
            System.out.println("-----------hahah");
            try {
                Thread.sleep(5000);
            }catch (Exception e){

            }
        }
    }
}
