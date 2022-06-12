package bookstoreSystem.Part1.interfaces;

import bookstoreSystem.Part1.classes.Item;
import bookstoreSystem.Part2.interfaces.ICheckAdultItem;

public interface IStockedItem extends ICheckAdultItem {

    int getQuantity();
    void setQuantity(int quantity);
    Item getItem();
    void showStockedItem();
}
