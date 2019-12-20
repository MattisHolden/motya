package by.belhard.j19.homeworks.Homework4.Task2;

public class Player {



        int x;
        int y;
        double distance;

        void printCurrentPos() {

                System.out.println(x + ":" + y);
        }

        void move(int newX, int newY) {

                distance += distance(newX, newY);

                this.x = newX;
                this.y = newY;



        }

        double  distance(int newX, int newY) {

                return Math.sqrt(Math.pow(this.x-newX, 2)+ Math.pow(this.y-newY, 2));
        }



}