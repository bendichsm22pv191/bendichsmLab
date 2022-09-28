package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private Date birthday;
    private String post;
    private int salary;
    public Person(int id, String name, String surname, String patronymic, Date birthday, String post, int salary){
        this.id = 1;
        this.name = "Иван";
        this.surname = "Иванов";
        this.patronymic = "Иванович";
        this.birthday = new Date();
        this.post = "безработный";
        this.salary = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPost() {
        return post;
    }

    public String getSurname() {
        return surname;
    }
}
