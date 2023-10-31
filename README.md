# java纯后端项目最小回路
<span style="color: red;">by lvxueqinga 2023.10.31</span>


## 使用技术及框架
* java
* springboot2框架
* mysql数据库（本地）
* mybatis框架
* postman（测试接口）

## 完成功能
* 新增图书
* 图书列表查询
* 图书列表筛选

---


#### 数据库表结构

CREATE TABLE `booklist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `page` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8
