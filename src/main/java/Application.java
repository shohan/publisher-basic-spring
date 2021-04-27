import net.inno.service.BookService;
import net.inno.service.BookServiceImpl;

public class Application {
    public static void main(String[] args) {
        BookService service = new BookServiceImpl();

        System.out.println(service.findAll().get(0).getTitle());
    }
}
