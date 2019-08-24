package com.toby;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void sayHello() {
        Demo d = new Demo();
        String out = d.SayHello("toby");
        assertEquals("Hello toby", out);
    }
}