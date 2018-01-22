package com.Madpoints;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // create empty hashmap with a string as the key and a boolean as the value
    static HashMap<String, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        // add key value pair to hashmap
	    map.put("Geralt", true);
	    map.put("Emhyr", false);

	    // get value from hasmap using key
        System.out.println(map.get("Geralt"));

        // check to see if a key exists in hashmap
        if (map.containsKey("Emhyr")) {
            System.out.println(true);
        }

        // check to see if a value exists in hashmap
        if (map.containsValue(Boolean.FALSE)) {
            System.out.println(true);
        }

        // iterate through a hashmap keys
        for (String s : map.keySet()) {
            System.out.println(s);
        }

        // iterate through hashmap values
        for (Boolean b : map.values()) {
            System.out.println(b);
        }

        // iterate through entry set (key and value)
        for (Map.Entry kv : map.entrySet()) {
            System.out.println(kv);
        }

        // remove key from hashmap
        map.remove("Emhyr");

        // should return print false
        if (map.containsKey("Emhyr")) {
            System.out.println(true);
        }
    }
}
