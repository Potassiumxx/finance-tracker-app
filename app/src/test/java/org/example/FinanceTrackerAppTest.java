package org.example;

import org.finance.tracker.FinanceTrackerApp;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FinanceTrackerAppTest {
    @Test void appRunsWithoutCrashing() {
        FinanceTrackerApp.main(new String[]{});
        assertTrue(true);
    }
}
