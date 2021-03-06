package com.example;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class SpringSecuritySessionAuthApplication {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void registerUsers(){
        User user1=new User();
        user1.setEmail("selin@gmail.com");
        user1.setPassword("123");
        user1.setName("selin");
        List<String> authorities1 = List.of("ROLE_EMPLOYEE","ROLE_QA");
        user1.setAuthorities(authorities1);

        User user2=new User();
        user2.setEmail("cengizhan@gmail.com");
        user2.setPassword("123");
        user2.setName("cengizhan");
        List<String> authorities2 = List.of("ROLE_EMPLOYEE","ROLE_DEVELOPER");
        user2.setAuthorities(authorities2);


        userService.register(user1);
        userService.register(user2);

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecuritySessionAuthApplication.class, args);
    }

}
