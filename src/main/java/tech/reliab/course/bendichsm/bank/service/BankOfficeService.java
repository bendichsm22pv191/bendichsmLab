package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.*;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.*;

import java.util.Calendar;
import java.util.Date;


public interface BankOfficeService {
    Boolean plusBankOfficeATM(BankOffice bankOffice, Integer quantityATM);

    CreditAccount getCredit(BankOffice bankOffice, Integer id, User user, String bankName, Date beginCredit,
                            Date endCredit, Integer sumCredit, Integer interestRate, Employee employee,
                            PaymentAccount paymentAccount, Integer countMonthCredit);

    void update(BankOffice bankOfficeUse, BankOffice bankOfficeAppdate);
    void delite(BankOffice bankOffice);

}
