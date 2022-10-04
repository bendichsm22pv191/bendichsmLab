package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankAtm;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Person;
import src.main.java.tech.reliab.course.toropchinda.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    /**
     * ������������ ������ ������ � ������� �������� � �� ���� ��������� ����
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
     * ������������ �������� ������ �� �������� ��������� � �� ������ ���������� �����
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
}
