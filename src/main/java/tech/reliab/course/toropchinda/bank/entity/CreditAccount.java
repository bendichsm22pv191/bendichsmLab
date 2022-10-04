package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Data;
import java.io.DataOutput;


public class CreditAccount extends User {
    private Integer id;
    private String bankName;
    private Data beginCredit;
    private Data endCredit;
    private Integer countMonthCredit;
    private Integer sumCredit;
    private Integer monthPayment;
    private Integer interestRate;//% stavka
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount(User user, String bankName, Data beginCredit, Data endCredit, Integer sumCredit,
                         Integer interestRate, Employee employee, PaymentAccount paymentAccount, Integer id){
        super(user.getPerson(), user.getId());
        this.bankName = bankName;
        this.id = id;
        this.beginCredit = beginCredit;
        this.employee = employee;
        this.endCredit = endCredit;
        this.sumCredit = sumCredit;
        this.interestRate = interestRate;
        this.paymentAccount = paymentAccount;
        this.countMonthCredit = findCountMonthCredit();
        this.monthPayment = findMonthPayment();
    }

    protected Integer findCountMonthCredit(){
        return (this.endCredit.getYear() - this.beginCredit.getYear()) * 12 +
                this.beginCredit.getMonth() - this.endCredit.getMonth();

    }

    protected Integer findMonthPayment(){
        return getSumCredit()/getCountMonthCredit();
    }


    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBeginCredit(Data beginCredit) {
        this.beginCredit = beginCredit;
    }

    public void setCountMonthCredit(Integer countMonthCredit) {
        this.countMonthCredit = countMonthCredit;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEndCredit(Data endCredit) {
        this.endCredit = endCredit;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMonthPayment(Integer monthPayment) {
        this.monthPayment = monthPayment;
    }

    public void setPaymentAccount(Integer score) {
        this.paymentAccount = paymentAccount;
    }

    public void setSumCredit(Integer sumCredit) {
        this.sumCredit = sumCredit;
    }

    @Override
    public Integer getInterestRate() {
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

    public Integer getCountMonthCredit() {
        return countMonthCredit;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMonthPayment() {
        return monthPayment;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public Integer getSumCredit() {
        return sumCredit;
    }

    public String getBankName() {
        return bankName;
    }

    public void deliteCreditAccount() {
        super.deliteUser();
        this.bankName = null;
        this.id = null;
        this.beginCredit = null;
        this.countMonthCredit = null;
        this.employee = null;
        this.endCredit = null;
        this.sumCredit = null;
        this.monthPayment = null;
        this.interestRate = null;
        this.paymentAccount = null;
    }

    public void display(){
        System.out.println("CreditAccount");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("bankName = " + getBankName());
        System.out.println("beginCredit = " + getBeginCredit().Data());
        System.out.println("endCredit = " + getEndCredit().Data());
        System.out.println("countMonthCredit = " + Integer.toString(getCountMonthCredit()));
        System.out.println("id employee = " + Integer.toString(getEmployee().getId()));
        System.out.println("sumCredit = " + Integer.toString(getSumCredit()));
        System.out.println("monthPayment = " + Integer.toString(getMonthPayment()));
        System.out.println("interestRate = " + Integer.toString(getInterestRate()));
        System.out.println("id score = " + Integer.toString(getPaymentAccount().getId()));
        System.out.println("");
    }
}
