package com.qss.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qss.study.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    List<UserInfo> getAllUserInfo();
}
