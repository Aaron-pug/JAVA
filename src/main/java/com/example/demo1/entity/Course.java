package com.example.demo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("course")
public class Course {
    @TableId(value="course_id",type=IdType.AUTO)
    private Integer courseId;
    private String courseName;//自动驼峰转下划线映射，无需额外注解
    private Integer teacherId;
}
