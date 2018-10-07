package apiAuto;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.module.jsv.JsonSchemaValidator.*;

public class get {
    public static void main(String args[]) {
        get("https://api.douban.com/v2/book/1220562").then().body("rating.average",is("7.3"));
    }
}
