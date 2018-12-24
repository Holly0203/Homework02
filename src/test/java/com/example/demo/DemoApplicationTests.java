package com.example.demo;
import com.example.demo.service.Messageservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests extends TestDemo{
    @Autowired
    private Messageservice messageservice;
    @Test
    public void contextLoads() {

    }
   @Test
    public void deleteTest(){
        messageservice.deleteon(1);
    }
    @Test
    public void editTest(){
        messageservice.editone(2);
    }
}

