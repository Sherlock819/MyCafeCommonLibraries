package org.example.dto;

import java.util.List;

public class RestaurantDto {
    private Long restaurantId;
    private String name;
    private String address;
    private List<MenuItemDto> menu;
    private String mobile;
    private String email;

    public RestaurantDto() {
    }

    public RestaurantDto(Long restaurantId, String name, String address, List<MenuItemDto> menu, String mobile, String email) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.mobile = mobile;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MenuItemDto> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItemDto> menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RestaurantDto{" +
                "restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
