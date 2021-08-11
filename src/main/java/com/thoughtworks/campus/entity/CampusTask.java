package com.thoughtworks.campus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Xiaoxiao Hu
 * @since 2021-08-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CampusTask extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private LocalDateTime createTime;

    private Integer taskType;

    private String taskRequire;

    private LocalDateTime effectTime;

    private Double taskSalary;

    private Integer taskStatus;

    private String phone;

    private String taskRemarks;

    private LocalDateTime updateTime;

    private Integer belongingUserId;


}
