package bookstoreSystem.Part1.classes;

import bookstoreSystem.Part1.interfaces.IStockedItem;
import bookstoreSystem.Part2.classes.AdultItem;

public class StockedItem extends AdultItem implements IStockedItem {

    private Item item;
    private int quantity;

    public StockedItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public StockedItem(boolean isAdultItem, Item item, int quantity) {
        this.isAdultItem = isAdultItem;
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Item getItem() {
        return item;
    }
    @Override
    public void showStockedItem() {
        System.out.println(item.productInfo() + ", {Quantity: " + quantity + "}");
    }

    @Override
    public boolean getIsAdultItem() {
        return this.isAdultItem;
    }

    @Override
    public void setIsAdultItem(boolean isAdultItem) {
        this.isAdultItem = isAdultItem;
    }

}
