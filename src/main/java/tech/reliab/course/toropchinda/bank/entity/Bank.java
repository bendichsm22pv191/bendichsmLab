package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import java.util.Random;

public class Bank {
    private Integer id;
    private String name;
    private Integer countOffices;
    private Integer countATM;
    private Integer countEmployee;
    private Integer countClients;
    private Integer rateBank;
    private Integer allMoney;
    private Integer rentalPrice;
    public Bank(Integer id, String name) {
        this.id = id;
        this.name = name;
        Random rand = new Random();
        this.allMoney = rand.nextInt(1000000) + 1;
        this.countATM = 0;
        this.countClients = 0;
        this.countEmployee = 0;
        this.countOffices = 0;
        this.rateBank = rand.nextInt(100) + 1;
        this.rentalPrice = rand.nextInt(20 - (int)(rateBank / 5.0));
    }
    protected Bank(Bank bank){
        setAllMoney(bank.getAllMoney());
        setCountATM(bank.getCountATM());
        setCountClients(bank.getCountClients());
        setCountEmployee(bank.getCountEmployee());
        setRateBank(bank.getRateBank());
        setCountOffices(bank.getCountOffices());
        setName(bank.getName());
        setRentalPrice(bank.getRentalPrice());
        setId(bank.getId());
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCountOffices(Integer countOffices){
        this.countOffices = countOffices;
    }

    public void setRateBank(Integer rateBank){
        this.rateBank = rateBank;
    }

    public void setCountATM(Integer countATM){
        this.countATM = countATM;
    }

    public void setCountEmployee(Integer countEmployee){
        this.countEmployee = countEmployee;
    }

    public void setCountClients(Integer countClients){
        this.countClients = countClients;
    }

    public void setAllMoney(Integer allMoney){
        this.allMoney = allMoney;
    }

    public void setRentalPrice(Integer rentalPrice){
        this.rentalPrice = rentalPrice;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getCountOffices(){
        return this.countOffices;
    }

    public Integer getRateBank(){
        return this.rateBank;
    }

    public Integer getCountATM(){
        return this.countATM;
    }

    public Integer getCountEmployee(){
        return this.countEmployee;
    }

    public Integer getCountClients(){
        return this.countClients;
    }

    public Integer getAllMoney(){
        return this.allMoney;
    }

    public Integer getRentalPrice(){
        return this.rentalPrice;
    }

    public void deliteBank() {
        this.id = null;
        this.name = null;
        this.allMoney = null;
        this.countATM = null;
        this.countClients = null;
        this.countEmployee = null;
        this.countOffices = null;
        this.rateBank = null;
        this.rentalPrice = null;
    }
    public void display(){
        System.out.println("Bank");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("name = " + getName());
        System.out.println("allMoney = " + Integer.toString(getAllMoney()));
        System.out.println("countATM = " + Integer.toString(getCountATM()));
        System.out.println("countClients = " + Integer.toString(getCountClients()));
        System.out.println("countEmployee = " + Integer.toString(getCountEmployee()));
        System.out.println("countOffices = " + Integer.toString(getCountOffices()));
        System.out.println("rateBank = " + Integer.toString(getRateBank()));
        System.out.println("rentalPrice = " + Integer.toString(getRentalPrice()));
        System.out.println("");
    }
}
