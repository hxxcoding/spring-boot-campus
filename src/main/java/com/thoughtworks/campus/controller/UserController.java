package com.thoughtworks.campus.controller;


import com.thoughtworks.campus.entity.User;
import com.thoughtworks.campus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Xiaoxiao Hu
 * @since 2021-08-11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getuser")
    public User getUser() {
        return userService.getById(1);
    }
}
