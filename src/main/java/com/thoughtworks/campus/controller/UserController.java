package com.thoughtworks.campus.controller;

import com.thoughtworks.campus.entity.User;
import com.thoughtworks.campus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> findAllUser() {
        return userMapper.queryAllUser();
    }

    @PostMapping("/adduser")
    public Map<String, Object> addUser(HttpServletRequest request, @RequestParam("id")int id,
                                       @RequestParam("username")String username,
                                       @RequestParam("password")String password) {
        Map<String, Object> modelMap = new HashMap<>();
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        userMapper.insertUser(user);
        modelMap.put("success", user);
        return modelMap;
    }

}
