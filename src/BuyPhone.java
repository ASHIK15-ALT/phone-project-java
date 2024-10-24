import java.util.Scanner;

public class BuyPhone {
		    private static Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        String phoneBrand = "";
		        String phoneModel = "";
		        String storageVariant = "";
		        String color = "";
		        String camera = "";
		        String screenSize = "";
		        String battery = "";
		        String os = "";
		        String chargerAvailable = "";
		        String ram = "";
		        int price = 0;

		        // Ask the user if they want to buy a phone with validation
		        int response;
		        do {
		            System.out.println("Do you want to buy a phone? (1 for Yes / 2 for No)");
		            System.out.println("1. Yes");
		            System.out.println("2. No");

		            response = getValidInput(1, 2, scanner);
		        } while (response == -1);

		        if (response == 1) {
		            int choice;
		            do {
		                System.out.println("Great! Which phone do you want?");
		                System.out.println("1. iPhone");
		                System.out.println("2. Samsung");

		                choice = getValidInput(1, 2, scanner);
		            } while (choice == -1);

		            if (choice == 1) {
		                phoneBrand = "iPhone";
		                int iphoneModel;
		                do {
		                    System.out.println("You chose iPhone. Which model do you want?");
		                    System.out.println("1. iPhone 14 Pro");
		                    System.out.println("2. iPhone 15");
		                    System.out.println("3. iPhone 15 Plus");

		                    iphoneModel = getValidInput(1, 3, scanner);
		                } while (iphoneModel == -1);

		                switch (iphoneModel) {
		                    case 1:
		                        phoneModel = "iPhone 14 Pro";
		                        camera = "48MP Triple Camera";
		                        screenSize = "6.1 inches";
		                        battery = "3095mAh";
		                        os = "iOS 16";
		                        chargerAvailable = "No";
		                        ram = "6GB";
		                        price = 82900;
		                        break;
		                    case 2:
		                        phoneModel = "iPhone 15";
		                        camera = "48MP Dual Camera";
		                        screenSize = "6.1 inches";
		                        battery = "3279mAh";
		                        os = "iOS 17";
		                        chargerAvailable = "No";
		                        ram = "6GB";
		                        price = 79900;
		                        break;
		                    case 3:
		                        phoneModel = "iPhone 15 Plus";
		                        camera = "48MP Dual Camera";
		                        screenSize = "6.7 inches";
		                        battery = "4323mAh";
		                        os = "iOS 17";
		                        chargerAvailable = "No";
		                        ram = "6GB";
		                        price = 89900;
		                        break;
		                }

		            } else if (choice == 2) {
		                phoneBrand = "Samsung";
		                int samsungModel;
		                do {
		                    System.out.println("You chose Samsung. Which model do you want?");
		                    System.out.println("1. Samsung Galaxy S23");
		                    System.out.println("2. Samsung Galaxy S23+");
		                    System.out.println("3. Samsung Galaxy Z Fold5");

		                    samsungModel = getValidInput(1, 3, scanner);
		                } while (samsungModel == -1);

		                switch (samsungModel) {
		                    case 1:
		                        phoneModel = "Samsung Galaxy S23";
		                        camera = "50MP Triple Camera";
		                        screenSize = "6.1 inches";
		                        battery = "3900mAh";
		                        os = "Android 13";
		                        chargerAvailable = "Yes";
		                        ram = "8GB";
		                        price = 74999;
		                        break;
		                    case 2:
		                        phoneModel = "Samsung Galaxy S23+";
		                        camera = "50MP Triple Camera";
		                        screenSize = "6.6 inches";
		                        battery = "4700mAh";
		                        os = "Android 13";
		                        chargerAvailable = "Yes";
		                        ram = "8GB";
		                        price = 94999;
		                        break;
		                    case 3:
		                        phoneModel = "Samsung Galaxy Z Fold5";
		                        camera = "50MP Triple Camera";
		                        screenSize = "7.6 inches (unfolded)";
		                        battery = "4400mAh";
		                        os = "Android 13";
		                        chargerAvailable = "Yes";
		                        ram = "12GB";
		                        price = 154999;
		                        break;
		                }
		            }

		            int variant;
		            do {
		                System.out.println("Which variant do you want?");
		                System.out.println("1. 128GB");
		                System.out.println("2. 256GB");
		                System.out.println("3. 512GB");

		                variant = getValidInput(1, 3, scanner);
		            } while (variant == -1);

		            switch (variant) {
		                case 1:
		                    storageVariant = "128GB";
		                    break;
		                case 2:
		                    storageVariant = "256GB";
		                    price += 10000; // Add INR 10,000 for 256GB
		                    break;
		                case 3:
		                    storageVariant = "512GB";
		                    price += 20000; // Add INR 20,000 for 512GB
		                    break;
		            }

		            int colorChoice;
		            do {
		                System.out.println("Which color do you want?");
		                if (phoneBrand.equals("iPhone")) {
		                    System.out.println("1. Red");
		                    System.out.println("2. White");
		                    System.out.println("3. Black");
		                } else if (phoneBrand.equals("Samsung")) {
		                    System.out.println("1. Purple");
		                    System.out.println("2. White");
		                    System.out.println("3. Black");
		                }

		                colorChoice = getValidInput(1, 3, scanner);
		            } while (colorChoice == -1);

		            switch (colorChoice) {
		                case 1:
		                    color = phoneBrand.equals("iPhone") ? "Red" : "Purple";
		                    break;
		                case 2:
		                    color = "White";
		                    break;
		                case 3:
		                    color = "Black";
		                    break;
		            }

		            System.out.println("\nYou have selected the following specifications:");
		            System.out.println("Brand: " + phoneBrand);
		            System.out.println("Model: " + phoneModel);
		            System.out.println("Storage: " + storageVariant);
		            System.out.println("Color: " + color);
		            System.out.println("Camera: " + camera);
		            System.out.println("Screen Size: " + screenSize);
		            System.out.println("Battery: " + battery);
		            System.out.println("OS: " + os);
		            System.out.println("Charger Available: " + chargerAvailable);
		            System.out.println("RAM: " + ram);
		            System.out.println("Price: ₹" + price);

		        } else if (response == 2) {
		            System.out.println("No worries! Maybe next time.");
		        } else {
		            System.out.println("Invalid response. Please answer with '1' or '2'.");
		        }

		        scanner.close();
		    }

		    private static int getValidInput(int min, int max, Scanner scanner) {
		        int attempts = 3;
		        while (attempts > 0) {
		            try {
		                int choice = Integer.parseInt(scanner.nextLine());
		                if (choice >= min && choice <= max) {
		                    return choice;
		                } else {
		                    attempts--;
		                    if (attempts > 0) {
		                        System.out.println("Invalid choice. Please select a valid option. Attempts remaining: " + attempts);
		                    }
		                }
		            } catch (NumberFormatException e) {
		                attempts--;
		                if (attempts > 0) {
		                    System.out.println("Invalid input. Please enter a number. Attempts remaining: " + attempts);
		                }
		            }
		        }
		        System.out.println("Too many invalid attempts. Exiting program.");
		        System.exit(0);
		        return -1; // Unreachable code but required for compilation
		    }
		}

	


