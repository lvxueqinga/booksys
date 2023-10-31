package com.lxq.mybook.dao;



import com.alibaba.fastjson.JSONObject;
import com.lxq.mybook.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * book接口
 *
 * @program：mybook
 * @author: lvxueqing
 * @create: 2023/10/30 19:25
 */


@Repository
public interface BookMapper {
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
