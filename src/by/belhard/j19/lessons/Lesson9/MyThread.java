package by.belhard.j19.lessons.Lesson9;

public class MyThread extends Thread {

    private final  CommonObject obj;

    public MyThread(String name, CommonObject obj) {
        super(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        super.run();
    }
}
