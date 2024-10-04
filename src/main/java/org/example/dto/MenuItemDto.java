package org.example.dto;

import java.time.Duration;

public class MenuItemDto {
    private Long itemId;
    private String name;
    private String description;
    private Double price;
    private Duration preparationTime;
    private Long restaurantId;

    public MenuItemDto(Long itemId, String name, String description, Double price, Duration preparationTime, Long restaurantId) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.preparationTime = preparationTime;
        this.restaurantId = restaurantId;
    }

    public MenuItemDto(String name, String description, Double price, Duration preparationTime) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.preparationTime = preparationTime;
    }


    public MenuItemDto() {
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }


    public Duration getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Duration preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }


    @Override
    public String toString() {
        return "MenuItem{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", preparationTime=" + preparationTime +
                '}';
    }
}
