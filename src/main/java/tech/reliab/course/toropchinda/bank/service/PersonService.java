package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Person;

public interface PersonService {
    void plusSalary(Person person, Integer add_salary);
    Boolean minusSalary(Person person, Integer minus_salary);

}
