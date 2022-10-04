package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.User;

public interface UserService {
    void changeJob(User user, Integer salary, String post);
}
