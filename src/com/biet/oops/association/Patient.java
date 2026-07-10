package com.biet.oops.association;
public class Patient {
    String patientName;
    int age;
    String dateOfArrival, disease;
    Information info; // User defined class Variables
    Payment pay; // User defined class Variables

    public Patient(String patientName, int age, String dateOfArrival, String disease,
                   Information info, Payment pay) {
        this.patientName = patientName;
        this.age = age;
        this.dateOfArrival = dateOfArrival;
        this.disease = disease;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails(){
        System.out.println("Name : " + this.patientName);
        System.out.println("Age : " + this.age);
        System.out.println("Date of Arrival : " + this.dateOfArrival);
        System.out.println("Disease : " + this.disease);
        System.out.println("Block Number : " + this.info.blockNo);
        System.out.println("Floor Number : " + this.info.floorNo);
        System.out.println("Room Number : " + this.info.roomNo);
        System.out.println("Bed Number : " + this.info.bedNo);
        System.out.println("Admission fees : " + this.pay.admFees);
        System.out.println("Registration Fees : " + this.pay.regFees);
        System.out.println("Balance Amount : " + this.pay.balAmt);
    }
    public static void main(String[] args) {
        Information i1 = new Information('C', 3, 301, 4);
        Payment pay1 = new Payment(2000.75f, 5000.45F, 1000.25f);
        Patient p1 = new Patient("ABC", 21, "7/07/26",
                "Dengue", i1, pay1);
        p1.patientDetails();

    }
}
