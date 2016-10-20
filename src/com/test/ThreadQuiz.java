package com.test;

/**
 * Created by wangtao on 10/20/16.
 */


/*
public class ThreadQuiz {
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();

        Thread t1 = new Thread1(threadExample);
        Thread t2 = new Thread1(threadExample);

        t1.start();
        t2.start();
    }

}

class ThreadExample {
    public synchronized void execute() {
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello: " + i);
        }
    }

}

class Thread1 extends Thread {
    private ThreadExample threadExample;

    public Thread1(ThreadExample threadExample) {
        this.threadExample = threadExample;
    }

    @Override
    public void run() {
        threadExample.execute();
    }

}*/



/*
public class ThreadQuiz {
    public static void main(String[] args) {
        ThreadExample example = new ThreadExample();

        Thread t1 = new Thread1(example);
        Thread t2 = new Thread2(example);

        t1.start();
        t2.start();
    }

}

class ThreadExample {
    public synchronized void execute() {
        for (int i = 0; i < 5; ++i) {
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello: " + i);
        }
    }

    public synchronized void execute2() {
        for (int i = 0; i < 5; ++i) {
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("World: " + i);
        }
    }

}

class Thread1 extends Thread {
    private ThreadExample example;

    public Thread1(ThreadExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.execute();
    }

}

class Thread2 extends Thread {
    private ThreadExample example;

    public Thread2(ThreadExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.execute2();
    }

}*/


public class ThreadQuiz {
    public static void main(String[] args) {
        ThreadExample example = new ThreadExample();

        Thread t1 = new Thread1(example);

        example = new ThreadExample();

        Thread t2 = new Thread2(example);

        t1.start();
        t2.start();
    }

}

class ThreadExample {
    public synchronized static void execute() {
        for (int i = 0; i < 5; ++i) {
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello: " + i);
        }
    }

    public synchronized static void execute2() {
        for (int i = 0; i < 5; ++i) {
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("World: " + i);
        }
    }

}

class Thread1 extends Thread {
    private ThreadExample example;

    public Thread1(ThreadExample example)

    {
        this.example = example;
    }

    @Override
    public void run() {
        ThreadExample.execute();
    }

}

class Thread2 extends Thread {
    private ThreadExample example;

    public Thread2(ThreadExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        ThreadExample.execute2();
    }

}