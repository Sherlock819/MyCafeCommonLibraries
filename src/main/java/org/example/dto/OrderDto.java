package org.example.dto;

import org.example.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {

    private Long orderiId;
    private Long userId;
    private Long restaurantId;
    private List<MenuItemDto> items;
    private Double totalAmount;
    private String address;
    private LocalDateTime orderTime;
    private OrderStatus status;

    public OrderDto() {
    }

    public OrderDto(Long orderiId, Long userId, Long restaurantId, List<MenuItemDto> items, Double totalAmount, String address, LocalDateTime orderTime, OrderStatus status) {
        this.orderiId = orderiId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.address = address;
        this.orderTime = orderTime;
        this.status = status;
    }


    public Long getOrderiId() {
        return orderiId;
    }

    public void setOrderiId(Long orderiId) {
        this.orderiId = orderiId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public List<MenuItemDto> getItems() {
        return items;
    }

    public void setItems(List<MenuItemDto> items) {
        this.items = items;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderiId=" + orderiId +
                ", userId=" + userId +
                ", restaurantId=" + restaurantId +
                ", items=" + items +
                ", totalAmount=" + totalAmount +
                ", address='" + address + '\'' +
                ", orderTime=" + orderTime +
                ", status=" + status +
                '}';
    }
}
