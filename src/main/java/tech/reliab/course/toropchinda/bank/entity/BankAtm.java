package src.main.java.tech.reliab.course.toropchinda.bank.entity;

public class BankAtm extends Bank{
    private Integer id;
    private String name;
//    private String address;
//    private short status;
//    private Bank bank;
    private Employee employeeATM;
    private String location;
    private Integer status; //1 - work,2 - not work, 3 - not maoney
    private Boolean moneyPutAble;
    private Boolean moneyGetAble;
    private Integer allMoney;
    private Integer ATMServiceCost;

//    public BankAtm(int countOffices, int countEmployee, int countClients, int rateBank, int rentalPrice, Employee employeeATM) {
//        super(countOffices, countEmployee, countClients, rateBank, rentalPrice);
//        this.ATMServiceCost = 1000;
//        this.employeeATM = employeeATM;
//    }

    public BankAtm(Bank bank, Integer id, String name, Employee employeeATM, Integer ATMServiceCost, Integer status,
                   String location, Boolean moneyPutAble, Boolean moneyGetAble) {
        super(bank);
        this.id = id;
        this.name = name;
        this.ATMServiceCost = ATMServiceCost;
        this.employeeATM = employeeATM;
        this.status = status;
        this.location = location;
        this.moneyPutAble = moneyPutAble;
        this.moneyGetAble = moneyGetAble;
        this.allMoney = getAllMoney()/(bank.getCountATM()+1);
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public void setAllMoney(Integer allMoney) {
        this.allMoney = allMoney;
    }

    public void setMoneyGetAble(Boolean moneyGetAble) {
        this.moneyGetAble = moneyGetAble;
    }

    public void setMoneyPutAble(Boolean moneyPutAble) {
        this.moneyPutAble = moneyPutAble;
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

    public Integer setATMServiceCost(){
        return this.ATMServiceCost;
    }

    public Employee setEmployeeATM(){
        return this.employeeATM;
    }

    public Employee getEmployeeATM() {
        return employeeATM;
    }

    public Integer getATMServiceCost() {
        return ATMServiceCost;
    }

    public Integer getAtmStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Integer getStatus() {
        return status;
    }

    public Boolean getMoneyGetAble() {
        return moneyGetAble;
    }

    public Boolean getMoneyPutAble() {
        return moneyPutAble;
    }

    @Override
    public Integer getAllMoney() {
        return allMoney;
    }

    public void deliteBankAtm(){
        super.deliteBank();
        this.id = null;
        this.name = null;
        this.ATMServiceCost = null;
        this.employeeATM = null;
        this.status = null;
        this.location = null;
        this.moneyPutAble = null;
        this.moneyGetAble = null;
        this.allMoney = null;
    }

    public void display(){
        System.out.println("BankAtm");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("name = " + getName());
        System.out.println("allMoney = " + Integer.toString(getAllMoney()));
        System.out.println("ATMServiceCost = " + Integer.toString(getATMServiceCost()));
        System.out.println("id employeeATM = " + Integer.toString(this.employeeATM.getId()));
        System.out.println("status = " + Integer.toString(getStatus()));
        System.out.println("location = " + getLocation());
        System.out.println("moneyPutAble = " + Boolean.toString(getMoneyPutAble()));
        System.out.println("moneyGetAble = " + Boolean.toString(getMoneyGetAble()));
        System.out.println("allMoney = " + Integer.toString(getAllMoney()));
        System.out.println("");
    }
}
