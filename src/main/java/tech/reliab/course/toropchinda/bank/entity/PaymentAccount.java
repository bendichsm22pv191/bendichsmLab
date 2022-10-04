package src.main.java.tech.reliab.course.toropchinda.bank.entity;


import src.main.java.tech.reliab.course.toropchinda.bank.entity.Data;

public class PaymentAccount extends User {
    private Integer id;
    private User user;
    private String bankName;
    private Integer money;
    public PaymentAccount(User user, Integer id, String bankName, Integer money){
        super(user.getPerson(), user.getId());
        this.id = id;
        this.money = money;
        this.bankName = bankName;
        this.user = user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getBankName() {
        return bankName;
    }

    public Integer getMoney() {
        return money;
    }

    public User getUser() {
        return user;
    }

    public void delitePaymentAccount(){
        super.deliteUser();
        this.id = null;
        this.money = null;
        this.bankName = null;
        this.user = null;
    }

    public void display(){
        System.out.println("PaymentAccount");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("money = " + Integer.toString(getMoney()));
        System.out.println("bankName = " + getBankName());
        System.out.println("id user = " + Integer.toString(getUser().getId()));
        System.out.println("");
    }
}
