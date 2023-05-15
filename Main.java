package JavaFiles;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi :)");
        System.out.println("I am your Virtual Assistant for Doctors. I am here to help you :)");

        System.out.println("\nWhich city do you prefer?");
        System.out.println("1. Dhanmondi");
        System.out.println("2. Mirpur");
        System.out.println("3. Banani");

        System.out.println("Please enter the corresponding number to choose the city:");
        Scanner input = new Scanner(System.in);
        int city = input.nextInt();

        switch (city) {
            case 1:
                System.out.println("You have chosen Dhanmondi.\n");
                findDoctorsInDhanmondi();
                break;
            case 2:
                System.out.println("You have chosen Mirpur.\n");
                findDoctorsInMirpur();
                break;
            case 3:
                System.out.println("You have chosen Banani.\n");
                findDoctorsInBanani();
                break;
            default:
                System.out.println("Invalid city choice.");
        }
    }

    public static void findDoctorsInDhanmondi() {
        String[] specialties = {
                "Allergists/Immunologists",
                "Anesthesiologists",
                "Cardiologists",
                "Colon and Rectal Surgeons",
                "Dermatologists",
                "Endocrinologists"
        };

        Scanner input = new Scanner(System.in);

        System.out.println("What specialty are you looking for?");
        for (int i = 0; i < specialties.length; i++) {
            System.out.println((i + 1) + ". " + specialties[i]);
        }
        System.out.println("Please enter the corresponding number to choose:");

        int specialty = input.nextInt();
        if (specialty < 1 || specialty > specialties.length) {
            System.out.println("Invalid specialty choice.");
            return;
        }

        String[] doctors = {
                "Dr. Anisul Hoque",
                "Dr. Maria Beuthe",
                "Dr. Robiul Hawladar",
                "Dr. Musarrat Hossain",
                "Dr. Maisha Hossain",
                "Dr. Abu Sufian Shanto",
                "Dr. Mahbubur Rahman Mira", 
                "Dr. Alvina Akhter Badhon", 
                "Dr. Faizaan Rahman Zayaan",
                "Dr. Shahin Sultana",
                "Dr. Mahabub Alam Mishu",
                "Dr. Kakon Kabir",
                "Dr. Ayesha Akter",
                "Dr. Sharmin Akter Setu"
        };
        
        String [] phone = {
        		"+8801627834417",
        		"+8801627845518",
        		"+8801629834516",
        		"+8801621434588",
        		"+8801629634514",
        		"+8801627832518",
        		"+8801627834871",
        		"+8801627834514",
        		"+8801627834596",
        		"+8801627834565",
        		"+8801627834525",
        		"+8801627834516",
        		"+8801627834534",
        };

        String selectedDoctor = doctors[new Random().nextInt(doctors.length)];
        String numbers = phone[new Random().nextInt(phone.length)];

        System.out.println("You have chosen " + specialties[specialty - 1] + ".");
        System.out.println("Here is one of the best doctors in Dhanmondi for " + specialties[specialty - 1] + ":");
        System.out.println("Name: " + selectedDoctor);
        System.out.println("Address: Main Road 54\nDhanmondi 32");
        System.out.println("Phone: "+numbers);
    }

    public static void findDoctorsInMirpur() {
        // Implement the logic to find doctors in Mirpur area
    	String[] specialties = {
                "Allergists/Immunologists",
                "Anesthesiologists",
                "Cardiologists",
                "Colon and Rectal Surgeons",
                "Dermatologists",
                "Endocrinologists"
        };

        Scanner input = new Scanner(System.in);

        System.out.println("What specialty are you looking for?");
        for (int i = 0; i < specialties.length; i++) {
            System.out.println((i + 1) + ". " + specialties[i]);
        }
        System.out.println("Please enter the corresponding number to choose:");

        int specialty = input.nextInt();
        if (specialty < 1 || specialty > specialties.length) {
            System.out.println("Invalid specialty choice.");
            return;
        }

        String[] doctors = {
                "Dr. Anisul Hoque",
                "Dr. Maria Beuthe",
                "Dr. Robiul Hawladar",
                "Dr. Musarrat Hossain",
                "Dr. Maisha Hossain",
                "Dr. Abu Sufian Shanto",
                "Dr. Mahbubur Rahman Mira", 
                "Dr. Alvina Akhter Badhon", 
                "Dr. Faizaan Rahman Zayaan",
                "Dr. Shahin Sultana",
                "Dr. Mahabub Alam Mishu",
                "Dr. Kakon Kabir",
                "Dr. Ayesha Akter",
                "Dr. Sharmin Akter Setu"
        };
        
        String [] phone = {
        		"+8801627834417",
        		"+8801627845518",
        		"+8801629834516",
        		"+8801621434588",
        		"+8801629634514",
        		"+8801627832518",
        		"+8801627834871",
        		"+8801627834514",
        		"+8801627834596",
        		"+8801627834565",
        		"+8801627834525",
        		"+8801627834516",
        		"+8801627834534",
        };

        String selectedDoctor = doctors[new Random().nextInt(doctors.length)];
        String numbers = phone[new Random().nextInt(phone.length)];


        System.out.println("You have chosen " + specialties[specialty - 1] + ".");
        System.out.println("Here is one of the best doctors in Dhanmondi for " + specialties[specialty - 1] + ":");
        System.out.println("Name: " + selectedDoctor);
        System.out.println("Address: Macherbazar 43\nKalabagan 4234");
        System.out.println("Phone: "+numbers);
    }

    public static void findDoctorsInBanani() {
        // Implement the logic to find doctors in Banani area
    	String[] specialties = {
                "Allergists/Immunologists",
                "Anesthesiologists",
                "Cardiologists",
                "Colon and Rectal Surgeons",
                "Dermatologists",
                "Endocrinologists"
        };

        Scanner input = new Scanner(System.in);

        System.out.println("What specialty are you looking for?");
        for (int i = 0; i < specialties.length; i++) {
            System.out.println((i + 1) + ". " + specialties[i]);
        }
        System.out.println("Please enter the corresponding number to choose:");

        int specialty = input.nextInt();
        if (specialty < 1 || specialty > specialties.length) {
            System.out.println("Invalid specialty choice.");
            return;
        }

        String[] doctors = {
                "Dr. Anisul Hoque",
                "Dr. Maria Beuthe",
                "Dr. Robiul Hawladar",
                "Dr. Musarrat Hossain",
                "Dr. Maisha Hossain",
                "Dr. Abu Sufian Shanto",
                "Dr. Mahbubur Rahman Mira", 
                "Dr. Alvina Akhter Badhon", 
                "Dr. Faizaan Rahman Zayaan",
                "Dr. Shahin Sultana",
                "Dr. Mahabub Alam Mishu",
                "Dr. Kakon Kabir",
                "Dr. Ayesha Akter",
                "Dr. Sharmin Akter Setu"
        };
        
        String [] phone = {
        		"+8801627834417",
        		"+8801627845518",
        		"+8801629834516",
        		"+8801621434588",
        		"+8801629634514",
        		"+8801627832518",
        		"+8801627834871",
        		"+8801627834514",
        		"+8801627834596",
        		"+8801627834565",
        		"+8801627834525",
        		"+8801627834516",
        		"+8801627834534",
        };

        String selectedDoctor = doctors[new Random().nextInt(doctors.length)];
        String numbers = phone[new Random().nextInt(phone.length)];

        System.out.println("You have chosen " + specialties[specialty - 1] + ".");
        System.out.println("Here is one of the best doctors in Dhanmondi for " + specialties[specialty - 1] + ":");
        System.out.println("Name: " + selectedDoctor);
        System.out.println("Address: Murgibazar 43\nScience Lab 3421");
        System.out.println("Phone: "+numbers);
    }
    }


