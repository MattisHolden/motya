package by.belhard.j19.lessons.lesson3;

public class ArrayExample {


    public static void main(String[] args) {

        int[] intsArray = {0, 11, -2, 21, 5};
        for (int i = 0; i < intsArray.length; i++) {
            if (1 % 2 != 0 )
                intsArray[i] += intsArray[i];
        //    System.out.println(intsArray[i]);


        }
for (int i : intsArray) {

    System.out.println(i);
}

    }
}
