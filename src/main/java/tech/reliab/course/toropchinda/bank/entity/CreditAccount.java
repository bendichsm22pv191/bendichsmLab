package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class CreditAccount extends User {
    private int id;
    private User userAccount;
    private String bankName;
    private Data beginCredit;
    private Data endCredit;
    private int countMonthCredit;
    private int sumCredit;
    private int monthPayment;
    private short interestRate;
    private Employee employee;
    private int score;

    public CreditAccount(String bankName, Data beginCredit, Data endCredit, int countMonthCredit,
    int sumCredit, int monthPayment, short interestRate, Employee employee, int score, User userAccount, int id){
        super();
        this.userAccount = userAccount;
        this.bankName = bankName;
        this.id = id;
        this.beginCredit = beginCredit;
        this.countMonthCredit = countMonthCredit;
        this.employee = employee;
        this.endCredit = endCredit;
        this.sumCredit = sumCredit;
        this.monthPayment = monthPayment;
        this.interestRate = interestRate;
        this.score = score;
    }

    @Override
    public void setInterestRate(short interestRate) {
        this.interestRate = interestRate;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBeginCredit(Data beginCredit) {
        this.beginCredit = beginCredit;
    }

    public void setCountMonthCredit(int countMonthCredit) {
        this.countMonthCredit = countMonthCredit;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEndCredit(Data endCredit) {
        this.endCredit = endCredit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMonthPayment(int monthPayment) {
        this.monthPayment = monthPayment;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSumCredit(int sumCredit) {
        this.sumCredit = sumCredit;
    }

    public void setUserAccount(User userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public short getInterestRate() {
        return interestRate;
    }

    public Data getBeginCredit() {
        return beginCredit;
    }

    public Data getEndCredit() {
        return endCredit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getCountMonthCredit() {
        return countMonthCredit;
    }

    public int getId() {
        return id;
    }

    public int getMonthPayment() {
        return monthPayment;
    }

    public int getScore() {
        return score;
    }

    public int getSumCredit() {
        return sumCredit;
    }

    public String getBankName() {
        return bankName;
    }

    public User getUserAccount() {
        return userAccount;
    }
}
