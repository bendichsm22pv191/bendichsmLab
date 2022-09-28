package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import javax.xml.crypto.Data;

public class PaymentAccount extends User {
    private int id;
    private User user;
    private String bankName;
    private int money;
    public PaymentAccount(User user, int id, String bankName, int money){
        super();
        this.id = id;
        this.money = money;
        this.bankName = bankName;
        this.user = user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
