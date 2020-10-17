package com.longg.service;

import com.longg.mapper.BooksMapper;
import com.longg.pojo.Books;

import java.util.List;

/**
 * @author long
 * @date 2020/10/13
 */
public class BooksServiceImpl implements BooksService{

    // service调mapper层
    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int insertBook(Books books) {
        return booksMapper.insertBook(books);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books selectBookById(int id) {
        return booksMapper.selectBookById(id);
    }

    public List<Books> selectAllBooks() {
        return booksMapper.selectAllBooks();
    }

    public Books queryBookByName(String bookName) {
        return booksMapper.queryBookByName(bookName);
    }
}
