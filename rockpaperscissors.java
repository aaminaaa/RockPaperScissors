/* ITSS 3311.501
   Project 3
   Amina Hussain 
*/

//rock-paper-scissors against the computer 1000 times
package rockpaperscissors;

public class rockpaperscissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 0;
		int user = 0;
		int computer = 0;
		
/* Assume the following:
   rock = 1
   paper = 2
   scissors = 3    
*/

/* executed code for when the user 
   plays rock for games 1 - 400
*/
	int i;
    for(i = 1; i <= 400; i++) {
    	user = 1;
    	computer = 1 + (int)(3*Math.random());
     if(computer == 1) {
         amount += 0; 
     if(computer == 2) {
    	 amount -= 1;
     if (computer == 3) {
    	 amount += 2;
    	
     } //end last if-statement
     } //end second if-statement
     } //end first if-statement
    } //end for loop

/* executed code for when the user 
   plays paper for games 401 - 700
*/
    for(i = 401; i <= 700; i++) {
    	user = 2;
    	computer = 1 + (int)(3*Math.random());
     if(computer == 1) {
    	 amount += 2;
     if(computer == 2) {
    	 amount += 0;
     if (computer == 3) {
    	 amount -= 1;
    	
     } //end last if-statement
     } //end second if-statement
     } //end first if-statement
    } //end for loop
 
/* executed code for when the user 
   plays scissors for games 701 - 1000
*/
     for(i = 701; i <= 1000; i++) {
     	user = 3;
     	computer = 1 + (int)(3*Math.random());
      if(computer == 1) {
     	 amount -= 1;
      if(computer == 2) {
     	 amount += 2;
      if (computer == 3) {
    	 amount += 0;
     	
      } //end last if-statement
      } //end second if-statement
      } //end first if-statement
     } //end for loop
     
     System.out.println("You made: $" + amount);
    
    } //end class
		
} //end void main


