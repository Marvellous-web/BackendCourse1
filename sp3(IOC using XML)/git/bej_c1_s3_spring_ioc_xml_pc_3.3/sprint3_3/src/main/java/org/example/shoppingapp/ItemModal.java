package org.example.shoppingapp;

public class ItemModal {

    String item_name;

    public ItemModal(String  item_name) {

        this.item_name = item_name;
    }





    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    @Override
    public String toString() {
        return "ItemModal{" +

                ", item_name='" + item_name + '\'' +
                '}';
    }
}
