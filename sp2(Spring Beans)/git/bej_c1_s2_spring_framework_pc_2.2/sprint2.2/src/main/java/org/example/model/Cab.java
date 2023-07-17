package org.example.model;

public class Cab {
    private int cabNo;
    private String cabRating;
    private CabCategory cabCategory;

    public Cab(){}
    public Cab(int no,String rating,CabCategory category){
        cabNo=no;
        cabRating=rating;
        cabCategory=category;
    }

    public int getCabNo() {
        return cabNo;
    }

    public void setCabNo(int cabNo) {
        this.cabNo = cabNo;
    }

    public String getCabRating() {
        return cabRating;
    }

    public void setCabRating(String cabRating) {
        this.cabRating = cabRating;
    }

    public CabCategory getCabCategory() {
        return cabCategory;
    }

    public void setCabCategory(CabCategory cabCategory) {
        this.cabCategory = cabCategory;
    }

    public String toString(){
        return cabNo +":"+ cabCategory +":"+ cabRating;
    }
}
