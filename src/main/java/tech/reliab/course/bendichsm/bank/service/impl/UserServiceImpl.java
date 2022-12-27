package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.PaymentAccount;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.User;
import src.main.java.tech.reliab.course.bendichsm.bank.service.UserService;

public class UserServiceImpl implements UserService {

    /**
     *  Changes user job
     */
    @Override
    public void changeJob(User user, Integer salary, String post) {
        user.setSalary(salary);
        user.setPost(post);
    }
    @Override
    public void update(User userUse, User userAppdate){
        userAppdate.setBanks(userUse.getBanks());
        userAppdate.setName(userUse.getName());
        userAppdate.setId(userUse.getInterestRate());
        userAppdate.setBirthday(userUse.getBirthday());
        userAppdate.setSurname(userUse.getSurname());
        userAppdate.setPatronymic(userUse.getPatronymic());
        userAppdate.setCreditAccounts(userUse.getCreditAccounts());
        userAppdate.setPaymentAccounts(userUse.getPaymentAccounts());
        userAppdate.setPost(userUse.getPost());
        userAppdate.setSalary(userUse.getSalary());
        userAppdate.setInterestRate(userUse.getInterestRate());
    }
    @Override
    public void delite(User user){
        user = null;
    }
}
