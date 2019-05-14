/*
printf
\t  \n  %d  %s  %-12.3f
---------------------------------------------------------
процесс
поток
монитор
setDaemon(true);
volatile
java.lang.Thread;
extends Thread
Thread.currentThread();
Thread.start()
thread.start();
run()
synchronized
(isAlive() sleep() и join())

implements Runnable

Thread.sleep(3000);
InterruptedException
throws InterruptedException

Thread.join() минус многопоточность!? приостанавливает выполнение текущего потока
до тех пор, пока не завершится другой поток.

Thread.interrupt()
boolean-флаг interrupted
boolean isInterrupted()


 */

//class Test extends Thread{
//
//    @Override
//    public void run() {
//        System.out.println("I'm Thread! My name is " + getName());
//    }
//
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 10; i++) {
//
//            Test thread = new Test();
//            thread.start();
//        }
//
////        System.out.printf("%d число %d число2\t%s пример printf\n", 126546, 347676, " \"текст45345\"");
////        System.out.printf("%d число %d число2\t%s пример printf\n", 126546, 347676, " \"текст45345\"");
////        System.out.printf("%-33d число %d число2\t%s пример printf\n", 126546, 347676, " \"текст45345\"");
////        System.out.printf("%10d число %12.3f число2\t%s пример printf\n", 126546, 3.47676f, " \"текст45345\"");
//
//    }
//}

public class Test extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread test = new Test();
        test.start();

        Thread.sleep(10000);
        test.interrupt();
    }

    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted())
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Работа потока была прервана");
                break;
            }
            System.out.println("Tik");
        }
    }
}