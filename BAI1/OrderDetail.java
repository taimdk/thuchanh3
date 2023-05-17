/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class OrderDetail {
    private int quatity;
    private Product product;

    public OrderDetail(int quatity, Product product) {
        this.quatity = quatity;
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quatity=" + quatity + ", product=" + product + '}';
    }
    
    public double calcTotalPrice()
    {
        double thanhtien = quatity * product.getPrice();
        return thanhtien;
    }
}

