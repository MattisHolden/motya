package by.belhard.j19.lessons.Lesson4;


public class Person {


    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }

    String name;
    int age;
    Country country;
    Sex sex;
    void walk() {

        System.out.println(name + " is walking");


    }

    void eat(String dish) {

        System.out.println(name + " is eating" + dish + ". om-nom-nom!");

    }

    int growOld() {
        return ++age;
    }


}
