package com.hh.io;

/**
 * Created by Administrator on 15-12-15.
 */
public class rr {
    public static void main(String[] args) {

        new Thread(){
            public void run(){
               new Te().say();
            }
        }.start();
        new Thread(){
            public void run(){
                new Te().say();
            }
        }.start();
    }
}
