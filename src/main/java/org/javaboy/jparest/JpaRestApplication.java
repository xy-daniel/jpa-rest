package org.javaboy.jparest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaRestApplication {

    /**
     * 查询
     * http://localhost:8080/books
     * http://localhost:8080/books?page=1&size=2&sort=id,desc
     * http://localhost:8080/books/1
     * 添加
     * http://localhost:8080/books ----> post ----> {"name":"野草","author":"鲁迅"}
     * 更新
     * http://localhost:8080/books/6 ----> put ----> {"name":"朝花夕拾","author":"鲁迅"}
     * 删除
     * http://localhost:8080/books/6
     */
    public static void main(String[] args) {
        SpringApplication.run(JpaRestApplication.class, args);
    }


}
