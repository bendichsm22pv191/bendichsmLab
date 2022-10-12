package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.User;

public interface UserService {
    void changeJob(User user, Integer salary, String post);
}
