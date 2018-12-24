package com.example.demo.service;


public interface Userservice {
    //成功插入数据库
    public Integer adduser(String phone,String password);
//addUser
    /*//插入之前需要判断数据库是否存在同样号码
    public User queryuser(User user);*/
    //登录判断账号密码是否正确
    public Integer iflogin(String phone ,String  password);
}
