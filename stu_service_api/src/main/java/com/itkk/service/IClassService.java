package com.itkk.service;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.itkk.entity.Classes;
import java.util.List;

public interface IClassService {
  List<Classes> list();
  Classes queryById(Integer id);
}
