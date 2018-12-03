package ru.itpark;

import org.junit.jupiter.api.Test;
import ru.itpark.service.CashbackService;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateCashBack() {
        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashBack(15_002, 544, 564);
            assertEquals(325, cashback);
        }

        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashBack(500_000, 50_004, 30_004);
            assertEquals(3_000, cashback);
        }
    }
}