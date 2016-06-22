package br.com.hamamoto.challenge3.business;


import br.com.hamamoto.challenge3.infraestructure.exception.StreamWitCharRepetitionException;
import br.com.hamamoto.challenge3.model.Stream;

import java.util.LinkedHashMap;

public class Challenge3 {

    public static char firstChar(Stream input) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        while (input.hasNext()) {
            char current = input.getNext();

            int count = 1;
            if (map.containsKey(current)) {
                count += map.get(current);
            }
            map.put(current, count);
        }

        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        throw new StreamWitCharRepetitionException();
    }

}
