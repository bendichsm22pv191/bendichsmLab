package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.Person;

import src.main.java.tech.reliab.course.bendichsm.bank.service.PersonService;


public class PersonServiceImpl implements PersonService{

    /**
     * Adds some salary
     */
    @Override
    public void plusSalary(Person person, Integer add_salary) {
        person.setSalary(person.getSalary() + add_salary);
    }

    /**
     * Takes some amount of salary from the person, if successful - return true, else - false
     */
    @Override
    public Boolean minusSalary(Person person, Integer minus_salary) {
        if(person.getSalary()>0) {
            person.setSalary(person.getSalary() - minus_salary);
            return true;
        }
        return false;
    }

}
