package org.example.Commuters_Cab;

public class ModalCommuters {

    public String name,destination,price;


    @Override
    public String toString() {
        return "ModalCommuters{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", price='" + price + '\'' +
                ", modalcabs=" + modalcabs +
                '}';
    }

    public ModalCommuters(String name, String destination, String price, ModalCabs modalcabs) {
        this.name = name;
        this.destination = destination;
        this.price = price;
        this.modalcabs = modalcabs;
    }

    ModalCabs modalcabs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ModalCabs getModalcabs() {
        return modalcabs;
    }

    public void setModalcabs(ModalCabs modalcabs) {
        this.modalcabs = modalcabs;
    }
}
