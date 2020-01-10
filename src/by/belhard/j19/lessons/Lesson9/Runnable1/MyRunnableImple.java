package by.belhard.j19.lessons.Lesson9.Runnable1;

public class MyRunnableImple implements Runnable {



    private final String name;

    public MyRunnableImple (String name) {

        this.name = name;
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(1500);
                System.out.println("%s\n", name, counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("End of" + name);

    }
}
