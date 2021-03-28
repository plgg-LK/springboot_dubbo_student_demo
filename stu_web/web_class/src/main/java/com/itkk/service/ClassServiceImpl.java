package com.itkk.service;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.alibaba.dubbo.config.annotation.Service;
import com.itkk.dao.ClaMapper;
import com.itkk.entity.Classes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClassServiceImpl implements IClassService {

  @Autowired
  private ClaMapper claMapper;
  @Override
  public List<Classes> list() {
    return claMapper.selectList(null);
  }

  @Override
  public Classes queryById(Integer id) {
    return claMapper.selectById(id);
  }
}
