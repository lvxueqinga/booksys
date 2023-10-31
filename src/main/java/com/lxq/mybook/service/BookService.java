package com.lxq.mybook.service;



import com.alibaba.fastjson.JSONObject;
import com.lxq.mybook.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 *
 * @program：mybook
 * @author: lvxueqing
 * @create: 2023/10/30 19:25
 */

public interface BookService {
    /*
    增加
     */
    int addBook(Book book);


    /*
    查询
     */

    List<JSONObject> searchBook();

    /*
     条件查询
     */
    List<JSONObject> searchBookpara(Book book);


}
