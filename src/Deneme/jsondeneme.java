//package Deneme;
//
//import com.google.gson.Gson;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.Map;
//
//import static io.restassured.RestAssured.given;
//
//public class jsondeneme {
//
//    @BeforeTest
//    public static void setup() {
//    }
//
//    @Test
//    public void getRequest() {
//        RestAssured.baseURI = "https://gateway.onee.com/properties" +
//                "/list-filter?p_sort_by_newest=true&p_search_key=&p_" +
//                "start_date=2021-02-05T00:00:00&p_end_date=2021-02-06T00:00:00" +
//                "&page=0&size=8";
//        Response response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get()
//                .then().contentType(ContentType.JSON)
//                .extract().response();
//
//        String json = new Gson().toJson((Map) response.jsonPath().get());
//
//        JSONObject jsonObject = new JSONObject(json);
//        JSONObject data = jsonObject.getJSONObject("data");
//        JSONArray jsonArray = data.getJSONArray("content");
//        JSONObject array1 = jsonArray.getJSONObject(0);
//        int id = array1.getInt("id");
//        System.out.println(id);
//    }
//}