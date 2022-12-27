package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.PaymentAccount;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.User;

public interface UserService {
    void changeJob(User user, Integer salary, String post);

    void update(User userUse, User userAppdate);

    void delite(User user);
}
