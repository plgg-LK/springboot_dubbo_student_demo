package com.itkk.service;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.itkk.entity.Student;
import java.util.List;

public interface IStuService {
  List<Student> list();
  void addStudent(Student student);

  void deleteById(Integer id);
}
