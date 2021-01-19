package com.qss.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qss.study.entity.UserInfo;

import java.util.List;

public interface TestService extends IService<UserInfo> {
    List<UserInfo> getUserInfo();
}
