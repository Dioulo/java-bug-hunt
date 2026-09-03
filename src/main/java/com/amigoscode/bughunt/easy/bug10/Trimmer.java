package com.amigoscode.bughunt.easy.bug10;

public class Trimmer {

    public String cleanup(String input) {
        //the String Object is immutable
        //input.trim().toLowerCase();
        //input.toLowerCase();
        return input.trim().toLowerCase();
    }
}
