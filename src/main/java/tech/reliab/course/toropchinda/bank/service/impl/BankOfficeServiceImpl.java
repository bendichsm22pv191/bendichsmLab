package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.*;
import src.main.java.tech.reliab.course.toropchinda.bank.service.BankOfficeService;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Data;


public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public Boolean plusBankOfficeATM(BankOffice bankOffice, Integer quantityATM) {
        if(bankOffice.getPutATMable()) {
            bankOffice.setQuantityATM(bankOffice.getQuantityATM() + quantityATM);
            return true;
        }
        return false;
    }

    @Override
    public Boolean minusBankOfficeATM(BankOffice bankOffice, Integer quantityATM) {
        if(bankOffice.getATMable) {
            bankOffice.setQuantityATM(bankOffice.getQuantityATM() - quantityATM);
            return true;
        }
        return false;
    }

    @Override
    public CreditAccount getCredit(BankOffice bankOffice, Bank bank, User user, Data beginCredit, Data endCredit,
                                   Integer sumCredit, Integer interestRate, Employee employee,
                                   PaymentAccount paymentAccount) {
        CreditAccount creditAccount = new CreditAccount(user, bank.getName(), beginCredit, endCredit, sumCredit,
                interestRate, employee, paymentAccount, user.getId());
        if (bankOffice.getAllMoney() > creditAccount.getSumCredit() && bankOffice.getGetCreditAble()){
            user.setBanks(bank);
            user.setCreditAccounts(creditAccount);
            return creditAccount;
        }
        return null;
    }
}
