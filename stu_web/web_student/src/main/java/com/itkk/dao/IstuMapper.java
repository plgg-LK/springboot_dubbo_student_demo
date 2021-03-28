package com.itkk.dao;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itkk.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IstuMapper extends BaseMapper<Student> {

}
