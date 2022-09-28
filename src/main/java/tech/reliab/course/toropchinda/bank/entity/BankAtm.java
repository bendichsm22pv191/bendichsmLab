package src.main.java.tech.reliab.course.toropchinda.bank.entity;

public class BankAtm extends BankOffice{
//    private int id;
//    private String name;
//    private String address;
//    private short status;
//    private Bank bank;
    private Employee employeeATM;
//    private Boolean moneyPutAble;
//    private Boolean moneyGetAble;
//    private int allMoney;
    private int ATMServiceCost;

//    public BankAtm(int countOffices, int countEmployee, int countClients, int rateBank, int rentalPrice, Employee employeeATM) {
//        super(countOffices, countEmployee, countClients, rateBank, rentalPrice);
//        this.ATMServiceCost = 1000;
//        this.employeeATM = employeeATM;
//    }

    public BankAtm(BankOffice bankOffice, Employee employeeATM, int ATMServiceCost) {
        super(bankOffice);
        this.ATMServiceCost = ATMServiceCost;
        this.employeeATM = employeeATM;
    }




    public void setATMServiceCost(int ATMServiceCost){
        this.ATMServiceCost = ATMServiceCost;
    }

    public void setEmployeeATM(Employee employeeATM){
        this.employeeATM = employeeATM;
    }

    public int setATMServiceCost(){
        return this.ATMServiceCost;
    }

    public Employee setEmployeeATM(){
        return this.employeeATM;
    }


}
