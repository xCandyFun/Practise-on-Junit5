package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // This is for me to practise on junit 5 test

    Main main = new Main();

    @Test
    void oneplusone(){
        int a = 2;
        int b = 3;

        // Here are the test using the method inside main class
        // The logic come from the method
        int result = main.Add(a,b);

        assertEquals(5,result);
    }
}