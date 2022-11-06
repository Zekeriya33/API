package test_data;

import java.util.HashMap;
import java.util.Map;

public class JsonPlaceHolederTestData {

    public Map<String, Object> expectedDataMapMethod(Integer userId, String title, Boolean completed) {


        Map<String, Object> expectedData = new HashMap<>();
        if (userId != null) {
            expectedData.put("userId", userId);
        }
        if (title != null) {
            expectedData.put("title", title);
        }
        if (completed != null) {
            expectedData.put("completed", completed);
        }

        return expectedData;


    }
    public String expectedDataInString(Integer userId,String title,Boolean completed){ // dinamik expected data methodu
        // Json datayı String bir conteynır olarak return eder

        String expectedData = " {\n" +
                "                 \"userId\": "+userId+",\n" +
                "                 \"title\": \""+title+"\",\n" +
                "                 \"completed\": "+completed+"\n" +
                "               }";


        return expectedData;
    }




}
/*
 {
                 "userId": 55,
                 "title": "Tidy your room",
                 "completed": false
               }
 */
