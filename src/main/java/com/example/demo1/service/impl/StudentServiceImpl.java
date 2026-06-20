package com.example.demo1.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo1.entity.Student;
import com.example.demo1.mapper.StudentMapper;
import com.example.demo1.service.StudentService;
import com.example.demo1.vo.StudentCourseScoreVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// implements：实现接口
// 继承 MyBatis-Plus 提供的通用业务实现父类 ServiceImpl
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Override
    public IPage<StudentCourseScoreVO> getStudentCourseScorePage(int pageNum, int pageSize){
        // IPage 是接口，不能直接 new 创建对象；而 Page 是 IPage 的实现类，可以直接实例化。
        Page<StudentCourseScoreVO> page=new Page<>(pageNum, pageSize);

        return baseMapper.selectStudentCourseScorePage(page);
        // baseMapper 来自父类 ServiceImpl<StudentMapper, Student>，
        // 框架自动注入好了 StudentMapper 对象，等价于 StudentMapper mapper
    }

    @Override
    public List<StudentCourseScoreVO> getScoresByStudentName(String studentName){
        return baseMapper.selectStudentScoresByName(studentName);
    }

    @Override
    public List<String> getStudentsWithMathScoreAbove80(){
        return baseMapper.selectStudentsWithMathScoreAbove80();
    }
}
