/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Sales {
    private int id; 
    private String category;
    private String productName;
    private String customerName;
    private float  unitPrice;
    private float  quantity;
    private float  totalPrice;
    private float  discount;
    private float  actualAmount;
    private Date date;

    public Sales() {
    }

    public Sales(int id, String category, String productName, String customerName, float unitPrice, float quantity, float totalPrice, float discount, float actualAmount, Date date) {
        this.id = id;
        this.category = category;
        this.productName = productName;
        this.customerName = customerName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.actualAmount = actualAmount;
        this.date = date;
    }

   

    public Sales(String category, String productName, String customerName, float unitPrice, float quantity, float totalPrice, float discount, float actualAmount) {
        this.category = category;
        this.productName = productName;
        this.customerName = customerName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.actualAmount = actualAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(float actualAmount) {
        this.actualAmount = actualAmount;
    }
    
    
    
    
}
