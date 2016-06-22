package br.com.hamamoto.challenge3.model;

/**
 * Implementation which uses a char[] as strategy to iterate over elements
 */
public class CharArrayStream implements Stream {

    private char[] chars;
    int index = 0;

    public CharArrayStream(char[] chars) {
        this.chars = chars;
    }

    public char getNext() {
        return chars[index++];
    }

    public boolean hasNext() {
        return chars.length != index;
    }
}
