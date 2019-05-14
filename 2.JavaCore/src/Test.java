/*
printf
\t  \n  %d  %s  %-12.3f
---------------------------------------------------------

java.lang.Thread;
Thread.start()
thread.start();
run()

Thread.sleep(3000);
InterruptedException

Thread.join() минус многопоточность!!! приостанавливает выполнение текущего потока
до тех пор, пока не завершится другой поток.

 */

class Test extends Thread{

    @Override
    public void run() {
        System.out.println("I'm Thread! My name is " + getName());
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            Test thread = new Test();
            thread.start();
        }

//        System.out.printf("%d число %d число2\t%s пример printf\n", 126546, 347676, " \"текст45345\"");
//        System.out.printf("%d число %d число2\t%s пример printf\n", 126546, 347676, " \"текст45345\"");
//        System.out.printf("%-33d число %d число2\t%s пример printf\n", 126546, 347676, " \"текст45345\"");
//        System.out.printf("%10d число %12.3f число2\t%s пример printf\n", 126546, 3.47676f, " \"текст45345\"");

    }
}