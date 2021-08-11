package com.thoughtworks.campus.controller;


import com.thoughtworks.campus.entity.User;
import com.thoughtworks.campus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Xiaoxiao Hu
 * @since 2021-08-11
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getuserbyid/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getById(id);
    }

    @PutMapping("modify")
    public boolean modifyUser(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }


    @PostMapping("adduser")
    public boolean addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/deleteuserbyid/{id}")
    public int deleteUser(@PathVariable("id") int id) {
        return userService.getBaseMapper().deleteById(id);
    }
}
