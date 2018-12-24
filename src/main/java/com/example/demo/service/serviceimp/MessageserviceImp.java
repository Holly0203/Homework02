package com.example.demo.service.serviceimp;

import com.example.demo.Model.Message;
import com.example.demo.dao.MessageMapper;
import com.example.demo.service.Messageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageserviceImp implements Messageservice {
    @Autowired
    private MessageMapper messagemapper;

    @Override
    public List<Message> queryMessageByphone(String phone) {
        return this.messagemapper.queryMessageByphone(phone);
    }

    @Override
    public void deleteon(Integer messageid) {
        this.messagemapper.deleteon(messageid);
    }

    @Override
    public Message editone(Integer messageid) {

        return  this.messagemapper.editone(messageid);
    }
}
