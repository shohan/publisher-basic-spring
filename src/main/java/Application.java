import net.inno.service.BookService;
import net.inno.service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        BookService service = appContext.getBean("bookService", BookService.class);
        System.out.println(service.findAll().get(0).getTitle());
    }
}
