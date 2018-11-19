package ru.itpark;

public class CashbackService {
    public int calculateCashBack(int ordinaryPurchase, int purchaseWithIncreasedCashBack, int purchaseSpecialOffer) {
        int totalCashBask;
        int ordinaryCashBackPersent = 1;
        int increatedCashBackPercent = 5;
        int pecisalCashBackPercent = 30;
        int hundredPercent = 100;
        int limitCashBack = 3000;

        totalCashBask = ((ordinaryPurchase/ hundredPercent) * ordinaryCashBackPersent)  + ((purchaseWithIncreasedCashBack / hundredPercent)* increatedCashBackPercent)  + ((purchaseSpecialOffer  / hundredPercent)* pecisalCashBackPercent);
        if (totalCashBask > limitCashBack) {
            totalCashBask = limitCashBack;
        }
        return totalCashBask;

    }
}