/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.gui.LineView;
import javax.swing.text.Element;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestLineView {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LineView lineView0 = new LineView((Element) null);
      assertEquals(0, lineView0.getViewCount());
  }
}
