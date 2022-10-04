package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import src.main.java.tech.reliab.course.toropchinda.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {

    @Override
    public void changePay(PaymentAccount paymentAccount, String bankName, Integer money) {
        paymentAccount.setBankName(bankName);
        paymentAccount.setMoney(money);
    }
}
