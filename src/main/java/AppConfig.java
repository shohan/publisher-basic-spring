import net.inno.repository.BookRepository;
import net.inno.repository.BookRepositoryImpl;
import net.inno.service.BookService;
import net.inno.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "bookService")
    public BookService getBookService() {

        BookServiceImpl bookService = new BookServiceImpl(getBookRepository());
        //for setter injection
//        BookServiceImpl bookService = new BookServiceImpl();
//        bookService.setBookRepository(getBookRepository());
        return bookService;
    }

    @Bean(name = "bookRepository")
    public BookRepository getBookRepository(){
        return new BookRepositoryImpl();
    }
}
