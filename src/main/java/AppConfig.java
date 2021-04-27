import net.inno.repository.BookRepository;
import net.inno.repository.BookRepositoryImpl;
import net.inno.service.BookService;
import net.inno.service.BookServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "bookService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
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
