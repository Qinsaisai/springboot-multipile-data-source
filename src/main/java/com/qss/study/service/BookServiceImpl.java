package com.qss.study.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qss.study.entity.BookInfo;
import com.qss.study.mapper.BookInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl extends ServiceImpl<BookInfoMapper, BookInfo> implements BookService {
    @Resource
    private BookInfoMapper bookInfoMapper;

    @DS("major")
    @Override
    public List<BookInfo> getBookInfoByMajor() {
        return bookInfoMapper.getBookInfo();
    }

    @DS("secondary")
    @Override
    public List<BookInfo> getBookInfoBySecondary() {
        return bookInfoMapper.getBookInfo();
    }
}
