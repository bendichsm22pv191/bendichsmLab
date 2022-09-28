package src.main.java.tech.reliab.course.toropchinda.bank;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Bank;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankAtm;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankOffice;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Employee;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank(1, "Банку", 30, 2, 200, 1000, 100, 100000, 20);
        BankOffice bankOffice = new BankOffice(bank);
        Employee employee = new Employee(1, "G", "G", "G", new Date(), "рабочий", 27000, bank, bankOffice);
        BankAtm bankAtm = new BankAtm(bankOffice, employee, 1000);

        System.out.println(bankOffice.getId());
    }
}
