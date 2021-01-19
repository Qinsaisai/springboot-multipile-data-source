package com.qss.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qss.study.entity.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookInfoMapper extends BaseMapper<BookInfo> {
    List<BookInfo> getBookInfo();
}
