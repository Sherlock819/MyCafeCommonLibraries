package org.example.utils;

import org.example.dto.MenuItemDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class MenuGenerator {
    private static final String[] NAMES = {
            "Spaghetti Bolognese", "Margherita Pizza", "Caesar Salad", "Grilled Salmon",
            "Chicken Tikka Masala", "Beef Tacos", "Vegetable Stir Fry", "Chocolate Lava Cake"
    };

    private static final String[] DESCRIPTIONS = {
            "A classic Italian pasta dish with rich meat sauce.",
            "A traditional pizza topped with fresh mozzarella and basil.",
            "Crisp romaine lettuce, croutons, and Caesar dressing.",
            "Succulent salmon grilled to perfection.",
            "A flavorful Indian curry with tender chicken pieces.",
            "Soft tortillas filled with seasoned beef and fresh toppings.",
            "A mix of colorful vegetables stir-fried in a savory sauce.",
            "A rich chocolate dessert with a molten center."
    };

    private static final Random random = new Random();
    private static Long idCounter = 1L; // Static counter for itemId

    public static MenuItemDto generateRandomMenuItemDto() {
        String name = NAMES[random.nextInt(NAMES.length)];
        String description = DESCRIPTIONS[random.nextInt(DESCRIPTIONS.length)];
        Double price = Math.round((10 + (50 - 10) * random.nextDouble()) * 100.0) / 100.0; // Random price between 10.00 and 50.00
        LocalDateTime preparationTime = LocalDateTime.now().plusMinutes(random.nextInt(61)); // Random preparation time up to 60 minutes

        return new MenuItemDto(idCounter++, name, description, price, preparationTime); // Use idCounter for itemId
    }

    public static List<MenuItemDto> generateMenu(int numberOfItems) {
        List<MenuItemDto> menu = new ArrayList<>();
        for (int i = 0; i < numberOfItems; i++) {
            menu.add(generateRandomMenuItemDto());
        }
        return menu;
    }

    public static void main(String[] args) {
        List<MenuItemDto> menu = generateMenu(10); // Generate 10 random menu items
        menu.forEach(System.out::println); // Print the menu items
    }
}