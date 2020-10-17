package com.longg.controller;

import com.longg.pojo.Books;
import com.longg.service.BooksService;
import com.longg.service.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author long
 * @date 2020/10/13
 */
@Controller
@RequestMapping("/book")
public class BooksController {
    @Autowired
    @Qualifier("BooksServiceImpl")
    private BooksService booksService;

    // 查询全部书籍，并返回到前端展示
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = booksService.selectAllBooks();
        model.addAttribute("list", list);
        return "allBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    // 处理添加书籍的请求
    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println(books);
        booksService.insertBook(books);
        return "redirect:/book/allBook";
    }

    // 跳转到增加书籍的页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = booksService.selectBookById(id);
        System.out.println(books);
        model.addAttribute("book",books );
        return "updateBook";
    }

    // 处理修改书籍的请求
    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        booksService.updateBook(book);
//        Books books = booksService.selectBookById(book.getBookID());
//        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }

    // 处理删除书籍的请求
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        booksService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    // 查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = booksService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if(books == null){
            list = booksService.selectAllBooks();
        }
        model.addAttribute("list", list);
        return "allBook";
    }

}
