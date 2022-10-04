package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Employee extends Person {
    private Integer id;
    private Bank bank;
    private Boolean offlineWork;
    private BankOffice bankOffice;
    private Boolean creditAble;

    public Employee(Person person, Integer id, Bank bank, BankOffice bankOffice) {
        super(person.getId(), person.getName(), person.getSurname(), person.getPatronymic(), person.getBirthday(), person.getPost());
        this.id = id;
        this.bank = bank;
        this.bankOffice = bankOffice;
        this.creditAble = true;
        this.offlineWork = true;
    }
    Person getPerson(){
        return new Person(this.getId(), this.getName(), this.getSurname(), this.getPatronymic(),
                this.getBirthday(), this.getPost());
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

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public Integer getId() {
        return id;
    }


    public void deliteEmployee() {
        super.delitePerson();
        this.id = null;
        this.bank = null;
        this.bankOffice = null;
        this.creditAble = null;
        this.offlineWork = null;
    }

    public void display(){
        System.out.println("Employee");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("id bank = " + Integer.toString(getBank().getId()));
        System.out.println("id bankOffice = " + Integer.toString(getBankOffice().getId()));
        System.out.println("creditAble = " + Boolean.toString(getCreditAble()));
        System.out.println("offlineWork = " + Boolean.toString(getOfflineWork()));
        System.out.println("");
    }
}
