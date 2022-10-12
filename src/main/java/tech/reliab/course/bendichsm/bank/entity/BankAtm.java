package src.main.java.tech.reliab.course.bendichsm.bank.entity;

import src.main.java.tech.reliab.course.bendichsm.bank.utils.BankAtmStatusEnum;

public class BankAtm{
    private Integer id;
    private String name;
    private String address;
    private Bank bank;
    private Employee employeeATM;
    private String location;
    private BankAtmStatusEnum status; //1 - work,2 - not work, 3 - not money
    public Boolean isMoneyGetAble;
    private Boolean isMoneyPutAble;
    private Integer allMoney;
    private Integer ATMServiceCost;

    public BankAtm(Integer id, String name, String address, Bank bank, Employee employeeATM, Integer ATMServiceCost, BankAtmStatusEnum status,
                   String location, Boolean isMoneyPutAble, Boolean isMoneyGetAble) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bank = bank;
        this.ATMServiceCost = ATMServiceCost;
        this.employeeATM = employeeATM;
        this.status = status;
        this.location = location;
        this.isMoneyPutAble = isMoneyPutAble;
        this.isMoneyGetAble = isMoneyGetAble;
        this.allMoney = bank.getAllMoney()/(bank.getCountATM()+1);
    }

    public void update(BankAtm bankAtm){
        setAddress(bankAtm.getAddress());
        setBank(bankAtm.getBank());
        setName(bankAtm.getName());
        setId(bankAtm.getId());
        setEmployeeATM(bankAtm.getEmployeeATM());
        setStatus(bankAtm.getStatus());
        setAllMoney(bankAtm.getAllMoney());
        setATMServiceCost(bankAtm.getATMServiceCost());
        setMoneyGetAble(bankAtm.getMoneyGetAble());
        setMoneyPutAble(bankAtm.getMoneyPutAble());
        setLocation(bankAtm.getLocation());
    }

    public void setMoneyPutAble(Boolean moneyPutAble) {
        isMoneyPutAble = moneyPutAble;
    }

    public void setMoneyGetAble(Boolean moneyGetAble) {
        isMoneyGetAble = moneyGetAble;
    }

    public String getAddress() {
        return address;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(BankAtmStatusEnum status) {
        this.status = status;
    }

    public void setAllMoney(Integer allMoney) {
        this.allMoney = allMoney;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setATMServiceCost(Integer ATMServiceCost){
        this.ATMServiceCost = ATMServiceCost;
    }

    public void setEmployeeATM(Employee employeeATM){
        this.employeeATM = employeeATM;
    }


    public Employee getEmployeeATM() {
        return employeeATM;
    }

    public Integer getATMServiceCost() {
        return ATMServiceCost;
    }

    public BankAtmStatusEnum getAtmStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public BankAtmStatusEnum getStatus() {
        return status;
    }

    public Integer getAllMoney() {
        return allMoney;
    }

    public Bank getBank() {
        return bank;
    }

    public Boolean getMoneyPutAble() {
        return isMoneyPutAble;
    }

    public Boolean getMoneyGetAble() {
        return isMoneyGetAble;
    }


    @Override
    public String toString() {
        return "BankAtm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bank=" + bank +
                ", employeeATM=" + employeeATM +
                ", location='" + location + '\'' +
                ", status=" + status +
                ", isMoneyGetAble=" + isMoneyGetAble +
                ", isMoneyPutAble=" + isMoneyPutAble +
                ", allMoney=" + allMoney +
                ", ATMServiceCost=" + ATMServiceCost +
                '}';
    }
}
