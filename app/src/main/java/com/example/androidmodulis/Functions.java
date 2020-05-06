package com.example.androidmodulis;

import android.content.Context;
import android.widget.Toast;

public class Functions {
    public static int countWords(String input) {

        return input.trim().split("\\s+").length;

    }

    public static int countChars(String input) {

        return input.length();

    }
}
