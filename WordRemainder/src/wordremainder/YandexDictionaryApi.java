/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordremainder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;

/**
 *
 * @author igor
 */
public class YandexDictionaryApi {
    public ArrayList<String> sendRequest(String word) throws MalformedURLException, IOException {
        String apiKey = "dict.1.1.20150909T192757Z.a7faa86c794ef318.30842ee89a25dc7e5d02fc1c8562110f5d856a59";
        URL request = new URL(String.format("https://dictionary.yandex.net/api/v1/dicservice/lookup?key=%s&lang=en-ru&text=%s", apiKey, word));
                BufferedReader reader = new BufferedReader(
        new InputStreamReader( request.openStream() ));
        String line;
        ArrayList<String> response = new ArrayList<>();
        while ( (line = reader.readLine()) != null) {
            response.add(line);
        }
        return response;
    }
}
