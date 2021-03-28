package com.itkk.serviceimpl;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.alibaba.dubbo.config.annotation.Reference;
import com.itkk.dao.IstuMapper;
import com.itkk.entity.Classes;
import com.itkk.entity.Student;
import com.itkk.service.IClassService;
import com.itkk.service.IStuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class StuServiceImpl implements IStuService {

  @Autowired
  private IstuMapper istuMapper;
  @Reference
  private IClassService iClassService;
  @Override
  public List<Student> list() {
    List<Student> studentList = istuMapper.selectList(null);
    for (Student student : studentList) {
      Integer cid = student.getCid();
      Classes classes = iClassService.queryById(cid);
      student.setClasses(classes);
    }
    return studentList;
  }



}
