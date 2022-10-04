package src.main.java.tech.reliab.course.toropchinda.bank.entity;


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

    Person getPerson(){
        return new Person(this.getId(), this.getName(), this.getSurname(), this.getPatronymic(),
                this.getBirthday(), this.getPost());
    }




    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public void setBirthday(Data birthday) {
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
    public Data getBirthday() {
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

    public void deliteUser(){
        delitePerson();
        this.id = null;
        this.banks = null;
        this.creditAccounts = null;
        this.paymentAccounts = null;
        this.interestRate = null;
    }

    public void display(){
        System.out.println("User");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("id banks = " + (getBanks() == null?  "empty" : Integer.toString(getBanks().getId())));
        System.out.println("id creditAccounts = " + (getCreditAccounts() == null?  "empty" : Integer.toString(getCreditAccounts().getId())));
        System.out.println("id paymentAccounts = " + (getPaymentAccounts() == null?  "empty" : Integer.toString(getPaymentAccounts().getId())));
//        System.out.println("id creditAccounts = " + Integer.toString(getCreditAccounts().getId()));
//        System.out.println("id paymentAccounts = " + Integer.toString(getPaymentAccounts().getId()));
//        System.out.println("interestRate = " + Integer.toString(getInterestRate()));
        System.out.println("");
    }
}
