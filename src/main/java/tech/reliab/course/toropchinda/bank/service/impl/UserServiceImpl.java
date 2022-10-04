package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.User;
import src.main.java.tech.reliab.course.toropchinda.bank.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void changeJob(User user, Integer salary, String post) {
        user.setSalary(salary);
        user.setPost(post);
    }
}
