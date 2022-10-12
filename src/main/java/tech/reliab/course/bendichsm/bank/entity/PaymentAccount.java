package src.main.java.tech.reliab.course.bendichsm.bank.entity;


public class PaymentAccount{
    private Integer id;
    private User user;
    private String bankName;
    private Integer money;
    public PaymentAccount(User user, Integer id, String bankName, Integer money){
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


    public void update(PaymentAccount paymentAccount){
        setMoney(paymentAccount.getMoney());
        setId(paymentAccount.getId());
        setUser(paymentAccount.getUser());
        setBankName(paymentAccount.getBankName());
    }


    @Override
    public String toString() {
        return "PaymentAccount{" +
                "id=" + id +
                ", user=" + user +
                ", bankName='" + bankName + '\'' +
                ", money=" + money +
                '}';
    }
}
