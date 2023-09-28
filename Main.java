import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    try (Scanner scan = new Scanner(System.in)) {
			ArrayList <Integer> Age = new ArrayList<>();
			ArrayList <String> Name = new ArrayList<>();
			ArrayList <String> Gender = new ArrayList<>();
			ArrayList <String> Address = new ArrayList<>();
			ArrayList <Character> Initial = new ArrayList<>();
	    	
			int menu;
	
	do {		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("1. Input New Candidate");
		System.out.println("2. View Candidate's Data");
		System.out.println("3. Remove Candidate");
		System.out.println("4. Exit");
		System.out.println("Choose: ");
	

   try{
	   menu = scan.nextInt();
	}catch(Exception e) {
	menu = 0;
	System.out.println("Must be a number");
	scan.nextLine();
	}
   
	scan.nextLine();
	
		int age;
		String name, gender, address;
		char word = 0;

			switch (menu){
			   
			    case 1:
			
			        do{
			            System.out.println("Input candidate's name [5..20]: ");
			            name = scan.nextLine();
			            if (name.isEmpty()) {
			    			System.out.println("No recipes!");
			         }
			        }while  (!name.contains(" ") || name.length()< 5 || name.length()> 20);
			    
			    
			        do{
			            System.out.println("Input candidate's gender [male/female]: ");
			            gender = scan.nextLine();
			        }while (!gender.equals("female") && !gender.equals("male"));
			    
			    
			        do{
			            System.out.println("Input candidate's address [must be ended with 'street']: ");
			            address = scan.nextLine();
			        }while (!address.endsWith(" street"));
			    
			    
			        do{
			            System.out.println("Input candidate's age [17..30]: ");
			            age = scan.nextInt();
			        }while (age < 17 || age > 30);
			    
			    
			    	scan.nextLine();
			    
			    	  
			        	System.out.print("Thank you for registering! Your initial is: ");
			        	String words[] = name.split(" ");
			        	for(String s : words) {
			        	 word =  Character.toUpperCase(s.charAt(0));
			            System.out.print(word);
			            }
			          
			          scan.nextLine();
			          
			     Name.add(name);
			     Age.add(age);
			     Gender.add(gender);
			     Address.add(address);
			     Initial.add(word);
		
				continue;
			        
			    case 2:
			    	if (Name.isEmpty() && Gender.isEmpty()&& Address.isEmpty()) {
						System.out.println("No Data!");
						scan.nextLine();
						} else {
							
							System.out.println("---------------------------------------------------");
							System.out.println("|No.|Name   |Initial |Gender  |Age  |Address     |");
							System.out.println("---------------------------------------------------");
							
							for (int i = 0; i < Name.size(); i++) {
							System.out.println("|" + (i+1) + " |" + Name.get(i) + " |"+ Initial.get(i) + " |" + Gender.get(i) + " |" + Age.get(i) + " |" + Address.get(i)+ " |");
							System.out.println("---------------------------------------------------");
							}		
						scan.nextLine();
						}	  
						continue;	
						
			    case 3:
			    	if (Name.isEmpty() && Gender.isEmpty()&& Address.isEmpty()) {
						System.out.println("No Data!");
						scan.nextLine();
						} else {
							
							System.out.println("---------------------------------------------------");
							System.out.println("|No.|Name   |Initial |Gender  |Age  |Address     |");
							System.out.println("---------------------------------------------------");
							for (int i = 0; i < Name.size(); i++) {
							System.out.println("|" + (i+1) + " |" + Name.get(i) + " |"+ Initial.get(i) + " |" + Gender.get(i) + " |" + Age.get(i) + " |" + Address.get(i)+ " |");
							System.out.println("---------------------------------------------------");
							}

								System.out.println("Input candidate to be removed [1..2] [0 for cancel]: ");
								int x = scan.nextInt();
								if (x == 0){
									System.out.println("Canceled!");
									scan.nextLine();
								
						}else if (x < Name.size()) {
								Name.remove(x);  
								Initial.remove(x);
							    Gender.remove(x);
							    Age.remove(x);
							    Address.remove(x);
								  
									System.out.println("Sucessfully Removed!");
								    System.out.println("---------------------------------------------------");
									System.out.println("|No.|Name   |Initial |Gender  |Age  |Address     |");
									System.out.println("---------------------------------------------------");
									for (int i = 0; i < Name.size(); i++) {
									System.out.println("|" + (i+1) + " |" + Name.get(i) + " |"+ Initial.get(i) + " |" + Gender.get(i) + " |" + Age.get(i) + " |" + Address.get(i)+ " |");
									System.out.println("---------------------------------------------------");
									}
						}
									scan.nextLine();	
									continue;		
								}
							    	
						
			  
			}	  
	}while (!(menu == 4));
    System.out.println("Terima kasih!");
	
	    
			}
	}
}