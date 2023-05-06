package com.entiy;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * @Auther: Administrator
 * @Date: 2023/5/6
 */
@TableName("p_order")
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1736461085902963346L;

    @TableId(value = "id")
    private Integer id;

    @TableField(value = "created_at")
    private Date createdAt;

    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(value = "user_id")
    private Integer userId;

    @TableField(value = "product_name")
    private String productName;

    @TableField(value = "total_price")
    private String totalPrice;

    @TableField(value = "count")
    private Integer count;

    @TableField(value = "unit_price")
    private String unitPrice;

    @TableField(value = "status")
    private Integer status;

    @TableField(value = "pay_type")
    private Integer payType;

    @TableField(exist = false)
    private String nickname;

    @TableField(exist = false)
    private String mobile;
}
