package com.example.converter;

public class model {
    String Room_no,No_of_beds;
    String seats;

    public model() {

    }

    public model(String Room_no, String No_of_beds) {
        this.Room_no = Room_no;
        this.No_of_beds = No_of_beds;
       
    }

    public String getRoom_no() {
        return Room_no;
    }

    public void setRoom_no(String Room_no) {
        this.Room_no = Room_no;
    }

    public String getNo_of_beds() {
        return No_of_beds;
    }

    public void setNo_of_beds(String No_of_beds) {
        this.No_of_beds = No_of_beds;
    }



    


}
