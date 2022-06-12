package bookstoreSystem.Part2.interfaces;

import bookstoreSystem.Part1.interfaces.IStockedItem;

import java.util.List;

public interface IDiscount {

    double checkBookDiscount(List<IStockedItem> items, double bill);
}
