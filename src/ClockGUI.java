import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 * This class contains everything that would be needed to show a window on the screen
 * This class extends from the JFrame Library so it would be able to inherit everything that is in JFrame
 * 
 * @author Bola Gadalla
 *
 */
public class ClockGUI extends JFrame
{
   // Text area for the unsorted array
   JTextArea unsortedClockText = new JTextArea();
   // Text area for the sorted array
   JTextArea sortedClockText = new JTextArea();
   Container myContent = new Container();
   
   /**
    * 
    * @param title - The title of the window
    * @param width - The width of the window
    * @param height - The height of the window
    * @param unsorted - The unsorted array to be shown in the window
    * @param sorted - The sorted array to be shown in the window
    */
   public void ShowClockData(String title, int width, int height, UnsortedClockList unsorted, SortedClockList sorted)
   {
      // Sets Properties of the Window
      setTitle(title);
      setSize(width, height);
      setLocation(400, 200);
      setLayout(new GridLayout(1, 2));
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      // Adds the JTextArea to the layout of the window
      add(unsortedClockText);
      add(sortedClockText);
      
      // Sets the text of the array to the JTextArea
      unsortedClockText.setText(AddingClockDataToTextArea(unsorted));
      unsortedClockText.setEditable(false);
      sortedClockText.setText(AddingClockDataToTextArea(sorted));
      sortedClockText.setEditable(false);
      
      // Create a file tap
      CreateFileMenu();
      // Sets the window visible
      setVisible(true);
   }
   
   /**
    * Adds data from the clock array to the text area
    * @param clockArray - The array to get data from
    * @return returns a string with all the data from the array
    */
   private String AddingClockDataToTextArea(ClockList clockList)
   {
      String clockText = "";
      ClockNode cn = clockList.first.next;
      while(cn != null)
      {
         clockText += cn.data + "\n";
         cn = cn.next;
      }
      // Returns the string
      return clockText;
   }
   
   /**
    * Creates the File menu in the JFrame with two sub menus , Open and Quit
    */
   private void CreateFileMenu() 
   {
      // Creates an item and a menu bar
      JMenuItem item;
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      
      // Creates a menu called File
      JMenu fileMenu = new JMenu("File");
      FileMenuHandler fmh = new FileMenuHandler(this);
      item = new JMenuItem("Open"); // Open sub menu option
      item.addActionListener(fmh);
      fileMenu.add(item);
      fileMenu.addSeparator(); 
      item = new JMenuItem("Quit"); // Quit sub menu option
      item.addActionListener(fmh);
      fileMenu.add(item);
      menuBar.add(fileMenu);
   }
}
