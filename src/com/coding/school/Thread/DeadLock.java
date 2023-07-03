package com.coding.school.Thread;

public class DeadLock {

    String resource1 = "Saket";
    String resource2= "BatMan";

    public void readR1(){
        synchronized (resource1){
            System.out.println("Thread 1: locked resource 1");
            try { Thread.sleep(100);} catch (Exception e) {}
            synchronized (resource2){
                System.out.println("Thread 2: locked resource 2");
                try { Thread.sleep(100);} catch (Exception e) {}
            }
        }
    }

    public void readR2(){
        synchronized (resource2){
            System.out.println("Thread 2: locked resource 2");
            try { Thread.sleep(100);} catch (Exception e) {}
            synchronized (resource1){
                System.out.println("Thread 1: locked resource 1");
                try { Thread.sleep(100);} catch (Exception e) {}
            }
        }

    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        Thread t1 = new Thread(()-> dl.readR2());
        Thread t2 = new Thread(()-> dl.readR1());
        t1.start();
        t2.start();
    }
}
