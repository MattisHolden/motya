package by.belhard.j19.homeworks.Homework2;

public class Task1 {

    public static void main(String[] args) {

        int t = 17;
        String result = null;

        if (t < 10) {
            result = "jacket";
        } else if  (t < 15) {
            result = "windbreaker";
        } else if (t < 20) {
            result = "sweater";
        }
        System.out.println(result);
        System.out.println(t);

    }
}
