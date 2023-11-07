package com.lxq.mybook.controller;

import com.alibaba.fastjson.JSONObject;
import com.lxq.mybook.model.Book;
import com.lxq.mybook.service.BookService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program：mybook
 * @author: lvxueqing
 * @create: 2023/10/30 20:49
 */

@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping("/search")
    public List<JSONObject> search(){
        return  bookService.searchBook();
    }

    @PostMapping("/add")
    public int add(@RequestBody @Valid Book book){
        return bookService.addBook(book);
    }


    @RequestMapping(value = "/searchpara", method = RequestMethod.POST)
    public List<JSONObject> searchpara(@RequestBody  Book book) {
        return  bookService.searchBookpara(book);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public int edit(@RequestParam @Valid String bookname,@RequestParam  @NotNull String newauthor){return bookService.editBook(bookname,newauthor);}

    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public int del(@RequestParam @Valid String bookname){return bookService.delBook(bookname);}




}
