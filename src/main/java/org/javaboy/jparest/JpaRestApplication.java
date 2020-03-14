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
     *
     * 自定义查询
     * 查找所有可用自定义接口
     * http://localhost:8080/books/search
     * 根据书名查找书籍---->解决方法名称过长的问题---->方法名@RestResource(exported = true, path = "/findBookByName", rel = "findBookByName")---->http://localhost:8080/books/search/findBookByName?name=西游记
     * http://localhost:8080/books/search/findBookByNameContaining?name=西游记
     *
     * 默认books---->修改默认---->@RepositoryRestResource(path = "/bs", collectionResourceRel = "bs", itemResourceRel="b")
     * http://localhost:8080/bs/search/findBookByName?name=三
     * http://localhost:8080/bs/search
     * {
     *   "_embedded": {
     *     "bs": [    ----->collectionResourceRel
     *       {
     *         "name": "三国演义",
     *         "author": "罗贯中",
     *         "_links": {
     *           "self": {
     *             "href": "http://localhost:8080/bs/2"
     *           },
     *           "b": {    ----->itemResourceRel
     *             "href": "http://localhost:8080/bs/2"
     *           }
     *         }
     *       }
     *     ]
     *   },
     *   "_links": {
     *     "self": {
     *       "href": "http://localhost:8080/bs/search/findBookByName?name=%E4%B8%89"
     *     }
     *   }
     * }
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(JpaRestApplication.class, args);
    }


}
