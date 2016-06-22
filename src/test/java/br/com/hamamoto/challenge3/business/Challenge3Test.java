package br.com.hamamoto.challenge3.business;

import br.com.hamamoto.challenge3.infraestructure.exception.StreamWitCharRepetitionException;
import br.com.hamamoto.challenge3.model.CharArrayStream;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Challenge3Test {


    private CharArrayStream lowerCaseTextStream;
    private CharArrayStream upperCaseTextStream;
    private CharArrayStream camelCaseTextStream;
    private CharArrayStream setenceTextInput;
    private CharArrayStream sameCharacterDifferentCaseTextInput;
    private CharArrayStream repeteadCharTextStream;

    @Before
    public void setUp() throws Exception {
        lowerCaseTextStream = new CharArrayStream("lalilulelo".toCharArray());
        upperCaseTextStream = new CharArrayStream("CABADABA".toCharArray());
        camelCaseTextStream = new CharArrayStream("valarMorghulisValarDohaeris".toCharArray());
        setenceTextInput = new CharArrayStream("In a hole in the ground there lived a hobbit".toCharArray());
        sameCharacterDifferentCaseTextInput = new CharArrayStream("AAAAAaAAAAA".toCharArray());
        repeteadCharTextStream = new CharArrayStream("aaabbbAAABBB".toCharArray());
    }

    @Test
    public void shouldGetTheFirstUnrepeatableCharFromALowerCaseInput() {
        char first = Challenge3.firstChar(lowerCaseTextStream);

        assertThat(first, is('a'));
    }

    @Test
    public void shouldGetTheFirstUnrepeatableCharFromAUpperCaseInput() {
        char first = Challenge3.firstChar(upperCaseTextStream);

        assertThat(first, is('C'));
    }

    @Test
    public void shouldGetTheFirstUnrepeatableCharFromACamelCaseInput() {
        char first = Challenge3.firstChar(camelCaseTextStream);

        assertThat(first, is('v'));
    }

    @Test
    public void shouldGetTheFirstUnrepeatableCharFromASentenceInput() {
        char first = Challenge3.firstChar(setenceTextInput);

        assertThat(first, is('I'));
    }

    @Test
    public void shouldGetTheFirstUnrepeatableCharFromAInputWithSameCharacterButDifferentCaseInput() {
        char first = Challenge3.firstChar(sameCharacterDifferentCaseTextInput);

        assertThat(first, is('a'));
    }

    @Test(expected = StreamWitCharRepetitionException.class)
    public void shouldNotGetTheFirstUnrepeatableCharFromARepeteadCharInput() {
        Challenge3.firstChar(repeteadCharTextStream);
    }


}