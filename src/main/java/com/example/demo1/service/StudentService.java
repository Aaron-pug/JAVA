package com.example.demo1.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo1.entity.Student;
import com.example.demo1.vo.StudentCourseScoreVO;

import java.util.List;

// IService<T>：MyBatis-Plus 提供的通用 Service 接口，它封装了常用的 CRUD 业务方法
public interface StudentService extends IService<Student> {
    IPage<StudentCourseScoreVO> getStudentCourseScorePage(int pageNum, int pageSize);
    List<StudentCourseScoreVO> getScoresByStudentName(String studentName);
    List<String> getStudentsWithMathScoreAbove80();
}
