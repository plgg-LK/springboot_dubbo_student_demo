package com.itkk.controller;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.alibaba.dubbo.config.annotation.Reference;
import com.itkk.entity.Classes;
import com.itkk.service.IClassService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/class")
public class ClassController {

  @Reference
  private IClassService iClassService;

  @RequestMapping("/list")
  public String list(Model model) {
    List<Classes> classesList = iClassService.list();
    model.addAttribute("class",classesList);
    return "claList";
  }
}
