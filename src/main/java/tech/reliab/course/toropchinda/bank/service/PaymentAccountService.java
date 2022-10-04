package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    void changePay(PaymentAccount paymentAccount, String bankName, Integer money);
}
