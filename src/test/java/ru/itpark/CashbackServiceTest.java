package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateCashBack() {
        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashBack(15002,544,564);
            assertEquals(325, cashback);
        }

        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashBack(500000,50004,30004);
            assertEquals(3000, cashback);
        }
    }
}