package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class User extends Person {
    private Bank[] banks;
    private CreditAccount[] creditAccounts;
    private PaymentAccount[] paymentAccounts;
    private short interestRate;
    public User(){
        super(1, "Петр","Петров","Петрович", new Date(), "Уборщик", 15000);
        this.banks = null;
        this.creditAccounts = null;
        this.paymentAccounts = null;
        this.interestRate = 100;
    }

    public void setBanks(Bank[] banks) {
        this.banks = banks;
    }

    public void setCreditAccounts(CreditAccount[] creditAccounts) {
        this.creditAccounts = creditAccounts;
    }

    public void setInterestRate(short interestRate) {
        this.interestRate = interestRate;
    }

    public void setPaymentAccounts(PaymentAccount[] paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }

    public Bank[] getBanks() {
        return banks;
    }

    public CreditAccount[] getCreditAccounts() {
        return creditAccounts;
    }

    public PaymentAccount[] getPaymentAccounts() {
        return paymentAccounts;
    }

    public short getInterestRate() {
        return interestRate;
    }
}
