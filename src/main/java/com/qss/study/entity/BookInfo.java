package com.qss.study.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookInfo {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 书名
     */
    private String bookName;
    /**
     * 出版时间
     */
    private LocalDateTime publishDate;
}
