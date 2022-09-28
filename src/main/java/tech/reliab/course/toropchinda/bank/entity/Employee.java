package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Employee extends Person {
//    private int id;
//    private Date birthday;
//    private String post;
//    private short salary;

    private Bank bank;
    private Boolean offlineWork;
    private BankOffice bankOffice;
    private Boolean creditAble;

    public Employee(int id, String name, String surname, String patronymic, Date birthday, String post, int salary, Bank bank, BankOffice bankOffice) {
        super(id, name, surname, patronymic, birthday, post, salary);
        this.bank = bank;
        this.bankOffice = bankOffice;
        this.creditAble = true;
        this.offlineWork = true;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public void setCreditAble(Boolean creditAble) {
        this.creditAble = creditAble;
    }

    public void setOfflineWork(Boolean offlineWork) {
        this.offlineWork = offlineWork;
    }

    public Bank getBank() {
        return bank;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public Boolean getCreditAble() {
        return creditAble;
    }

    public Boolean getOfflineWork() {
        return offlineWork;
    }
}
