package com.vincent.mybatisplus.samples.crud.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vincent.mybatisplus.samples.crud.entity.User;

/**
 * <p>
 * MP 支持不需要 UserMapper.xml 这个模块演示内置 CRUD 咱们就不要 XML 部分了
 * </p>
 *
 * Created with IDEA
 * author:vincent
 * Date:2018/11/20
 */
public interface UserMapper extends BaseMapper<User> {

}
