/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordremainder;

/**
 *
 * @author igor
 */
public class ResponseHandler {
    public String remake(String word, String response) {
        String result = "";
        //for (int i = 0; i < response.length(); i++) {
        String[] tags = response.split("><");
        result = tags[5].replaceAll("text>", "");
        result = result.replaceAll("</text", "");
        //}
        return word + " - " + result + ";";
    }
}
