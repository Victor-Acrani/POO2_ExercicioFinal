package bookstoreSystem.Part1.interfaces;

import bookstoreSystem.Part1.classes.Item;

public interface IItem {

    String getName();
    void setName(String name);
    Long getId();
    double getPrice();
    void setPrice(double price);
    String productInfo();
    String productFullDescription();

    <T extends Item> void update(T item);
}
