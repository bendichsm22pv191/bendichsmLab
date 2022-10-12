package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

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
}
