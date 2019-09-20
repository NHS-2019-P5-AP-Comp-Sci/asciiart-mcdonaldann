/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		System.out.println("\n");
		giraffeHead();
		giraffeNeck();
		giraffeBody();
		caption();
	}
	
	public static void giraffeHead() {
		System.out.println("  | |  //**  ___/\\");
		System.out.println("  | | //**  (___  |");
	}
	public static void giraffeNeck() {
		System.out.println("  | |//*        | \\");
		System.out.println("  |  /          |  \\");
		System.out.println("  | /*          |   \\");
		System.out.println("  | |           |    \\_______");
	}
	public static void giraffeBody() {
		System.out.println("  | |           |            |~~\"");
		System.out.println("  | |           |  _______   |");
		System.out.println(" /   \\         / /        / /");
		System.out.println("/     \\        | |        | |");
	}
	
	public static void caption() {
		System.out.println("\nA giraffe eating leaves from a tree.");
		
		
	}
}