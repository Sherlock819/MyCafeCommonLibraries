package org.example.utils;

import org.example.dto.MenuItemDto;
import org.example.dto.OrderDto;
import org.example.enums.OrderStatus;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderGenerator {
    private static final Random random = new Random();
    private static Long orderIdCounter = 1L; // Counter for order IDs
    private static final String[] ADDRESSES = {
            "123 Main St, Cityville", "456 Elm St, Townsville",
            "789 Oak St, Villageburg", "101 Pine St, Metropolis"
    };

    // Method to generate a random order
    public static OrderDto generateRandomOrderDto(List<MenuItemDto> menuItems, Long userId, Long restaurantId) {
        List<MenuItemDto> orderedItems = new ArrayList<>();
        Double totalAmount = 0.0;

        // Randomly select between 1 to 5 menu items for the order
        int numberOfItems = random.nextInt(5) + 1; // 1 to 5 items
        for (int i = 0; i < numberOfItems; i++) {
            MenuItemDto item = menuItems.get(random.nextInt(menuItems.size()));
            orderedItems.add(item);
            totalAmount += item.getPrice(); // Calculate total amount
        }

        // Generate random address and status
        String address = ADDRESSES[random.nextInt(ADDRESSES.length)];
        OrderStatus status = OrderStatus.PENDING; // Initial status of the order

        return new OrderDto(orderIdCounter++, userId, restaurantId, orderedItems, totalAmount, address,
                LocalDateTime.now(), status);
    }

    public static void main(String[] args) {
        // Sample menu items for generating orders
        List<MenuItemDto> menu = new ArrayList<>();
        menu.add(new MenuItemDto(1L, "Spaghetti Bolognese", "A classic Italian pasta dish with rich meat sauce.", 12.99, Duration.ofMinutes(12), 1L));
        menu.add(new MenuItemDto(2L, "Margherita Pizza", "A traditional pizza topped with fresh mozzarella and basil.", 10.49, Duration.ofMinutes(30), 2L));
        menu.add(new MenuItemDto(3L, "Caesar Salad", "Crisp romaine lettuce, croutons, and Caesar dressing.", 8.99, Duration.ofMinutes(23), 3L));
        menu.add(new MenuItemDto(4L, "Grilled Salmon", "Succulent salmon grilled to perfection.", 18.99, Duration.ofMinutes(48), 4L));
        menu.add(new MenuItemDto(5L, "Chicken Tikka Masala", "A flavorful Indian curry with tender chicken pieces.", 14.49, Duration.ofMinutes(28), 5L));

        // Generate and print 5 random orders
        for (int i = 0; i < 5; i++) {
            OrderDto order = generateRandomOrderDto(menu, 1001L, 501L); // Example userId and restaurantId
            System.out.println(order);
        }
    }
}
