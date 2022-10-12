package src.main.java.tech.reliab.course.bendichsm.bank.entity;

public class Employee extends Person {
    private Integer id;
    private Bank bank;
    private Boolean isOfflineWork;
    private BankOffice bankOffice;
    private Boolean isCreditAble;

    public Employee(Person person, Integer id, Bank bank, BankOffice bankOffice) {
        super(person.getId(), person.getName(), person.getSurname(), person.getPatronymic(), person.getBirthday(), person.getPost());
        this.id = id;
        this.bank = bank;
        this.bankOffice = bankOffice;
        this.isCreditAble = true;
        this.isOfflineWork = true;
    }
    Person getPerson(){
        return new Person(this.getId(), this.getName(), this.getSurname(), this.getPatronymic(),
                this.getBirthday(), this.getPost());
    }

    private void update(Employee employee){
        setBank(employee.getBank());
        setId(employee.getId());
        setName(employee.getName());
        setSurname(employee.getSurname());
        setPatronymic(employee.getPatronymic());
        setBirthday(employee.getBirthday());
        setPost(employee.getPost());
        setSalary(employee.getSalary());
        setBankOffice(employee.getBankOffice());
        setCreditAble(employee.getCreditAble());
        setOfflineWork(getOfflineWork());
    }


    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public void setCreditAble(Boolean creditAble) {
        isCreditAble = creditAble;
    }

    public void setOfflineWork(Boolean offlineWork) {
        isOfflineWork = offlineWork;
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
        return isCreditAble;
    }

    public Boolean getOfflineWork() {
        return isOfflineWork;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", bank=" + bank +
                ", isOfflineWork=" + isOfflineWork +
                ", bankOffice=" + bankOffice +
                ", isCreditAble=" + isCreditAble +
                '}';
    }
}
