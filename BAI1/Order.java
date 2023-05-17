/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;


/**
 *
 * @author Redmi
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItems;
    private static final int MAX_ITEMS = 20;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void addLineItems(Product product, int quantity) {
        if (lineItems.size() < MAX_ITEMS) {
            OrderDetail orderDetail = new OrderDetail(quantity, product);
            lineItems.add(orderDetail);
        } else {
            System.out.println("Vuot qua so luong san pham toi da cho 1 hoa don.");
        }
    }

    public double calcTotalCharge() {
        double totalCharge = 0;
        for (OrderDetail orderDetail : lineItems) {
            totalCharge += orderDetail.calcTotalPrice();
        }
        return totalCharge;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        String productID = sc.nextLine();
        System.out.print("Nhap mo ta san pham: ");
        String description = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        double price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int quantity = sc.nextInt();

        Product product = new Product(description, productID, price);
        addLineItems(product, quantity);
        System.out.println("Da them san pham vao don hang.");
    }

    public void in() {
        System.out.println("Ma hoa don: " + orderID);
        System.out.println("Ngay mua: " + orderDate);
        System.out.println(String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|",
                "Ma san pham", "Mo ta san pham", "Gia", "So luong", "Thanh tien"));
        System.out.println("========================================================================================================");
        for (OrderDetail orderDetail : lineItems) {
            System.out.println(String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|",
                    orderDetail.getProduct().getProduct(), orderDetail.getProduct().getDescription(),
                    orderDetail.getProduct().getPrice(), orderDetail.getQuatity(), orderDetail.calcTotalPrice()));
        }
        System.out.println("Tong tien: " + calcTotalCharge());
    }
}

