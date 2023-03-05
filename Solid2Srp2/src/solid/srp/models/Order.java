package solid.srp.models;

//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;

public class Order{
    private final String clientName;
    private final String product;
    private final int qnt;
    private final int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

}
