package com.example.demo1.vo;

import lombok.Data;

@Data
public class StudentCourseScoreVO {
    private Integer studentId;   // 学生编号
    private String name;         // 学生姓名
    private Integer age;         // 学生年龄
    private String courseName;   // 课程名
    private Integer score;       // 分数
}
