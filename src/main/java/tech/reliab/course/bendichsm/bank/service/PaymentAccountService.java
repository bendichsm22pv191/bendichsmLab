package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    void changePay(PaymentAccount paymentAccount, String bankName, Integer money);

    void update(PaymentAccount paymentAccountUse, PaymentAccount paymentAccountAppdate);

    void delite(PaymentAccount paymentAccount);
}
