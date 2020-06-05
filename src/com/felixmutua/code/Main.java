package com.felixmutua.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            List<String> strings = new ArrayList<>();
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    strings.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    strings.add("Fizz");
                } else if (i % 5 == 0) {
                    strings.add("Buzz");
                } else {
                    strings.add(i + "");
                }
            }
            System.out.println(strings);
        }

    }
