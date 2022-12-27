package src.main.java.tech.reliab.course.bendichsm.bank.entity;

import src.main.java.tech.reliab.course.bendichsm.bank.utils.BankOfficeStatusEnum;

public class BankOffice{
    private Integer id;
    private String name;
    private String address;
    private BankOfficeStatusEnum status;
    private Boolean isCreditAble;
    private Boolean isAtmPutAble;
    public Boolean isMoneyGetAble;
    private Boolean isMoneyPutAble;
    private Integer quantityATM;
    private Integer allOfficeMoney;
    private Integer rentalPrice;

    public BankOffice(Integer id, String name, String address, BankOfficeStatusEnum status, Boolean isAtmPutAble,
                      Boolean isCreditAble, Boolean isMoneyPutAble, Boolean isMoneyGetAble, Integer quantityATM,
                      Integer allOfficeMoney, Integer rentalPrice) {
        this.id = id;
        this.address = address;
        this.isAtmPutAble = isAtmPutAble;
        this.isCreditAble = isCreditAble;
        this.isMoneyPutAble = isMoneyPutAble;
        this.isMoneyGetAble = isMoneyGetAble;
        this.status = status;
        this.name = name;
        this.quantityATM = quantityATM;
        this.allOfficeMoney = allOfficeMoney;
        this.rentalPrice = rentalPrice;
    }

    public void setMoneyGetAble(Boolean moneyGetAble) {
        isMoneyGetAble = moneyGetAble;
    }

    public void setMoneyPutAble(Boolean moneyPutAble) {
        isMoneyPutAble = moneyPutAble;
    }

    public void setCreditAble(Boolean creditAble) {
        isCreditAble = creditAble;
    }

    public void setAllOfficeMoney(Integer allOfficeMoney) {
        this.allOfficeMoney = allOfficeMoney;
    }

    public void setAtmPutAble(Boolean atmPutAble) {
        isAtmPutAble = atmPutAble;
    }

    public void setRentalPrice(Integer rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityATM(Integer quantityATM) {
        this.quantityATM = quantityATM;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setStatus(BankOfficeStatusEnum status){
        this.status = status;
    }

    public String getAddress(){
        return this.address;
    }

    public BankOfficeStatusEnum getStatus(){
        return this.status;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantityATM() {
        return quantityATM;
    }

    public Boolean getMoneyGetAble() {
        return isMoneyGetAble;
    }

    public Boolean getMoneyPutAble() {
        return isMoneyPutAble;
    }

    public Boolean getCreditAble() {
        return isCreditAble;
    }

    public Boolean getAtmPutAble() {
        return isAtmPutAble;
    }

    public Integer getAllOfficeMoney() {
        return allOfficeMoney;
    }

    public Integer getRentalPrice() {
        return rentalPrice;
    }

    @Override
    public String toString() {
        return "BankOffice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", isCreditAble=" + isCreditAble +
                ", isAtmPutAble=" + isAtmPutAble +
                ", isMoneyGetAble=" + isMoneyGetAble +
                ", isMoneyPutAble=" + isMoneyPutAble +
                ", quantityATM=" + quantityATM +
                ", allOfficeMoney=" + allOfficeMoney +
                ", rentalPrice=" + rentalPrice +
                '}';
    }
}
