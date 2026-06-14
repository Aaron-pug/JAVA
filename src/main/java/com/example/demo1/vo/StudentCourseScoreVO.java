package com.example.demo1.vo;

import lombok.Data;

@Data
public class StudentCourseScoreVO {
    private String name;       // 学生姓名（来自student表）
    private String courseName; // 课程名（来自course表）
    private Double score;      // 分数（来自sc表）
}
