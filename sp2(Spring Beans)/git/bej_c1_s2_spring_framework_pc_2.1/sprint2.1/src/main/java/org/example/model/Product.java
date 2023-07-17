package org.example.model;

public class Product {
    private int productId;
    private String productName;
    private int productPrice;

    public Product(){}
    public Product(int id,String name,int price){
        productId=id;
        productName=name;
        productPrice=price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String toString(){
        return productId +":"+ productName +":"+ productPrice;
    }
}
