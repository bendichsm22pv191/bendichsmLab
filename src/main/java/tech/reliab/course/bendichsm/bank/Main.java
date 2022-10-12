package src.main.java.tech.reliab.course.bendichsm.bank;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.*;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.*;
import src.main.java.tech.reliab.course.bendichsm.bank.service.PaymentAccountService;
import src.main.java.tech.reliab.course.bendichsm.bank.utils.BankAtmStatusEnum;
import src.main.java.tech.reliab.course.bendichsm.bank.utils.BankOfficeStatusEnum;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static src.main.java.tech.reliab.course.bendichsm.bank.utils.BankAtmStatusEnum.WORK;

public class Main {
    public static void main(String[] args){

        Bank bank = new Bank(1, "Our Bank");
        BankOfficeStatusEnum statusOffice = BankOfficeStatusEnum.valueOf("WORK");
        BankOffice bankOffice = new BankOffice(1, "prospect peace", "address", statusOffice,
                true, true,true,true, 12, 100,
                10);
        Date data = new Date(99999999);
        Person personEmp = new Person(0, "Luigi", "Brother", "Drakonovich", data,
                "work");
        Person personUser = new Person(1, "Mario", "Brother", "Drakonovich", data,
                "work");
        User user = new User(personUser, 0);
        Employee employee = new Employee(personEmp, 0, bank, bankOffice);

        BankAtmStatusEnum statusBank = BankAtmStatusEnum.valueOf("WORK");
        BankAtm bankAtm = new BankAtm(0,"banksur","address", bank, employee, 10,
                statusBank, "address", true, true);

        Date beginCredit = new Date(99999997);
        Date endCredit = new Date(99999998);
        PaymentAccount paymentAccount = new PaymentAccount(user, 0, "Our Bank", 200);
        CreditAccount creditAccount = new CreditAccount(0, user, "Our Bank", beginCredit, endCredit,
                200, 50, employee, paymentAccount, 10);

        System.out.println(bankAtm.toString());
        System.out.println(personEmp.toString());
        System.out.println(personUser.toString());
        System.out.println(paymentAccount.toString());
        System.out.println(creditAccount.toString());
        System.out.println(bank.toString());
        System.out.println(employee.toString());
        System.out.println(user.toString());

    }
}
