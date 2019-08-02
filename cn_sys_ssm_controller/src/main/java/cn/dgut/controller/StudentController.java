package cn.dgut.controller;

import cn.dgut.domain.Student;
import cn.dgut.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
    private IStudentService studentService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Student> studentList = studentService.findAll();
        mv.addObject("studentList",studentList);
        mv.setViewName("student-list");
        return mv;
    }
}
