package com.longg.mapper;

import com.longg.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author long
 * @date 2020/10/13
 */
public interface BooksMapper {
    /**
     * 增加一本书
     */
    int insertBook(Books books);

    /**
     * 删除一本书
     */
    int deleteBookById(@Param("bookId") int id);

    /**
     * 更新一本书
     */
    int updateBook(Books books);

    /**
     * 查询一本书
     */
    Books selectBookById(@Param("bookId") int id);

    /**
     * 查询所有本书
     */
    List<Books> selectAllBooks();

    /**
     * 通过书名查询书籍
     */
    Books queryBookByName(@Param("bookName") String bookName);
}
