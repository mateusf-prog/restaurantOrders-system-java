package entities;

public class Item {

    private String name;
    private Double price;
    private Integer stock;

    public Item(){
    }
    
    public Item(String name, Double price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void addStock(Integer quantity) {
        this.stock += quantity;
    }

    public void removeStock(Integer quantity) {
        this.stock -= quantity;
    }

    public String toString() {
        return "-- " + getName() + " -- " 
            + "\nPrice: U$" + String.format("%.2f", getPrice());
    }
}
