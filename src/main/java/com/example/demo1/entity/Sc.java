package com.example.demo1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sc")
public class Sc {
    // sc 表是两个字段组成的联合主键
    //直接把 studentId 和 courseId 当成普通字段写。后续查询、插入时，通过这两个字段来唯一确定一条记录
    private Integer studentId;
    private Integer courseId;
    private Double  score;
}
