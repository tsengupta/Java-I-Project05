import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This program reads in the name of the input file from the
 * user and then reads list name and cylinder data from file,
 * creates Cylinder objects, stores them in a local ArrayList,
 * creates an CylinderList objects with the name of the list
 * and the ArrayList of Cylinder objects, and then prints the
 * CylinderList object followed summary information about the 
 * CylinderList object.
 * Project 05
 *
 * @author Trisha Sengupta - section 001
 * @version 10/5/15
 */
public class CylinderListApp {
/**
 * Reads file and collects information and displays calculations
 * and prints summary.
 *
 * @param args Command line arguments (not used).
 * @throws IOException Exception known, but ignored.
 */
   public static void main(String[] args) throws IOException {
      String fileName, cListName = "";
      ArrayList<Cylinder> listOCylinders = new ArrayList<Cylinder>(); 
      Scanner userInput = new Scanner(System.in);
      
      // Prints command for user to enter file name:
      System.out.print("Enter file name: ");
      // Prompts user for file name:
      fileName = userInput.nextLine();
      // Scans for file name and assigns to local variable:
      Scanner file = new Scanner(new File(fileName));
      cListName = file.nextLine();
      
      // Reads in cylinder data:
      while (file.hasNext()) {
         String cName;
         double rIn, hIn;
         
         cName = file.nextLine();
         rIn = Double.parseDouble(file.nextLine());
         hIn = Double.parseDouble(file.nextLine());
         
         Cylinder cIn = new Cylinder(cName, rIn, hIn);
         listOCylinders.add(cIn);
      }
     
     // Creates a CylinderList object:
      CylinderList cylinderOList = new CylinderList(cListName, listOCylinders);
     
     // Prints CylinderList object:  
      System.out.println(cylinderOList.toString());
      System.out.println(cylinderOList.summaryInfo());
   }
}