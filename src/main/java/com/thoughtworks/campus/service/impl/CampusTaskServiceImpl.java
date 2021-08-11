package com.thoughtworks.campus.service.impl;

import com.thoughtworks.campus.entity.CampusTask;
import com.thoughtworks.campus.mapper.CampusTaskMapper;
import com.thoughtworks.campus.service.ICampusTaskService;
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
public class CampusTaskServiceImpl extends ServiceImpl<CampusTaskMapper, CampusTask> implements ICampusTaskService {

}
