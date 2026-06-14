package com.example.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo1.entity.Student;
import com.example.demo1.vo.StudentCourseScoreVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//extends：继承关键字，表示 StudentMapper 继承了 BaseMapper
//BaseMapper<Student>：MyBatis-Plus 提供的通用 CRUD 接口，里面已经写好了所有基础数据库操作方法
//<Student>：泛型，告诉 BaseMapper：这个接口是用来操作 Student 实体类对应的数据库表的
public interface StudentMapper extends BaseMapper<Student> {
    IPage<StudentCourseScoreVO> selectStudentCourseScorePage(IPage<StudentCourseScoreVO> page);
    // <StudentCourseScoreVO> 相当于每个元素类型
    List<StudentCourseScoreVO> selectStudentScoresByName(@Param("studentName") String studentName);
    List<String> selectStudentsWithMathScoreAbove80();
}
