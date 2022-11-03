package co.com.soaprest.util;

import java.util.*;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class GetListFrom {
    public static List<String> json(String primaryProperty){
        Set<Map.Entry<String, String>> testDataAux = ((HashMap<String, String>)lastResponse()
                .jsonPath().getList(primaryProperty).get(0)).entrySet();
        List<String> keysData = new ArrayList<>();
        for (Map.Entry<String, String> stringStringEntry : testDataAux){
            String key = stringStringEntry.getKey();
            keysData.add(key);
        }
    Collections.sort(keysData);
        return keysData;
    }

    public static List<String> dataComparision(List<String> primaryProperty){
        Collections.sort(primaryProperty);
        return primaryProperty;
    }

    private GetListFrom(){

    }
}
