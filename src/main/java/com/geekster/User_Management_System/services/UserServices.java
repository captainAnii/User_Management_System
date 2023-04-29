package com.geekster.User_Management_System.services;

import com.geekster.User_Management_System.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    private List<User> users = new ArrayList<>();

    public User addUser(User user) {
        user.setUserId(users.size() + 1);
        users.add(user);
        return user;
    }

    public User getUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User updateUser(int userId, User updatedUser) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                user.setName(updatedUser.getName());
                user.setUserName(updatedUser.getUserName());
                user.setAddress(updatedUser.getAddress());
                user.setPhoneNumber(updatedUser.getPhoneNumber());
                return user;
            }
        }
        return null;
    }

    public boolean deleteUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }
}