package com.thoughtworks.campus.controller;


import com.thoughtworks.campus.entity.CampusTask;
import com.thoughtworks.campus.service.ICampusTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Xiaoxiao Hu
 * @since 2021-08-11
 */
@RestController
@RequestMapping("/campus-task")
public class CampusTaskController {

    @Autowired
    private ICampusTaskService campusTaskService;

    @GetMapping("get-all-tasks")
    public List<CampusTask> getAllTasks() {
        return campusTaskService.lambdaQuery().list();
    }
}
