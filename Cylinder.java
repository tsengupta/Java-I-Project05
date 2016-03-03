import java.text.DecimalFormat;

/**
 * The purpose of this program is to store the label,
 * radius, and height. The Cylinder class also includes
 * methods to set and get each of these fields, as 
 * well as methods to calculate the diameter, circumference,
 * area, and volume of a Cylinder object, and to provide a
 * String value of the Cylinder object (i.e., the class
 * instance).
 * Project 05.
 * 
 * @author Trisha Sengupta - section 001
 * @version 10/5/2015
 */
public class Cylinder {
   private String label = "";
   private double radius = 0.0;
   private double height = 0.0;
   
  /**
   * Stores user information and has set and
   * get methods while also calculating equations. 
   * Initializes the variables to the inputed 
   * paramaters and trims label.
   * 
   * @param newLabel The name of the cylinder 
   * @param newRadius The radius of the cylinder
   * @param newHeight The height of the cylinder
   */
   public Cylinder(String newLabel, double newRadius, double newHeight) {
      label = newLabel.trim();
      radius = newRadius;
      height = newHeight;
   }
   
   /**
    * The String gets the label. 
    * 
    * @return String representation of label object  
    */
   String getLabel() {
      return label;
   }
   
   /** 
    * Checking to see if there has been an inputted label.
    * 
    * @return False if there is no label
    * @return True after it trims the label
    */
   boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      label = labelIn.trim();
      return true;
   }
   
   /**
    * Gets the radius of cylinder from user's input.
    *
    * @return The radius of the cylinder.
    */
   double getRadius() {
      return radius;
   }
   
   /**
    * Sets the radius of the cylinder.
    *
    * @param radiusIn Temporary variable in decimal format 
    * that the radius is set to.
    */
   void setRadius(double radiusIn) {
      radius = radiusIn;
   }
   
   /**
    * Gets the height of the cylinder from user's input.
    * 
    * @return The height of the cylinder.
    */
   double getHeight() {
      return height;
   }
   /**
    * Sets the height of the cylinder.
    *
    * @param heightIn Temporary variable in decimal format
    * that the height is set to.
    */
       
   void setHeight(double heightIn) {
      height = heightIn;
   }
   
   /**
    * Calculates diameter of the cylinder.
    *
    * @return The radius multiplied by two.
    */
   double diameter() {
      return radius * 2;
   }
   
   /** 
    * Calculates circumference of the cylinder.
    * 
    * @return The diameter multiplied by Pi.
    */
   double circumference() {
      return diameter() * Math.PI;
   }
   
   /**
    * Calculates area of the cylinder.
    *
    * @return The cirumference multiplied by the height
    * added to two multiplied by Pi times the radius
    * squared.
    */ 
   double area() {
      return (diameter() * Math.PI * height) 
         + (2 * Math.PI * Math.pow(radius, 2));
   }
   
   /**
    * Calculates volume of the cylinder.
    *
    * @return Pi multiplied by the radius squared times
    * the height.
    */
   double volume() {
      return Math.PI * Math.pow(radius, 2) * height;
   }
   
   /** Prints results as string.
    *
    * @return The String representation of the cylinder object.
    */
   public String toString() {
   
      DecimalFormat format = new DecimalFormat("#,##0.0##");
   
      return "\"" + label + "\" " + "is a cylinder with radius = " 
         + format.format(radius) + " units and height = " 
         + format.format(height) 
         + " units,\nwhich has diameter = " 
         + format.format(diameter()) + " units, circumference = " 
         + format.format(circumference()) + " units,\narea = " 
         + format.format(area()) + " square units, and volume = "
         + format.format(volume()) + " cubic units.";
   }
}
