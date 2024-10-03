package org.example.dto;

import java.util.List;

public class RestaurantDto {
    private Long id;
    private String name;
    private String address;
    private List<MenuItemDto> menu;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
