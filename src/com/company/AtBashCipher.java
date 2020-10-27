package com.company;

import java.util.ArrayList;
import java.util.List;

class AtBashCipher implements Cipher {
    private List<Character> alphabet;

    public AtBashCipher() {
        alphabet = new ArrayList<>();
        for(char  i = 'a'; i <= 'z'; i++){
            alphabet.add(i);
        }
    }

    @Override
    public String decode(String message) {
        return null;
    }

    @Override
    public String encode(String message) {

        StringBuilder encode = new StringBuilder();


        for (char c: message.toLowerCase().toCharArray()
        ) {
            if(c != ' '){
                encode.append(alphabet.get((alphabet.size() - 1) - alphabet.indexOf(c)));
            }else{
                encode.append(" ");
            }
        }

        return encode.toString();
    }
}