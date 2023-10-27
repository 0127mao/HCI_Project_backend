package com.example.HCI_Project_Backend.Service;

import com.example.HCI_Project_Backend.Domain.User;

public interface UserService {
    User loginService(String uname, String password);

    User registerService(User user);
}
