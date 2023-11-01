package com.lxq.mybook.model;


import lombok.Data;

import javax.validation.constraints.NotNull;
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

    @NotNull(message = "name 不能为空")
    private String name;
    /**
     * 引入字段验证注解。 @NotNull表示不能为空。
     * 在BookController.add，需要验证的参数上加上了@Valid注解，如果验证失败，它将抛出MethodArgumentNotValidException
     */
    private String author;
    private Integer page;
}
