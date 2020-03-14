package org.javaboy.jparest.dao;

import org.javaboy.jparest.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/14 1:34
 */
public interface BookDao extends JpaRepository<Book, Integer> {
}
