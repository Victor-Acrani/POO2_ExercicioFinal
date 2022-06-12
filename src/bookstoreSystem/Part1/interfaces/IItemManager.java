package bookstoreSystem.Part1.interfaces;

import bookstoreSystem.Part1.classes.Item;

import java.util.List;

public interface IItemManager {

    void addItem(Item item);
    void addItem(List<Item> itemList);
    void showItem(Long id);
    void updateItem(Long id, Item item);
    void deleteItem(Long id);
    void listAllRegisteredItems();
    boolean isItemRegistered(Long id);
    Item getRegisteredItem(Long id);
    List<Item> getListOfRegisteredItems();
}
