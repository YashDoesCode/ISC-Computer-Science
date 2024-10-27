package ISC_XI_Computer_Science;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> productFunction = (a, b) -> a * b;

        // Using the BiFunction to calculate the product
        int result = productFunction.apply(5, 3);

        // Displaying the result
        System.out.println("Product: " + result);
    }
}
