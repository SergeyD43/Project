package main.java.services;

import main.java.model.pojo.User;

import java.util.List;

public interface UserService {

    void signUp(String login, String password, String name, String surname) throws Exception;

    List<User> getAllUsers();

    User getUserByLogin(String login);
}
