package com.example.demo.dao;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public void insertuser(String phone,String password);
    public User queryuser(String phone);
}
