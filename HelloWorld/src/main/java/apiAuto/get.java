package apiAuto;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class get {
    public static void main(String args[]) {
        get("https://api.douban.com/v2/book/1220562").then().body("rating.average",is("7.3"));
    }
}
