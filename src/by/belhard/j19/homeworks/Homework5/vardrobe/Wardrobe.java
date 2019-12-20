package by.belhard.j19.homeworks.Homework5.vardrobe;

public class Wardrobe {

    private Clothes[] shelves;

    public Wardrobe(int shelvesNumber) {
        if (shelvesNumber < 1)
            return;
        this.shelves = new Clothes[shelvesNumber];
    }


    public void putOnShelf(Clothes clothes, int shelf) {
        if (shelf < 0 || shelf > shelves.length) {
            System.out.println("BAD INPUT");
            return;
        }
        if (shelves[shelf] == null)
        shelves[shelf] = clothes;
        else
            System.out.println("BUSY");
    }

    public void throwInto(Clothes clothes) {


    }


    public Clothes getFromShelf(int shelf) {



        return null;
    }

}
