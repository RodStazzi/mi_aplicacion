package com.ejemplo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    AppTest1.class,
    AppTest2.class
})
public class AppTest {
}