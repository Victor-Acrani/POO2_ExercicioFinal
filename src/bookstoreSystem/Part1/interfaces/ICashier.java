package bookstoreSystem.Part1.interfaces;

import java.util.List;

public interface ICashier {

    Long getId();
    double getCash();
    void setCash(int cash);

    double calculateBill(List<IStockedItem> items);

    void chargeCostumer(double bill);

    void updateCashierCash(double cash);

}
