package src.main.java.tech.reliab.course.bendichsm.bank.entity;


import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class CreditAccount{
    private Integer id;
    private User user;
    private String bankName;
    private Date beginCredit;
    private Date endCredit;
    private Integer countMonthCredit;
    private Integer sumCredit;
    private Integer monthPayment;
    private Integer interestRate;//% stavka
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount(Integer id, User user, String bankName, Date beginCredit, Date endCredit, Integer sumCredit,
                         Integer interestRate, Employee employee, PaymentAccount paymentAccount, Integer countMonthCredit){
        this.id = id;
        this.user = user;
        this.bankName = bankName;
        this.beginCredit = beginCredit;
        this.employee = employee;
        this.endCredit = endCredit;
        this.sumCredit = sumCredit;
        this.interestRate = interestRate;
        this.paymentAccount = paymentAccount;
        this.countMonthCredit = countMonthCredit;
        this.monthPayment = findMonthPayment();
    }

    protected Integer findMonthPayment(){
        return getSumCredit()/getCountMonthCredit();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBeginCredit(Date beginCredit) {
        this.beginCredit = beginCredit;
    }

    public void setCountMonthCredit(Integer countMonthCredit) {
        this.countMonthCredit = countMonthCredit;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEndCredit(Date endCredit) {
        this.endCredit = endCredit;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMonthPayment(Integer monthPayment) {
        this.monthPayment = monthPayment;
    }

    public void setSumCredit(Integer sumCredit) {
        this.sumCredit = sumCredit;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public Date getBeginCredit() {
        return beginCredit;
    }

    public Date getEndCredit() {
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

    public User getUser() {
        return user;
    }


    @Override
    public String toString() {
        return "CreditAccount{" +
                "id=" + id +
                ", user=" + user +
                ", bankName='" + bankName + '\'' +
                ", beginCredit=" + beginCredit +
                ", endCredit=" + endCredit +
                ", countMonthCredit=" + countMonthCredit +
                ", sumCredit=" + sumCredit +
                ", monthPayment=" + monthPayment +
                ", interestRate=" + interestRate +
                ", employee=" + employee +
                ", paymentAccount=" + paymentAccount +
                '}';
    }
}
