package com.example.demo.service;


import com.example.demo.Model.Message;

import java.util.List;

public interface Messageservice {
    //根据登录的手机号进行查询所有相关的消息
    public List<Message> queryMessageByphone(String phone);
    //删除某一条消息
    public void deleteon(Integer messageid);

    //编辑某一条消息
    public Message editone(Integer messageid);
}
