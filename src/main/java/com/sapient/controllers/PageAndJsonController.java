package com.sapient.controllers;


import com.sapient.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class PageAndJsonController {
    /**
     * http://localhost:9000/student/rest
     * @return student
     */
    @GetMapping("/rest")
    @ResponseBody
    public Student getStudentRest(){
        return new Student(111,"naveen mishra","R1");
    }

    /**
     * http://localhost:9000/student/page
     * @return page
     */
    @GetMapping("/page")
    public String getStudentPage(ModelMap model){
        Student student = new Student(111,"naveen mishra","R1");
        model.addAttribute("data","naveen");
        return "page";
    }
}
