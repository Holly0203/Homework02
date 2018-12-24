package com.example.demo.service.serviceimp;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImp implements Userservice {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer adduser(String phone,String password) {
        //0:代表注册失败   1:注册成功
        int flag=0;
        if(this.userMapper.queryuser(phone)==null){
            this.userMapper.insertuser(phone,password);
            flag=1;
        }
        return flag;
    }
    @Override
    public Integer iflogin(String phone, String password) {
        int flag=0;
        System.out.println(password+"**************");
        //0:代表手机号不存在  1代表登录成功 2代表密码错误
        if(this.userMapper.queryuser(phone)==null){
            //手机号有误
            flag=0;
        }else{
            System.out.println("用户密码"+password+":数据库密码："+this.userMapper.queryuser(phone).getPassword());
            if (password.equals(this.userMapper.queryuser(phone).getPassword())){
                flag=1;
            }else{
                flag=2;
            }
        }
        return flag;
    }
}
