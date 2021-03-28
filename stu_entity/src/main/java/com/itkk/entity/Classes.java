package com.itkk.entity;/*
    @Author likunjie
    @Date   2021/3/28
*/

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("classes")
public class Classes extends BaseEntity {

    private String cname;
    private Integer cnum;
}
