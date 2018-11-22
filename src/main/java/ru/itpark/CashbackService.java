package ru.itpark;

public class CashbackService {
    public int calculateCashBack(int ordinaryPurchase, int increasedPurchase, int specialOffer) {
        int ordinaryCashBack = 1;
        int increatedCashBack = 5;
        int specisalCashBack = 30;
        int hundredPercent = 100;
        int limitCashBack = 3_000;

        int totalCashBack = ((ordinaryPurchase / hundredPercent) * ordinaryCashBack) +
                ((increasedPurchase / hundredPercent) * increatedCashBack) +
                ((specialOffer / hundredPercent) * specisalCashBack);
        if (totalCashBack > limitCashBack) {
            totalCashBack = limitCashBack;
        }
        return totalCashBack;

    }
}