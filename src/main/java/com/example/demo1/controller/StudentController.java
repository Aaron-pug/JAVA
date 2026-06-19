package com.example.demo1.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo1.service.StudentService;
import com.example.demo1.vo.StudentCourseScoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@RestController = @Controller + @ResponseBody
//@Controller：交给 Spring 管理，接收 web 请求
//@ResponseBody：方法返回值自动序列化为 JSON，直接返回给前端

@RequestMapping("/student")
//写在类上：只匹配「整个控制器」，是给内部所有方法加公共路径前缀，不单独绑定接口；
//写在方法上：才是直接和当前这个方法绑定完整访问 URL。
public class StudentController {
    @Autowired// auto = 自动，wire = 装配、连线。 @Autowired = 自动装配注解
    // 如果不加则写成StudentService studentService = new StudentServiceImpl();
    private StudentService studentService;
    //    项目启动时
    //    带有 @Service 的 StudentServiceImpl 业务实现类，会被 Spring 扫描，创建实例存入IoC 容器（一个存放所有对象的大仓库）。
    //    创建 StudentController 对象时
    //    Spring 发现类里有 @Autowired private StudentService studentService;
    //    自动去 IoC 容器中，按类型匹配找到 StudentService 的实例对象，直接注入赋值给 studentService 变量。
    //    之后的接口方法里，就能直接调用 studentService.xxx()，不会空指针。

    @GetMapping("/scores/page")  //本质是 @RequestMapping(method = RequestMethod.GET)
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
