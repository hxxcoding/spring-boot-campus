package com.thoughtworks.campus.service;

import com.thoughtworks.campus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Xiaoxiao Hu
 * @since 2021-08-11
 */
public interface IUserService extends IService<User> {

    public List<User>findAllUser();

}
