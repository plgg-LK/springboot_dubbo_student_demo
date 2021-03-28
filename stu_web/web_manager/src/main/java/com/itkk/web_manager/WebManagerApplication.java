package com.itkk.web_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.itkk")
public class WebManagerApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebManagerApplication.class, args);
  }

}
