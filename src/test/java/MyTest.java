import com.longg.pojo.Books;
import com.longg.service.BooksServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author long
 * @date 2020/10/13
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksServiceImpl booksServiceImpl = (BooksServiceImpl) context.getBean("BooksServiceImpl");
        for (Books book : booksServiceImpl.selectAllBooks()) {
            System.out.println(book);
        }
    }
}
