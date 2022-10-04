package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Person;

import src.main.java.tech.reliab.course.toropchinda.bank.service.PersonService;


public class PersonServiceImpl implements PersonService{

    /**
     * ���������� �.�. �������
     */
    @Override
    public void plusSalary(Person person, Integer add_salary) {
        person.setSalary(person.getSalary() + add_salary);
    }

    /**
     * ���������� �.�. ������� �� ������� �������� true ����� ������� false
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
