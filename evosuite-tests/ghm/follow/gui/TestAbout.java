/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.FollowApp;
import ghm.follow.gui.About;
import java.awt.event.ActionEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAbout {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      About about0 = new About((FollowApp) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "SwingDisplayedMnemonicIndexKey", (-768), "aZ2C(%evA[", (-768));
      // Undeclared exception!
      try {
        about0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}