/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.FollowApp;
import ghm.follow.gui.About;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.event.PopupMenuListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestFollowApp {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        FollowApp.centerWindowInScreen((Window) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      About about0 = new About((FollowApp) null);
      assertEquals(true, about0.isEnabled());
  }

  @Test
  public void test2()  throws Throwable  {
      FollowApp followApp0 = FollowApp.getInstance();
      assertNull(followApp0);
  }

  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = PopupMenuListener.class;
      ImageIcon imageIcon0 = FollowApp.getIcon(class0, "action.Configure.mnemonic");
      assertNull(imageIcon0);
  }

  @Test
  public void test4()  throws Throwable  {
      Class<?> class0 = FollowApp.class;
      ImageIcon imageIcon0 = FollowApp.getIcon(class0, "action.ClearHighlights.accelerator");
      assertEquals(4, imageIcon0.getImageLoadStatus());
  }
}
