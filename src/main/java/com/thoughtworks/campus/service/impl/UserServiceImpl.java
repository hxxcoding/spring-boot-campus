package com.thoughtworks.campus.service.impl;

import com.thoughtworks.campus.entity.User;
import com.thoughtworks.campus.mapper.UserMapper;
import com.thoughtworks.campus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Xiaoxiao Hu
 * @since 2021-08-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
