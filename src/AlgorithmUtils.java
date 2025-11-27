public class AlgorithmUtils {

// 1. Пошук мінімального елементу масиву позитивних чисел
    public static int findMinPositive(int[] numbers) {
// Перевірка на пустий масив або null
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        boolean foundPositive = false;

        for (int num : numbers) {
            if (num > 0 && num < min) {
                min = num;
                foundPositive = true;
            }
        }

        return foundPositive ? min : -1;
    }

// 2. Розрахунок суми лише від’ємних чисел масиву
    public static int sumNegativeOnly(int[] numbers) {
// Перевірка на null
        if (numbers == null) {
            return 0;
        }
        
        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                sum += num;
            }
        }
        return sum;
    }

// 3. Алгоритм розрахунку N-го елементу послідовності Фібоначчі
    public static long calculateFibonacci(int n) {
// Перевірка на від'ємні числа
        if (n < 0) {
            throw new IllegalArgumentException("N cannot be negative");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

// 4. Алгоритм розрахунку сили струму (I = U / R)
    public static double calculateCurrent(double voltage, double resistance) {
// Перевірка на нульовий опір
        if (Math.abs(resistance) < 1e-9) {
            throw new IllegalArgumentException("Resistance cannot be zero");
        }
        return voltage / resistance;
    }
}