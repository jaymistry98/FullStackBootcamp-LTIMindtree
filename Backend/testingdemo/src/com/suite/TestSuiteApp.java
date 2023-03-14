package com.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.app.CalculatorTest;
import com.app2.TestCase2;

@RunWith(Suite.class)
@SuiteClasses({TestCase2.class, CalculatorTest.class})
public class TestSuiteApp {

}
