package src.main.java.tech.reliab.course.bendichsm.bank.entity;


import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class User extends Person {
    private Integer id;
    private Bank banks;
    private CreditAccount creditAccounts;
    private PaymentAccount paymentAccounts;
    private Integer interestRate;
    public User(Person person, Integer id){
        super(person.getId(), person.getName(),person.getSurname(), person.getPatronymic(), person.getBirthday(), person.getPost());
        this.id = id;
        this.banks = null;
        this.creditAccounts = null;
        this.paymentAccounts = null;
        Random rand = new Random();
        int salary = getSalary();
        if (salary<2500) {
            this.interestRate = rand.nextInt(25) + 1;
        } else if(salary<5000) {
            this.interestRate = rand.nextInt(50) + 1;
        } else if(salary<7500) {
            this.interestRate = rand.nextInt(75) + 1;
        } else if(salary<10000) {
            this.interestRate = rand.nextInt(100) + 1;
        }
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public void setBirthday(Date birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPatronymic(String patronymic) {
        super.setPatronymic(patronymic);
    }

    @Override
    public void setPost(String post) {
        super.setPost(post);
    }

    @Override
    public void setSalary(Integer salary) {
        super.setSalary(salary);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public void setBanks(Bank banks) {
        this.banks = banks;
    }

    public void setCreditAccounts(CreditAccount creditAccounts) {
        this.creditAccounts = creditAccounts;
    }

    public void setPaymentAccounts(PaymentAccount paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }

    public Bank getBanks() {
        return banks;
    }

    public CreditAccount getCreditAccounts() {
        return creditAccounts;
    }

    public PaymentAccount getPaymentAccounts() {
        return paymentAccounts;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    @Override
    public Date getBirthday() {
        return super.getBirthday();
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public Integer getSalary() {
        return super.getSalary();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPatronymic() {
        return super.getPatronymic();
    }

    @Override
    public String getPost() {
        return super.getPost();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    public void update(User user){
        setBanks(user.getBanks());
        setName(user.getName());
        setId(user.getInterestRate());
        setBirthday(user.getBirthday());
        setSurname(user.getSurname());
        setPatronymic(user.getPatronymic());
        setCreditAccounts(user.getCreditAccounts());
        setPaymentAccounts(user.getPaymentAccounts());
        setPost(user.getPost());
        setSalary(user.getSalary());
        setInterestRate(user.getInterestRate());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", banks=" + banks +
                ", creditAccounts=" + creditAccounts +
                ", paymentAccounts=" + paymentAccounts +
                ", interestRate=" + interestRate +
                '}';
    }
}
