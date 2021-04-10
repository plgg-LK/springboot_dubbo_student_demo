package com.itkk.service;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

  @Override
  public void updateByCid(Integer cid) {
    QueryWrapper queryWrapper=new QueryWrapper();
    queryWrapper.eq("id",cid);
    Classes classes = claMapper.selectOne(queryWrapper);
    QueryWrapper queryWrapper1=new QueryWrapper();
    queryWrapper.eq("cnum",classes.getCnum()+1);
    int update = claMapper.update(classes, queryWrapper1);
  }

}
