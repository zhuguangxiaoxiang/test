package com.entiy;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * @Auther: Administrator
 * @Date: 2023/5/6
 */
@Data
@TableName("p_user")
public class User {

    @TableId(value = "id")
    private Integer id;

    @TableField(value = "created_at")
    private Date createdAt;

    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(value = "deleted_at")
    private Date deletedAt;

    @TableField(value = "mobile")
    private String mobile;

    @TableField(value = "nickname")
    private String nickname;
}
