package com.ssh.service;

import com.ssh.entity.User;

public interface UserService {
public User selectByID(int id);
public void saveUser(User user);
}
