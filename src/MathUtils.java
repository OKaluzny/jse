import java.util.HashMap;
import java.util.Map;

public class MathUtils {

    private static Map<Integer, Integer> CACHE = new HashMap<>();

    static{
        CACHE.put(0,0);
        CACHE.put(1,1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        return CACHE.computeIfAbsent(n, value -> fibonacci(n - 1) + fibonacci(n - 2));
    }
}
