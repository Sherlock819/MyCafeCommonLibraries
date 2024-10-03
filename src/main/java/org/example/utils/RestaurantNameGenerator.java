package org.example.utils;

import java.util.Random;

public class RestaurantNameGenerator {

    private static final String[] ADJECTIVES = {
            "Savory", "Tasty", "Spicy", "Crispy", "Fresh",
            "Delicious", "Zesty", "Hearty", "Sweet", "Flavorful"
    };

    private static final String[] NOUNS = {
            "Bistro", "Grill", "Cafe", "Kitchen", "Diner",
            "Eatery", "Table", "Haven", "Hub", "Palace"
    };

    private static final String[] CUISINES = {
            "Italian", "Mexican", "Thai", "Indian", "American",
            "Mediterranean", "Chinese", "French", "Japanese", "Greek"
    };

    public static String generateRandomRestaurantName() {
        Random random = new Random();

        // Select random components for the restaurant name
        String adjective = ADJECTIVES[random.nextInt(ADJECTIVES.length)];
        String noun = NOUNS[random.nextInt(NOUNS.length)];
        String cuisine = CUISINES[random.nextInt(CUISINES.length)];

        // Combine them to form a restaurant name
        return String.format("%s %s %s", adjective, noun, cuisine);
    }

    public static void main(String[] args) {
        // Generate and print 10 random restaurant names
        for (int i = 0; i < 10; i++) {
            String restaurantName = generateRandomRestaurantName();
            System.out.println(restaurantName);
        }
    }
}
