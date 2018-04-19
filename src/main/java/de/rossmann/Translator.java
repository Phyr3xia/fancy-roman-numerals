package de.rossmann;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Translator {

    private final Map<Integer, String> translations;

    public Translator() {
        super();
        translations = new HashMap<>();
        translations.put(1, "I");
        translations.put(2, "II");
        translations.put(3, "III");
        translations.put(4, "IV");
        translations.put(5, "V");
        translations.put(6, "VI");
        translations.put(7, "VII");
        translations.put(8, "VIII");
        translations.put(9, "IX");
        translations.put(10, "X");
        translations.put(11, "XI");
        translations.put(12, "XII");
        translations.put(13, "XIII");
        translations.put(14, "XIV");
        translations.put(15, "XV");
        translations.put(16, "XVI");
        translations.put(17, "XVII");
        translations.put(18, "XVIII");
        translations.put(19, "XIX");
        translations.put(20, "XX");
    }

    public Optional<String> translate(final int i) {
        if (translations.containsKey(i)) {
            return Optional.of(translations.get(i));
        }
        return Optional.empty();
    }

}
