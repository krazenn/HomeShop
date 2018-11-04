package krazenn.company.homeshop;

public class Customer {

    public Customer(String fullName, String adress) {
        this.fullName = fullName;
        this.adress = adress;
    }

    private String fullName;
    private String adress;

    public String getFullName() {
        return fullName;
    }

    public String getAdress() {
        return adress;
    }
}