import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * This program stores the name of the list and an 
 * ArrayList of Cylinder objects. It also includes
 * that return the name of the list, number of Cylinder
 * objects in the CylinderList, total area, total volume
 * for all Cylinder objects in the Cylinder List. The
 * toString method returns a String containing the name
 * of the list followed by each Cylinder in the ArrayList,
 * and a summaryInfo method returns summary information
 * about the list.
 * Project 05.
 *
 * @author Trisha Sengupta - section 001
 * @version 10/5/15
 */
 
public class CylinderList {
   private String listName = "";
   private ArrayList<Cylinder> cylinder = new ArrayList<Cylinder>();
   
  /**
   * Stores name of list and an ArrayList of Cylinder objects.
   * Intializes variables to the inputted paramters.
   *
   * @param newList Accepts a parameter of type String 
   * representing the name of the list.
   * @param newCylinder A parameter of type 
   * ArrayList<Cylinder> representing the list of Cylinder
   * objects.
   */
    
   public CylinderList(String newList, ArrayList newCylinder) {
      listName = newList;
      cylinder = newCylinder;
   }
   /**
    * The String gets the name.
    *
    * @return String representation of name of list.
    */  
   public String getName() {
      return listName;
   }
   /**
    * Finds the number of Cylinder objects in ArrayList.
    *
    * @return If there are zero cylinder objects in the
    * list, zero should be returned. Int representation 
    * of the number of Cylinder objects in the CylinderList.
    */
   public int numberOfCylinders() {
      if (cylinder.isEmpty()) {
         return 0;
      }
      else {
         return cylinder.size();
      }
   }
   /**
    * Finds the total surface area of for all Cylinder objects in
    * list.
    *
    * @return If there are zero Cylinder objects in the list,
    * zero should be return. Double represetnation of total 
    * surface area.
    */
   public double totalArea() {
      double a = 0.0;
      
      if (cylinder.isEmpty()) {
         return 0.0;
      }
      
      else {
         for (int i = 0; i < numberOfCylinders(); i++) {
         
            a += cylinder.get(i).area();
         }
      }
      
      return a;
   }
   /**
    * Finds the total volume for all Cylinder objects in the list.
    *
    * @return If there are zero Cylinder objects in the list,
    * zero should be returned. Double representation of total volume.
    */
   public double totalVolume() {
      double b = 0.0;
      
      if (cylinder.isEmpty()) {
         return 0.0;
      }
      
      else {
         for (int i = 0; i < numberOfCylinders(); i++) {
            b += cylinder.get(i).volume();
         }
      }
      
      return b;
   }
   /**
    * Finds the total height for all Cylinder objects in the list.
    * 
    * @return If there are zero Cylinder objects in the list,
    * zero should be returned. Double representation of the total 
    * height.
    */
   public double totalHeight() {
      double c = 0.0;
      
      if (cylinder.isEmpty()) {
         return 0.0;
      }
      
      else {
         for (int i = 0; i < numberOfCylinders(); i++) {
            c += cylinder.get(i).getHeight();
         }
      }
      
      return c;
   }
   /**
    * Finds the total diameter for all Cylinder objects in the list.
    *
    * @return If there are zero Cylinder objects in the list,
    * zero should be returned. Double representation of total 
    * diameter.
    */ 
   public double totalDiameter() {
      double d = 0.0;
      
      if (cylinder.isEmpty()) {
         return 0.0;
      }
      
      else {
         for (int i = 0; i < numberOfCylinders(); i++) {
            d += cylinder.get(i).diameter();
         }
      }
      
      return d;
   }
   /**
    * Finds the average area for all Cylinder objects.
    *
    * @return If there are zero Cylinder objects in the list,
    * zero should be returned. Double representation of average 
    * area.
    */
   public double averageArea() {
      if (cylinder.isEmpty()) {
         return 0.0;
      }
      
      else {
         return totalArea() / numberOfCylinders();
      }
   }
   /**
    * Finds the average volume for all Cylinder objects in the list.
    *
    * @return If there are zero Cylinder objects in the list,
    * zero should be returned. Double representation of average 
    * volume.
    */
   public double averageVolume() {
      if (cylinder.isEmpty()) {
         return 0.0;
      }
      
      else {
         return totalVolume() / numberOfCylinders();
      }
   }
   /**
    * Gets the name of the list followed by each Cylinder
    * in the ArrayList.
    *
    * @return String containing the list name and each Cylinder
    * object.
    */
   public String toString() {
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < cylinder.size()) {
         result += "\n" + cylinder.get(index) + "\n"; 
         index++;  
      }   
      return result;
   }
   /**
    * Gets the name of the list followed various summary items:
    * number of cylinders, total area, total volume, total height,
    * total diameter, average area, average volume.
    *
    * @return String containing the list name and various summary
    * items.
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- " + getName() + " Summary -----"; 
      result += "\nNumber of Cylinders: " + numberOfCylinders();
      result += "\nTotal Area: " + df.format(totalArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nTotal Height: "  + df.format(totalHeight());
      result += "\nTotal Diameter: " + df.format(totalDiameter());
      result += "\nAverage Area: " + df.format(averageArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      
      return result;
   }
}