package com.woniu.springboot.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
 private Integer sid;
 private String sname;
 private Integer age;
 private Date birthday;
 private Classa classa;
}
