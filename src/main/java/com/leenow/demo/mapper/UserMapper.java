package com.leenow.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leenow.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author: 11517 WangLi
 * @date: 20/8/2 23:23
 * @description:
 */
@Component
@Mapper
public interface UserMapper extends BaseMapper<User> {
//    int deleteByPrimaryKey(Long id);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
}