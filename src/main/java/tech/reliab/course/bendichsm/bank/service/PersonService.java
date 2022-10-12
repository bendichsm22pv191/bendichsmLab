package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.Person;

public interface PersonService {
    void plusSalary(Person person, Integer add_salary);
    Boolean minusSalary(Person person, Integer minus_salary);

}
