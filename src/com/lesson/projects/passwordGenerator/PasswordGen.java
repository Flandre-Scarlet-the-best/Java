package com.lesson.projects.passwordGenerator;

import java.util.Random;

public class PasswordGen {
    byte currentWord;
    final char [] english = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
            'u','v', 'w','x','y','z','A','B','C','D','E','F','G','H','I','K','L','M','N','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z',',','.','!','&','@','#','$','%','^','&','*','(',')','-','=','+','~',
            ']','[','{','}'};
    void generator(){
        StringBuilder sb = new StringBuilder();
        Random randfirst = new Random();
        Random rand = new Random(randfirst.nextInt());
        for (int i = 0; i < currentWord; i++) {
            sb.append(english[rand.nextInt(0,english.length)]);
        }
        System.out.println(sb);
    }
    boolean checkPass(){
        return currentWord>30;
    }
}
