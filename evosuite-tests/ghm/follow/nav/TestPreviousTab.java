/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.nav;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.FollowApp;
import ghm.follow.gui.FollowAppAction;
import ghm.follow.nav.PreviousTab;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestPreviousTab {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PreviousTab previousTab0 = new PreviousTab((FollowApp) null);
      assertEquals(FollowAppAction.ActionContext.MULTI_FILE, previousTab0.getContext());
  }
}
