package src.main.java.tech.reliab.course.bendichsm.bank.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Person {
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;
    private Date birthday;
    private String post;
    private Integer salary;
    public Person(Integer id, String name, String surname, String patronymic, Date birthday, String post){
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

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public Date getBirthday() {
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
