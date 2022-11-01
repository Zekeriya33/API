package test_data;

import java.util.HashMap;
import java.util.Map;

public class JsonPlaceHolederTestData {

    public Map<String,Object> expectedDataMapMethod(Integer userId, String title, Boolean completed){


    Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("userId",1);
        expectedData.put("title","quis ut nam facilis et officia qui");
        expectedData.put("completed",false);

            return expectedData;


    }


}
