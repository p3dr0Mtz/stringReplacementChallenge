package com.bitso.pedrochallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProjectUtils {
    private static final String STRING_REGEX = "^[a-z]+$";

    private ProjectUtils() {
    }

    public static boolean validateFormat(String inputString) {
        Pattern patterCompile = Pattern.compile(STRING_REGEX);
        Matcher matcher = patterCompile.matcher(inputString.trim());

        return matcher.find();
    }

    public static String getReplacedString(String inputString) {
        StringBuilder stringBuffer = new StringBuilder();

        for (char charElement : inputString.trim().toCharArray()) {
            if ((int) charElement == 122)
                stringBuffer.append((char) 97);
            else
                stringBuffer.append((char) ((int) charElement + 1));
        }

        return stringBuffer.toString();
    }
}
