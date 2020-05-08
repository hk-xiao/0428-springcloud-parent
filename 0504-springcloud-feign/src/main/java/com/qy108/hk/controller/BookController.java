package com.qy108.hk.controller;


import com.qy108.hk.model.Book;
import com.qy108.hk.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/4 14:40
 * @Description
 **/
@RestController
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/all")
    public List<Book> selectAllBooks() {
        return bookService.selectAllBooks();
    }

}
