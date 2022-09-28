package src.main.java.tech.reliab.course.toropchinda.bank.entity;

public class BankOffice extends Bank {
    private String address;
    private Boolean status;
    private Boolean putATMable;
    private Boolean getCreditAble;
    private Boolean moneyPutAble;
    private Boolean moneyGetAble;

//    public BankOffice(int countOffices, int countEmployee, int countClients, int rateBank, int rentalPrice) {
//        super(0,"Super Office", countOffices, 59, countEmployee, countClients, rateBank, 10000, rentalPrice);
//        this.address = "blabla";
//        this.getCreditAble = true;
//        this.moneyGetAble = true;
//        this.putATMable = true;
//        this.moneyPutAble = true;
//        this.status = true;
//    }

    public BankOffice(Bank bank) {
        super(bank);
        this.address = "blabla";
        this.getCreditAble = true;
        this.moneyGetAble = true;
        this.putATMable = true;
        this.moneyPutAble = true;
        this.status = true;
    }
//    protected BankOffice(BankOffice bankOffice){
//        super();
//        setId(bankOffice.getId());
//        setAddress(bankOffice.getAddress());
//        setGetCreditAble(bankOffice.getGetCreditAble());
//        setMoneyGetAble(bankOffice.getMoneyGetAble());
//        setMoneyPutAble(bankOffice.getMoneyPutAble());
//        setPutATMable(bankOffice.getPutATMable());
//        setStatus(bankOffice.getStatus());
//        setName(bankOffice.getName());
//    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    public void setPutATMable(Boolean putATMable){
        this.putATMable = putATMable;
    }

    public void setGetCreditAble(Boolean getCreditAble){
        this.getCreditAble = getCreditAble;
    }

    public void setMoneyPutAble(Boolean moneyPutAble){
        this.moneyPutAble = moneyPutAble;
    }

    public void setMoneyGetAble(Boolean moneyGetAble){
        this.moneyGetAble = moneyGetAble;
    }
    public String getAddress(){
        return this.address;
    }

    public Boolean getStatus(){
        return this.status;
    }

    public Boolean getPutATMable(){
        return this.putATMable;
    }

    public Boolean getGetCreditAble(){
        return this.getCreditAble;
    }

    public Boolean getMoneyPutAble(){
        return this.moneyPutAble;
    }

    public Boolean getMoneyGetAble(){
        return this.moneyGetAble;
    }



}
