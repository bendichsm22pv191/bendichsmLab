package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.Employee;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.PaymentAccount;
import src.main.java.tech.reliab.course.bendichsm.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    /**
     * Changes pay in Payment Account
     */
    @Override
    public void changePay(PaymentAccount paymentAccount, String bankName, Integer money) {
        paymentAccount.setBankName(bankName);
        paymentAccount.setMoney(money);
    }
    @Override
    public void update(PaymentAccount paymentAccountUse, PaymentAccount paymentAccountAppdate){
        paymentAccountAppdate.setMoney(paymentAccountUse.getMoney());
        paymentAccountAppdate.setId(paymentAccountUse.getId());
        paymentAccountAppdate.setUser(paymentAccountUse.getUser());
        paymentAccountAppdate.setBankName(paymentAccountUse.getBankName());
    }
    @Override
    public void delite(PaymentAccount paymentAccount){
        paymentAccount = null;
    }
}
