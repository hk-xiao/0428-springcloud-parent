package com.qy108.hk.service;


import com.qy108.hk.mapper.BookMapper;
import com.qy108.hk.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * @author Seven Lee
     * @description
     *      查询所有的图书信息
     * @param []
     * @date 2020/4/27
     * @return java.util.List<com.aaa.lee.springcloud.model.Book>
     * @throws
    **/
    public List<Book> selectAllBooks() {
        return bookMapper.selectAll();
    }

}
