package org.javaboy.jparest.dao;

import org.javaboy.jparest.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/14 1:34
 */
@CrossOrigin
@RepositoryRestResource(path = "bs", collectionResourceRel = "bs", itemResourceRel="b")
public interface BookDao extends JpaRepository<Book, Integer> {

    //自定义查询
    @RestResource(exported = true, path = "findBookByName", rel = "findBookByName")
    List<Book> findBookByNameContaining(@Param("name") String name);

}
