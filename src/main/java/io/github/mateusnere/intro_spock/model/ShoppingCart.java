package io.github.mateusnere.intro_spock.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<String> items;
    private Integer totalItems;
    private Double totalPrice;

    ShoppingCart() {
        this.totalItems = 0;
        this.totalPrice = 0.0;
        this.items = new ArrayList<>();
    }

    public void addItem(String name, Integer quantity) {
        this.totalItems += quantity;
        this.totalPrice += 2.0 * quantity;
        this.items.add(name);
    }
}
