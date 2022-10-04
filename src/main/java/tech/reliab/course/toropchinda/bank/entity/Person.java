package src.main.java.tech.reliab.course.toropchinda.bank.entity;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Data;

import java.util.Random;

public class Person {
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;
    private Data birthday;
    private String post;
    private Integer salary;
    public Person(Integer id, String name, String surname, String patronymic, Data birthday, String post){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.post = post;
        Random rand = new Random();
        this.salary = rand.nextInt(10000) + 1;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBirthday(Data birthday) {
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

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public Data getBirthday() {
        return birthday;
    }

    public Integer getSalary() {
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

    public void delitePerson(){
        this.id = null;
        this.name = null;
        this.surname = null;
        this.patronymic = null;
        this.birthday = null;
        this.post = null;
        this.salary = null;
    }

    public void display(){
        System.out.println("Person");
        System.out.println("id = " + Integer.toString(getId()));
        System.out.println("name = " + getName());
        System.out.println("surname = " + getSurname());
        System.out.println("patronymic = " + getPatronymic());
        System.out.println("birthday = " + getBirthday().Data());
        System.out.println("post = " + getPost());
        System.out.println("salary = " + Integer.toString(getSalary()));
        System.out.println("");
    }
}
