package org.example.utils;

public class PriceValidator {
    // Method to validate the price
    public static boolean isValidPrice(Double price) {
        // Check if price is null
        if (price == null) {
            return false; // Invalid if price is null
        }
        // Check if price is greater than zero
        return price > 0;
    }

    public static void main(String[] args) {
        // Test the isValidPrice method
        Double[] testPrices = {12.99, -5.00, 0.0, null, 34.50};

        for (Double price : testPrices) {
            if (isValidPrice(price)) {
                System.out.println(price + " is a valid price.");
            } else {
                System.out.println(price + " is not a valid price.");
            }
        }
    }
}
