package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

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
}
