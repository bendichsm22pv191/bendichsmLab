package src.main.java.tech.reliab.course.toropchinda.bank;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.*;

import java.util.Date;

public class Main {
    public static void main(String[] args){
//        Bank bank = new Bank(1, "Банку");
//        BankOffice bankOffice = new BankOffice(bank, 3,"prospect peace", true, true,true,true,true, "office");
//        Employee employee = new Employee(0, "G", "G", "G", new Date(), "рабочий", bank, bankOffice);
//        BankAtm bankAtm = new BankAtm(bank, 1, "бАНКОМАТ", employee, 1000, (short)1, "Справа", true,true);
//
//        Person person = new Person(5, "gfdgdg", "sdfdfg", "dfgrfgdc", new Date(), "fygcfyh");
//        System.out.println(person.getId());
//
//        User user = new User(6, "FSTFGXDRTGDRYT", "sGYUIUIUIUIUIUIUIUIUIUIGY", "dDRTTTTTTTTc", new Date(), "fygDRTTTTTTTTh");
//        System.out.println(user.getId());
//
//        System.out.println(person.getId());
//
//        System.out.println(bankOffice.getId());


        Bank bank = new Bank(1, "Banku");

        BankOffice bankOffice = new BankOffice(bank, 1, "prospect peace", true, true,
                true,true,true, true, "office");
        Data data1 = new Data(10,15,2004);

        Data data2 = new Data(9,14,2000);

        Person person1 = new Person(1, "Georg", "Gig", "Georgievich", data1, "work");

        Person person2 = new Person(2, "Luigi", "Brother", "Drakonovich", data2, "work");

        Employee employee = new Employee(person2, 1, bank, bankOffice);

        BankAtm bankAtm = new BankAtm(bank, 1, "bANKOMAT", employee, 1000, 1,
                "Right", true,true);

        User user = new User(person1, 1);

        Data data3 = new Data(11,15,2022);

        Data data4 = new Data(11,15,2024);

        PaymentAccount paymentAccount = new PaymentAccount(user, 1, "Banku", 17000);

        CreditAccount creditAccount = new CreditAccount(user, "Banku", data3, data4, 10000,50, employee, paymentAccount, 1);

        bank.display();
        bankOffice.display();
        person1.display();
        person2.display();
        employee.display();
        bankAtm.display();
        user.display();
        paymentAccount.display();
        creditAccount.display();

        user.setCreditAccounts(creditAccount);
        user.setPaymentAccounts(paymentAccount);

        user.display();
    }
}
