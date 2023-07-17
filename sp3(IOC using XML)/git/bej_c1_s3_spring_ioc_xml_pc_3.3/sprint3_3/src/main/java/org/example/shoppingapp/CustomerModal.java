package org.example.shoppingapp;

import java.util.List;

public class CustomerModal {


    private String id,name;
    private List<ItemModal> item;

    @Override
    public String toString() {
        return "CustomerModal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", item=" + item +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<ItemModal> getItem() {
        return item;
    }

    public void setItem(List<ItemModal> item) {
        this.item = item;
    }

    public CustomerModal() {
    }




    public CustomerModal(String id, String name, List<ItemModal> item) {
        this.id = id;
        this.name = name;
        this.item = item;
    }
}
