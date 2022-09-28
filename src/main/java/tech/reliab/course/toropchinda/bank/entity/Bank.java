package src.main.java.tech.reliab.course.toropchinda.bank.entity;

public class Bank {
    private int id;
    private String name;
    private int countOffices;
    private int countATM;
    private int countEmployee;
    private int countClients;
    private int rateBank;
    private int allMoney;
    private int rentalPrice;
    public Bank(int id, String name, int countOffices, int countATM, int countEmployee, int countClients, int rateBank, int allMoney, int rentalPrice) {
        this.id = 0;
        this.name = "Super Bank Ever";
        this.allMoney = 1000000000;
        this.countATM = 5000;
        this.rentalPrice = 15;
        this.countClients = 10000;
        this.countEmployee = 500;
        this.countOffices = 50;
        this.rateBank = 20;
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

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCountOffices(int countOffices){
        this.countOffices = countOffices;
    }

    public void setRateBank(int rateBank){
        this.rateBank = rateBank;
    }

    public void setCountATM(int countATM){
        this.countATM = countATM;
    }

    public void setCountEmployee(int countEmployee){
        this.countEmployee = countEmployee;
    }

    public void setCountClients(int countClients){
        this.countClients = countClients;
    }

    public void setAllMoney(int allMoney){
        this.allMoney = allMoney;
    }

    public void setRentalPrice(int rentalPrice){
        this.rentalPrice = rentalPrice;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getCountOffices(){
        return this.countOffices;
    }

    public int getRateBank(){
        return this.rateBank;
    }

    public int getCountATM(){
        return this.countATM;
    }

    public int getCountEmployee(){
        return this.countEmployee;
    }

    public int getCountClients(){
        return this.countClients;
    }

    public int getAllMoney(){
        return this.allMoney;
    }

    public int getRentalPrice(){
        return this.rentalPrice;
    }

}
