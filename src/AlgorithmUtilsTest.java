import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmUtilsTest {

// --- Тести для findMinPositive ---

    @Test
    public void testFindMinPositive_PositiveCase() {
        int[] input = {10, 5, -3, 2, 8};
        assertEquals(2, AlgorithmUtils.findMinPositive(input));
    }

    @Test
    public void testFindMinPositive_NegativeCase_NoPositives() {
        int[] input = {-1, -5, -10};
        assertEquals(-1, AlgorithmUtils.findMinPositive(input));
    }

    @Test
    public void testFindMinPositive_NegativeCase_NullOrEmpty() {
        assertEquals(-1, AlgorithmUtils.findMinPositive(null));
        assertEquals(-1, AlgorithmUtils.findMinPositive(new int[]{}));
    }

// --- Тести для sumNegativeOnly ---

    @Test
    public void testSumNegativeOnly_PositiveCase() {
        int[] input = {-5, 10, -2, 3, 0};
        assertEquals(-7, AlgorithmUtils.sumNegativeOnly(input));
    }

    @Test
    public void testSumNegativeOnly_NegativeCase_NoNegatives() {
        int[] input = {1, 2, 3};
        assertEquals(0, AlgorithmUtils.sumNegativeOnly(input));
    }
    
    @Test
    public void testSumNegativeOnly_NegativeCase_Null() {
        assertEquals(0, AlgorithmUtils.sumNegativeOnly(null));
        assertEquals(0, AlgorithmUtils.sumNegativeOnly(new int[]{}));
    }

// --- Тести для calculateFibonacci ---

    @Test
    public void testCalculateFibonacci_PositiveCase() {
        assertEquals(8, AlgorithmUtils.calculateFibonacci(6));
    }
    
    @Test
    public void testCalculateFibonacci_BaseCases() {
        assertEquals(0, AlgorithmUtils.calculateFibonacci(0));
        assertEquals(1, AlgorithmUtils.calculateFibonacci(1));
    }

    @Test
    public void testCalculateFibonacci_NegativeCase_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            AlgorithmUtils.calculateFibonacci(-5);
        });
    }

// --- Тести для calculateCurrent ---

    @Test
    public void testCalculateCurrent_PositiveCase() {
        assertEquals(5.0, AlgorithmUtils.calculateCurrent(10.0, 2.0), 0.001);
    }

    @Test
    public void testCalculateCurrent_NegativeCase_ZeroResistance() {
        assertThrows(IllegalArgumentException.class, () -> {
            AlgorithmUtils.calculateCurrent(220.0, 0.0);
        });
    }
    
    @Test
    public void testCalculateCurrent_SmallResistance() {
// Перевірка, що дуже малий опір працює, але 0 - ні
        assertEquals(200.0, AlgorithmUtils.calculateCurrent(10.0, 0.05), 0.001);
    }
}