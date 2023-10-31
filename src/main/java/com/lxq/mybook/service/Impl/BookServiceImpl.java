package com.lxq.mybook.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lxq.mybook.dao.BookMapper;
import com.lxq.mybook.model.Book;
import com.lxq.mybook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program：mybook
 * @author: lvxueqing
 * @create: 2023/10/30 20:46
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public List<JSONObject> searchBook() {
        return bookMapper.searchBook();
    }

    @Override
    public List<JSONObject> searchBookpara(Book book) {
        return bookMapper.searchBookpara(book);
    }

}
