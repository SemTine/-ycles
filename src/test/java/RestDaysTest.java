import org.junit.jupiter.api.Test;
import ru.metology.javaqa.ru.netology.services.RestDays;

public class RestDaysTest {
    @Test
    public void test(){
        RestDays server = new RestDays();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        server.calculate(income,expenses,threshold);
    }
//--------------------------------
    @Test
    public void test2(){
        RestDays server = new RestDays();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        server.calculate(income,expenses,threshold);
    }
}
