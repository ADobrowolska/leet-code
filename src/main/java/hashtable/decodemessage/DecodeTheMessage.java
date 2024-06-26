package hashtable.decodemessage;

/*
#2325
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps
to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet),
we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').

        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
 */


import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {

    public static String decodeMessage(String key, String message) {
        char alph = 'a';
        Map<Character, Character> map = new HashMap<>();
        String replaceStr = key.replace(" ", "");
        for (int i = 0; i < replaceStr.length(); i++) {
            if (!map.containsKey(replaceStr.charAt(i))){
                map.put(replaceStr.charAt(i), alph++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                sb.append(map.get(message.charAt(i)));
            }else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }


}
