/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.gui.FileFollowingPane;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.plaf.FontUIResource;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestFileFollowingPane {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      fileFollowingPane0.isFollowingPaused();
      assertEquals(false, fileFollowingPane0.autoPositionCaret());
      assertEquals(3, fileFollowingPane0.getComponentCount());
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      fileFollowingPane0.pauseFollowing();
      assertEquals(true, fileFollowingPane0.isFollowingPaused());
      assertEquals(3, fileFollowingPane0.countComponents());
  }

  @Test
  public void test2()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      File file1 = fileFollowingPane0.getFollowedFile();
      assertEquals(false, fileFollowingPane0.autoPositionCaret());
      assertEquals(3, fileFollowingPane0.countComponents());
      assertNotNull(file1);
  }

  @Test
  public void test3()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      fileFollowingPane0.setAutoPositionCaret(false);
      assertEquals(false, fileFollowingPane0.autoPositionCaret());
      assertEquals(3, fileFollowingPane0.getComponentCount());
  }

  @Test
  public void test4()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      fileFollowingPane0.unpauseFollowing();
      assertEquals(false, fileFollowingPane0.autoPositionCaret());
      assertEquals(3, fileFollowingPane0.getComponentCount());
  }

  @Test
  public void test5()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      fileFollowingPane0.isFollowing();
      assertEquals(false, fileFollowingPane0.autoPositionCaret());
      assertEquals(3, fileFollowingPane0.countComponents());
      assertEquals(3, fileFollowingPane0.getComponentCount());
  }

  @Test
  public void test6()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      SearchableTextPane searchableTextPane0 = fileFollowingPane0.getTextPane();
      assertEquals(false, searchableTextPane0.isEditable());
      assertEquals(false, fileFollowingPane0.autoPositionCaret());
      assertEquals(-1042, searchableTextPane0.getTabSize());
      assertNotNull(searchableTextPane0);
      assertEquals(3, fileFollowingPane0.getComponentCount());
  }

  @Test
  public void test7()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      boolean boolean0 = fileFollowingPane0.autoPositionCaret();
      assertEquals(3, fileFollowingPane0.countComponents());
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      File file0 = new File("");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getLeafIcon();
      JRadioButton jRadioButton0 = new JRadioButton("", icon0);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButton0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, (-1042), (-1042), false, (Font) fontUIResource0, (-1042));
      assertNotNull(fileFollowingPane0);
      
      fileFollowingPane0.clear();
      assertEquals(false, fileFollowingPane0.autoPositionCaret());
      assertEquals(3, fileFollowingPane0.getComponentCount());
  }
}