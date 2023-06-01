package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    private Integer id;
    private String clientName;
    private LocalDateTime orderTime;
    private List<Item> orderItems = new ArrayList<Item>();

    private Random random = new Random();

    public Order(String clientName) {
        this.clientName = clientName;
        this.orderTime = LocalDateTime.now();
        this.id = random.nextInt(9999);
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
        return "ORDER ID: " + id
                + "\nCLient name: " +  clientName 
                + "\nOrder time: " + orderTime
                + "\nItems: " + getOrderItems()
                + "\nOrder value: U$" + String.format("%.2f", orderValue());
    }
}
