package src.main.java.tech.reliab.course.toropchinda.bank.entity;

public class BankOffice extends Bank {
    private Integer id;
    private String name;
    private String address;
    private Boolean status;
    private Boolean putATMable;
    public Boolean getATMable;
    private Boolean getCreditAble;
    private Boolean moneyPutAble;
    private Boolean moneyGetAble;
    private Integer quantityATM;

//    public BankOffice(int countOffices, int countEmployee, int countClients, int rateBank, int rentalPrice) {
//        super(0,"Super Office", countOffices, 59, countEmployee, countClients, rateBank, 10000, rentalPrice);
//        this.address = "blabla";
//        this.getCreditAble = true;
//        this.moneyGetAble = true;
//        this.putATMable = true;
//        this.moneyPutAble = true;
//        this.status = true;
//    }

    public BankOffice(Bank bank, Integer id, String address, Boolean status, Boolean putATMable, Boolean getATMable,
                      Boolean getCreditAble, Boolean moneyPutAble, Boolean moneyGetAble, String name) {
        super(bank);
        this.id = id;
        this.address = address;
        this.getCreditAble = getCreditAble;
        this.moneyGetAble = moneyGetAble;
        this.putATMable = putATMable;
        this.getATMable = getATMable;
        this.moneyPutAble = moneyPutAble;
        this.status = status;
        this.name = name;
        this.quantityATM = bank.getCountATM();
    }
    protected BankOffice(BankOffice bankOffice, Bank bank){
        super(bank);
        setId(bankOffice.getId());
        setAddress(bankOffice.getAddress());
        setGetCreditAble(bankOffice.getGetCreditAble());
        setMoneyGetAble(bankOffice.getMoneyGetAble());
        setMoneyPutAble(bankOffice.getMoneyPutAble());
        setPutATMable(bankOffice.getPutATMable());
        setGetATMable(bankOffice.getGetATMable());
        setStatus(bankOffice.getStatus());
        setName(bankOffice.getName());
        setQuantityATM(bankOffice.getQuantityATM());
    }

    public void setGetATMable(Boolean getATMable) {
        this.getATMable = getATMable;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityATM(Integer quantityATM) {
        this.quantityATM = quantityATM;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public Integer getQuantityATM() {
        return quantityATM;
    }

    public Boolean getGetATMable() {
        return getATMable;
    }

    public void deliteBankOffice(){
        super.deliteBank();
        this.id = null;
        this.address = null;
        this.getCreditAble = null;
        this.moneyGetAble = null;
        this.putATMable = null;
        this.getATMable = null;
        this.moneyPutAble = null;
        this.status = null;
        this.name = null;
        this.quantityATM = null;
    }

    public void display(){
        System.out.println("BankOffice");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("address = " + getAddress());
        System.out.println("getCreditAble = " + Boolean.toString(getGetCreditAble()));
        System.out.println("moneyGetAble = " + Boolean.toString(getMoneyGetAble()));
        System.out.println("putATMable = " + Boolean.toString(getPutATMable()));
        System.out.println("getATMable = " + Boolean.toString(getGetATMable()));
        System.out.println("moneyPutAble = " + Boolean.toString(getMoneyPutAble()));
        System.out.println("status = " + Boolean.toString(getStatus()));
        System.out.println("quantityATM = " + Integer.toString(getQuantityATM()));
        System.out.println("");
    }


}
