package com.example.bigdata.service;

import java.util.List;
import com.example.bigdata.entity.User;

public interface UserService {
    List<User> queryByage(int age);

    User save(User user);

    void deletUserById(int id);

}
