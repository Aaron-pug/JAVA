package com.example.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo1.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {

}
