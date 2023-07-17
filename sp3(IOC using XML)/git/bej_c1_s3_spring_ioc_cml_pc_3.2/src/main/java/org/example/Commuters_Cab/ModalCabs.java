package org.example.Commuters_Cab;

public class ModalCabs {


    public String
    cab_name,cab_num;
    public String getCab_name() {
        return cab_name;
    }

    @Override
    public String toString() {
        return "ModalCabs{" +
                "cab_name='" + cab_name + '\'' +
                ", cab_num='" + cab_num + '\'' +
                '}';
    }

    public void setCab_name(String cab_name) {
        this.cab_name = cab_name;
    }

    public String getCab_num() {
        return cab_num;
    }

    public void setCab_num(String cab_num) {
        this.cab_num = cab_num;
    }

    public ModalCabs(String cab_name, String cab_num) {
        this.cab_name = cab_name;
        this.cab_num = cab_num;
    }
}
