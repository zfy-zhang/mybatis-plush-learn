package com.vincent.mybatisplus.samples.crud.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/20
 */
@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}