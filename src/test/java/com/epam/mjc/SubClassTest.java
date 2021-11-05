package com.epam.mjc;

import org.junit.Test;

import junit.framework.TestCase;

public class SubClassTest extends TestCase {

  @Test
  public void testMethodCase2() {
    com.epam.mjc.case2.SuperClass s = new com.epam.mjc.case2.SubClass();
    try {
      s.method();
      assert false;
    } catch (RuntimeException e){
      assert true;
    }
  }

  @Test
  public void testMethodCase3() {
    com.epam.mjc.case3.SuperClass s = new com.epam.mjc.case3.SubClass();
    try {
      s.method();
      assert false;
    } catch (Exception e) {
      assert true;
    }
  }

}