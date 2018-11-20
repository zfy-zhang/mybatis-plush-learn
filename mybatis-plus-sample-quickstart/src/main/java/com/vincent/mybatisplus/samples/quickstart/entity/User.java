package com.vincent.mybatisplus.samples.quickstart.entity;

import lombok.Data;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/20
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}