package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.*;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Data;


public interface BankOfficeService {
    Boolean plusBankOfficeATM(BankOffice bankOffice, Integer quantityATM);
    Boolean minusBankOfficeATM(BankOffice bankOffice, Integer quantityATM);
    CreditAccount getCredit(BankOffice bankOffice, Bank bank, User user, Data beginCredit, Data endCredit,
                            Integer sumCredit, Integer interestRate, Employee employee,
                            PaymentAccount paymentAccount);


}
