package bookstoreSystem.Part2.interfaces;

import bookstoreSystem.Part1.interfaces.IStockedItem;
import bookstoreSystem.Part2.classes.Costumer;

import java.util.List;

public interface IPurchaseValidator {

    boolean checkCostumerData(Costumer costumer);
    List<IStockedItem> validateList(List<IStockedItem> items, Costumer costumer);
}
