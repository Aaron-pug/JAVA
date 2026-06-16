package com.example.demo1.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo1.service.StudentService;
import com.example.demo1.vo.StudentCourseScoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/scores/page")
    public IPage<StudentCourseScoreVO> getStudentCourseScorePage
            (@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10") int pageSize){
        return studentService.getStudentCourseScorePage(pageNum,pageSize);
    }

    @GetMapping("/scores/{name}")
    public List<StudentCourseScoreVO> getScoresByStudentName(@PathVariable String name){
        return studentService.getScoresByStudentName(name);
    }

    @GetMapping("/math/above80")
    public List<String> getStudentsWithMathScoreAbove80(){
        return studentService.getStudentsWithMathScoreAbove80();
    }
}
