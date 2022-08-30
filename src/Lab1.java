
public class Lab1 {

  public static void main(String[] args) {
      //Week 1 Lab 1 Operations 
    
      int availablePlaneSeats = 5;
      
      double costOfGroceries  = 59.95; 
      
      char middleInitial = 'Y';
      
      boolean isHotOutside = false;
      
      String firstNameIs = "Alex";
      
      String streetAddress = "2307 NW 27th Terrace, Fort Myers, FL 33905"; 
      
      System.out.println("Available seats left on the plane: " + availablePlaneSeats);
      System.out.println("$" + costOfGroceries + " is the cost of groceries");
      System.out.println("The person's Middle initial is " + middleInitial);
      System.out.println(isHotOutside);
      System.out.println("the customer's first name is " + firstNameIs);
      System.out.println(streetAddress + " is where the person lives.");
      
      
        //Week 1 Lab 2 Operations
      
      availablePlaneSeats = availablePlaneSeats -2;
      availablePlaneSeats -= 2;
      System.out.println(availablePlaneSeats);
      
      //costOfGroceries = costOfGroceries + 2.15;
      costOfGroceries += 2.15; 
      System.out.println("$" + costOfGroceries + " is the updated cost of groceries");
      
      middleInitial = 'L';
      System.out.println("The person's Middle Initial is now updated to " + middleInitial);
      
      isHotOutside = !isHotOutside;
      System.out.println(isHotOutside);
      
      String fullName = firstNameIs + " " + middleInitial + " Fontal";
      System.out.println("The customer's full name is " + fullName);
      
      System.out.println("Hello! My name is " + fullName + " and I live at " + streetAddress + ".");
       
    
  }

}
