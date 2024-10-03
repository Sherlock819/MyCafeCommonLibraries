package org.example.dto;

import java.time.LocalDateTime;

public class MenuItemDto {
    private Long itemId;
    private String name;
    private String description;
    private Double price;
    private LocalDateTime preparationTime;

    public MenuItemDto(Long itemId, String name, String description, Double price, LocalDateTime preparationTime) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.preparationTime = preparationTime;
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


    public LocalDateTime getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(LocalDateTime preparationTime) {
        this.preparationTime = preparationTime;
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
