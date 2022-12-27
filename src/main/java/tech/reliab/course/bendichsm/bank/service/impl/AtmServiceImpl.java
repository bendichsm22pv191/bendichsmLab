package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.Bank;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.BankAtm;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.PaymentAccount;
import src.main.java.tech.reliab.course.bendichsm.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    /**
     * put money into ATM machine, if successful - true, else - false
     */
    @Override
    public Boolean putMoney(BankAtm bankAtm, PaymentAccount paymentAccount, Integer money) {
        if(bankAtm.getMoneyPutAble()) {
            bankAtm.setAllMoney(bankAtm.getAllMoney() + money);
            paymentAccount.setMoney(paymentAccount.getMoney() + money);
            return true;
        }
        return false;
    }
    /**
     * get money from the ATM machine, if successful - true, else - false
     */
    @Override
    public Boolean getMoney(BankAtm bankAtm, PaymentAccount paymentAccount, Integer money) {
        if(bankAtm.getMoneyGetAble() && (bankAtm.getAllMoney() > money) && paymentAccount.getMoney() > money) {
            bankAtm.setAllMoney(bankAtm.getAllMoney() - money);
            paymentAccount.setMoney(paymentAccount.getMoney() - money);
            return true;
        }
        return false;
    }
    @Override
    public void update(BankAtm bankAtmUse, BankAtm bankAtmAppdate){
        bankAtmAppdate.setAddress(bankAtmUse.getAddress());
        bankAtmAppdate.setBank(bankAtmUse.getBank());
        bankAtmAppdate.setName(bankAtmUse.getName());
        bankAtmAppdate.setId(bankAtmUse.getId());
        bankAtmAppdate.setEmployeeATM(bankAtmUse.getEmployeeATM());
        bankAtmAppdate.setStatus(bankAtmUse.getStatus());
        bankAtmAppdate.setAllMoney(bankAtmUse.getAllMoney());
        bankAtmAppdate.setATMServiceCost(bankAtmUse.getATMServiceCost());
        bankAtmAppdate.setMoneyGetAble(bankAtmUse.getMoneyGetAble());
        bankAtmAppdate.setMoneyPutAble(bankAtmUse.getMoneyPutAble());
        bankAtmAppdate.setLocation(bankAtmUse.getLocation());
    }
    @Override
    public void delite(BankAtm bankAtm){
        bankAtm = null;
    }
}
