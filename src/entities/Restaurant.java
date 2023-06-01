package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Restaurant {

    private String name;
    private String adress;
    private String phoneNumber;
    private List<Item> menu = new ArrayList<Item>();
    private List<Order> orders = new ArrayList<Order>();
    private OrderStatus status;
    private List<OrderLogs> orderLogs = new ArrayList<OrderLogs>();
    
    public Restaurant(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMenu() {
        StringBuilder stb = new StringBuilder();
        for (Item item : menu) {
            stb.append(item.toString()).append("\n");
        }
        return stb.toString();
    }

    public void setMenu(List<Item> menu) {
        this.menu = menu;
    }

    public String getOrders() {
        StringBuilder stb = new StringBuilder();
        for (Order order : orders) {
            stb.append(order.showOrder()).append("\n\n");
        }
        return stb.toString();
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderLogs> getOrderLogs() {
        return this.orderLogs;
    }

    public void addItemMenu(Item item) {
        menu.add(item);
    }

    public void removeItemMenu(Item item) {
        menu.remove(item);
    }

    public String showMenu() {
        StringBuilder stb = new StringBuilder();
        for (Item item : menu) {
            stb.append(item.toString()).append("\n");
        }
        return stb.toString();
    }

    public String addOrder(Order order) {
        orders.add(order);
        return "Order added!";
    }

    public String removeOrder(Order order) {
        orders.remove(order);
        return "Order removed!";
    }

    public String generateSalesRep() {
        StringBuilder stb = new StringBuilder();
        for (OrderLogs order : orderLogs) {
            stb.append(order.generateLog()).append("\n");
        }
        return "LOGS: \n" + stb.toString();
    }
}
