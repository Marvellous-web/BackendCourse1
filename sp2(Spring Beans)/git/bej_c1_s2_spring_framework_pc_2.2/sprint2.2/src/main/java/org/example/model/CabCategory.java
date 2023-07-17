package org.example.model;

public class CabCategory {
    private String cabName;
    private int cabPrice;

    public CabCategory(){}

    public CabCategory(String name,int price){
        cabName=name;
        cabPrice=price;
    }

    public String getCabName() {
        return cabName;
    }

    public void setCabName(String cabName) {
        this.cabName = cabName;
    }

    public int getCabPrice() {
        return cabPrice;
    }

    public void setCabPrice(int cabPrice) {
        this.cabPrice = cabPrice;
    }
    public String toString(){
        return cabName +":"+ cabPrice;
    }
}
