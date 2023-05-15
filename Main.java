package JavaFiles;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// This Program is written by Abu Sufian Shanto
		System.out.println("Hi :)\n");
		System.out.println("I am your Virtual Assistant from Doctors. I am here to help you :)");
		System.out.println("\nWhich city do you prefer: \n");
		System.out.println("1. Dhanmondi\n2. Mirpur\n3. Banani\n");
		System.out.println("Press 1/2/3 to choose the City.");
		Scanner input = new Scanner(System.in);
		int city = input.nextInt();
		
		switch(city) {
		case 1: 
			System.out.println("You have chosen 1. Dhanmondi.\n");
			break;
		case 2: 
			System.out.println("You have chosen 2. Mirpur.\n");
			break;
		case 3: 
			System.out.println("You have chosen 3. Banani.\n");
			break;
		default:
			System.out.println("Error 404");
		}
		if(city==1) {
			System.out.println("Hey! You have settled in Dhanmondi.\n");
			System.out.println("What are you looking for: \n");
			System.out.println("1. Allergists/Immunologists\n2. Anesthesiologists\n3. Cardiologists");
			System.out.println("4. Colon and Rectal Surgeons\n5. Dermatologists\n6. Endocrinologists");
			//System.out.println("7. Emergency Medicine Specialists\n8. Family Physicians\n9. Gastroenterologists\n10. Geriatric Medicine Specialists");	
			System.out.println("\nPlease type a number from 1 to 3 to choose.");
			int speciality = input.nextInt();
			switch(speciality) {
			case 1:
				System.out.println("You have choose Allergists. Here are the best Allergists in Dhamondi.");
				String doc_allergists[] = {"Dr. Anisul Hoque", "Dr Maria Beuthe", "Dr. Robiul Hawladar", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg = doc_allergists[new Random().nextInt(doc_allergists.length)];
				System.out.println();
				if(bestsugg.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 2:
				System.out.println("You have choosen Anesthesiologists. Here are the best Anesthesiologists in Dhamondi.");
				String doc_anesthesio[] = {"Dr. Anisul Hoque", "Dr Maria Beuthe", "Dr. Robiul Hawladar", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg2 = doc_anesthesio[new Random().nextInt(doc_anesthesio.length)];
				System.out.println();
				if(bestsugg2.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 3:
				System.out.println("You have choosen Cardiologists. Here are the best Cardiologists in Dhamondi.");
				String doc_cardio[] = {"Dr. Anisul Hoque", "Dr Maria Beuthe", "Dr. Robiul Hawladar", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg3 = doc_cardio[new Random().nextInt(doc_cardio.length)];
				System.out.println();
				if(bestsugg3.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 4:
				System.out.println("You have choosen Colon and Rectal Surgeons. Here are the best Rectal Surgeons in Dhamondi.");
				String doc_colon_rec[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg4 = doc_colon_rec[new Random().nextInt(doc_colon_rec.length)];
				System.out.println();
				if(bestsugg4.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 5:
				System.out.println("You have choosen Dermatologists. Here are the best Dermatologists Endocrinologists in Dhamondi.");
				String doc_derma[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg5 = doc_derma[new Random().nextInt(doc_derma.length)];
				System.out.println();
				if(bestsugg5.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 6:
				System.out.println("You have choosen Endocrinologists. Here are the best Endocrinologists in Dhamondi.");
				String doc_endo[] = {"Dr. Anisul Hoque", "Dr Maria Beuthe", "Dr. Robiul Hawladar", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg6 = doc_endo[new Random().nextInt(doc_endo.length)];
				System.out.println();
				if(bestsugg6.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			default:
				System.out.println("Error 404");
			}
			
		}
		if(city==2) {
			System.out.println("Hey! You have settled in Mirpur.\n");
			System.out.println("What are you looking for: \n");
			System.out.println("1. Allergists/Immunologists\n2. Anesthesiologists\n3. Cardiologists");
			System.out.println("4. Colon and Rectal Surgeons\n5. Dermatologists\n6. Endocrinologists");
			//System.out.println("7. Emergency Medicine Specialists\n8. Family Physicians\n9. Gastroenterologists\n10. Geriatric Medicine Specialists");	
			System.out.println("\nPlease type a number from 1 to 3 to choose.");
			int speciality = input.nextInt();
			switch(speciality) {
			case 1:
				System.out.println("You have choose Allergists. Here are the best Allergists in Mirpur.");
				String doc_allergists[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg = doc_allergists[new Random().nextInt(doc_allergists.length)];
				System.out.println();
				if(bestsugg.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 2:
				System.out.println("You have choosen Anesthesiologists. Here are the best Anesthesiologists in Mirpur.");
				String doc_anesthesio[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg2 = doc_anesthesio[new Random().nextInt(doc_anesthesio.length)];
				System.out.println();
				if(bestsugg2.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 3:
				System.out.println("You have choosen Cardiologists. Here are the best Cardiologists in Mirpur.");
				String doc_cardio[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg3 = doc_cardio[new Random().nextInt(doc_cardio.length)];
				System.out.println();
				if(bestsugg3.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 4:
				System.out.println("You have choosen Colon and Rectal Surgeons. Here are the best Rectal Surgeons in Mirpur.");
				String doc_colon_rec[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg4 = doc_colon_rec[new Random().nextInt(doc_colon_rec.length)];
				System.out.println();
				if(bestsugg4.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 5:
				System.out.println("You have choosen Dermatologists. Here are the best Dermatologists Endocrinologists in Mirpur.");
				String doc_derma[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg5 = doc_derma[new Random().nextInt(doc_derma.length)];
				System.out.println();
				if(bestsugg5.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 6:
				System.out.println("You have choosen Endocrinologists. Here are the best Endocrinologists in Mirpur.");
				String doc_endo[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg6 = doc_endo[new Random().nextInt(doc_endo.length)];
				System.out.println();
				if(bestsugg6.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			default:
				System.out.println("Error 404");
			}
			
		}
		if(city==3) {
			System.out.println("Hey! You have settled in Banani.\n");
			System.out.println("What are you looking for: \n");
			System.out.println("1. Allergists/Immunologists\n2. Anesthesiologists\n3. Cardiologists");
			System.out.println("4. Colon and Rectal Surgeons\n5. Dermatologists\n6. Endocrinologists");
			//System.out.println("7. Emergency Medicine Specialists\n8. Family Physicians\n9. Gastroenterologists\n10. Geriatric Medicine Specialists");	
			System.out.println("\nPlease type a number from 1 to 3 to choose.");
			int speciality = input.nextInt();
			switch(speciality) {
			case 1:
				System.out.println("You have choose Allergists. Here are the best Allergists in Banani.");
				String doc_allergists[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg = doc_allergists[new Random().nextInt(doc_allergists.length)];
				System.out.println();
				if(bestsugg.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 2:
				System.out.println("You have choosen Anesthesiologists. Here are the best Anesthesiologists in Banani.");
				String doc_anesthesio[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg2 = doc_anesthesio[new Random().nextInt(doc_anesthesio.length)];
				System.out.println();
				if(bestsugg2.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg2.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg2);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 3:
				System.out.println("You have choosen Cardiologists. Here are the best Cardiologists in Banani.");
				String doc_cardio[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg3 = doc_cardio[new Random().nextInt(doc_cardio.length)];
				System.out.println();
				if(bestsugg3.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg3.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg3);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 4:
				System.out.println("You have choosen Colon and Rectal Surgeons. Here are the best Rectal Surgeons in Banani.");
				String doc_colon_rec[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg4 = doc_colon_rec[new Random().nextInt(doc_colon_rec.length)];
				System.out.println();
				if(bestsugg4.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg4.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg4);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 5:
				System.out.println("You have choosen Dermatologists. Here are the best Dermatologists Endocrinologists in Banani.");
				String doc_derma[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg5 = doc_derma[new Random().nextInt(doc_derma.length)];
				System.out.println();
				if(bestsugg5.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg5.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg5);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			case 6:
				System.out.println("You have choosen Endocrinologists. Here are the best Endocrinologists in Banani.");
				String doc_endo[] = {"Dr. Anisul Hoque", "Dr. Robiul Hawladar", "Dr Maria Beuthe", "Dr. Musarrat Hossain", "Dr. Maisha Hossain"};
				String bestsugg6 = doc_endo[new Random().nextInt(doc_endo.length)];
				System.out.println();
				if(bestsugg6.equalsIgnoreCase("Dr. Anisul Hoque")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: School Road 25\nDhanmondi 32");
					System.out.println("Phone: +8801627834614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Maria Beuthe")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Dangerous Road 54\nDhanmondi 32");
					System.out.println("Phone: +8801627834634");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Musarrat Hossain")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Chipa Road 23\nDhanmondi 32");
					System.out.println("Phone: +8801627654614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Robiul Hawladar")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Address: Main Road 65\nDhanmondi");
					System.out.println("Phone: +8801537654614");
				}
				if(bestsugg6.equalsIgnoreCase("Dr. Maisha Hossain")) {
					System.out.println("Name: " +bestsugg6);
					System.out.println("Shudlar Road 84\nDhanmondi 32");
					System.out.println("Phone: +8801627834334");
				}
				break;
			default:
				System.out.println("Error 404");
			}
		}	
	}
}

