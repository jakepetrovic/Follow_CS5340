/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.gui.LineEditorKit;
import javax.swing.text.Element;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestLineEditorKit {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LineEditorKit lineEditorKit0 = new LineEditorKit();
      lineEditorKit0.create((Element) null);
  }

  @Test
  public void test1()  throws Throwable  {
      LineEditorKit lineEditorKit0 = new LineEditorKit();
      lineEditorKit0.getViewFactory();
  }
}