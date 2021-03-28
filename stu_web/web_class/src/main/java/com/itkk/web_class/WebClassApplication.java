package com.itkk.web_class;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.itkk")
@DubboComponentScan("com.itkk.service")
@MapperScan("com.itkk.dao")
public class WebClassApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebClassApplication.class, args);
  }

}
