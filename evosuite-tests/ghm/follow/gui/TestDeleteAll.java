/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.FollowApp;
import ghm.follow.gui.DeleteAll;
import java.io.IOException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDeleteAll {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DeleteAll deleteAll0 = new DeleteAll((FollowApp) null);
      assertEquals(true, deleteAll0.isEnabled());
  }
}