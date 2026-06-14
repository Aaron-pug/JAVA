package com.example.demo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class Student {
    @TableId(value ="student_id",type = IdType.AUTO)
    private Integer studentId;

    private String name;

    private Integer age;

    private String gender;

}
