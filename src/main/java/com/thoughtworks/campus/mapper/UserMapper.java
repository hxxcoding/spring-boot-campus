package com.thoughtworks.campus.mapper;

import com.thoughtworks.campus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Xiaoxiao Hu
 * @since 2021-08-11
 */

@Repository
public interface UserMapper extends BaseMapper<User> {

    public List<User>findAllUser();

}
