package com.lxq.mybook.model;

import lombok.Data;

import java.io.Serializable;

/**
 * book表结构
 *
 * @program：mybook
 * @author: lvxueqing
 * @create: 2023/10/30 19:21
 */

@Data
public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
    private Integer page;
}
