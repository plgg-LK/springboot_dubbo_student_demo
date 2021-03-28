package com.itkk.controller;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.alibaba.dubbo.config.annotation.Reference;
import com.itkk.entity.Student;
import com.itkk.service.IStuService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StuController {

  @Reference
  private IStuService iStuService;

  @RequestMapping("/list")
  public String list(Model model) {
    List<Student> studentList = iStuService.list();
    model.addAttribute("stu",studentList);
    return "stuList";
  }
}
