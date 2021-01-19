package com.qss.study.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qss.study.entity.UserInfo;
import com.qss.study.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@DS("secondary")
@Service("SecondaryTestServiceImpl")
public class SecondaryTestServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements TestService {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfo() {
        return userInfoMapper.getAllUserInfo();
    }
}
