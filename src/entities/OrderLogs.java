package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderLogs {
    
    private static List<Order> orders = new ArrayList<Order>();
    private LocalDateTime dateTime;

    public OrderLogs() {
        this.dateTime = LocalDateTime.now();
    }

    public String getOrders () {
        StringBuilder stb = new StringBuilder();
        for (Order order : orders) {
            stb.append(order.toString()).append(", ");
        }
        return stb.toString();
    }

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static void removeOrder(Order order) {
        orders.remove(order);
    }

    public String generateLog() {
        return getOrders() + "\n" + dateTime;
    }
}
