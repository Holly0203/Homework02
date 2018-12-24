package com.example.demo.controller;
import com.example.demo.annotation.Annotation;
import com.example.demo.service.Messageservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/messagecontroller")

public class MessageController {

    @Resource
    private Messageservice messageservice;

    @RequestMapping("/querymessage")
    public String queryMessage(HttpSession session, Model model){
        System.out.println("登陆手机号码："+session.getAttribute("loginphone").toString());
        System.out.println("消息列表："+this.messageservice.queryMessageByphone(session.getAttribute("loginphone").toString()));
        model.addAttribute("messagelist",this.messageservice.queryMessageByphone(session.getAttribute("loginphone").toString()));
        return "message_list";
    }
    @RequestMapping("/deleteone")
    @Annotation(value = "删除")
    public String deleteone(Integer messageid){
        this.messageservice.deleteon(messageid);
        return "redirect:querymessage";

    }
    @RequestMapping("/see")
    @Annotation(value = "查看")
    public String see(Integer messageid,Model model) {
        System.out.println("11111111111111111111111111111111");
        model.addAttribute("messagedetail",this.messageservice.editone(messageid));
        return "message_detail";
    }

}
