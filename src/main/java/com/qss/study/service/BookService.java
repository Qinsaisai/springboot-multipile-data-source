package com.qss.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qss.study.entity.BookInfo;

import java.util.List;

public interface BookService extends IService<BookInfo> {
    List<BookInfo> getBookInfoByMajor();

    List<BookInfo> getBookInfoBySecondary();
}
