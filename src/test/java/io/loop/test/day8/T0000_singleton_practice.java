package io.loop.test.day8;

import org.testng.annotations.Test;

public class T0000_singleton_practice {
    @Test
    public void practice (){
        String str1 = T000_singleton_pattern_example.getWord();
        System.out.println("str1 " + str1);

        String str2 = T000_singleton_pattern_example.getWord();
        System.out.println("word is already assigned and has value");
    }
}
