package by.belhard.j19.lessons.Lesson9.lambdas;

public class Main {

    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(() -> {
            @Override
            public void run() {
                for (int i = 0; i <50; i++){
                try {
                    Thread.sleep(500);
                    System.out.print(".");

                }  catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        })



    }
}
