package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String clientName;
    private LocalDateTime orderTime;
    private List<Item> orderItems;

    public Order(String clientName, List<Item> orderItems) {
        this.clientName = clientName;
        this.orderItems = new ArrayList<Item>();
        this.orderTime = LocalDateTime.now();
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public String getOrderItems() {
        StringBuilder stb = new StringBuilder();
        for (Item item : orderItems) {
            stb.append(item.getName()).append(", ");
        }
        return stb.toString();
    }

    public void addItem(Item item) {
        orderItems.add(item);
    }

    public void removeItem(Item item) {
        orderItems.remove(item);
    }

    public Double orderValue() {
        double value = 0;
        for (Item item : orderItems) {
            value += item.getPrice();
        }
        return value;
    }

    public String showOrder() {
        return "CLient name: " +  clientName 
                + "\nOrder time: " + orderTime
                + "\nItems: " + getOrderItems()
                + "\nOrder value: U$" + String.format("%.2f", orderValue());
    }
}
