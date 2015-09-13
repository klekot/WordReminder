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
    String result;
    public String remake(String word, String response) {
        try {
        String[] tags = response.split("><");
        result = tags[5].replaceAll("text>", "");
        result = result.replaceAll("</text", "");
        return word + " - " + result + ";";
        } catch (ArrayIndexOutOfBoundsException e) {}
        result = "нет перевода";
        return word + " - " + result + ";";
    }
}
