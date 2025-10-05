package org.pluralsight;

import java.util.Scanner;

//This template is to help you know where certain code should live
//This is to help you along if you're stuck
public class Main {
    public static void main(String[] args) {
        //You'll need an array of 20 books, put it here
        Book[] inventory = new Book[20];

// FANTASY BOOKS (7 books)
        inventory[0] = new Book(1, "978-0-545-01022-1", "Harry Potter and the Deathly Hallows", false, "");
        inventory[1] = new Book(2, "978-0-061-12000-8", "The Hobbit", false, "");
        inventory[2] = new Book(3, "978-0-544-00341-5", "The Lord of the Rings", false, "");
        inventory[3] = new Book(4, "978-0-7653-2635-5", "The Name of the Wind", false, "");
        inventory[4] = new Book(5, "978-0-765-31178-0", "Mistborn: The Final Empire", false, "");
        inventory[5] = new Book(6, "978-0-441-00651-8", "A Game of Thrones", false, "");
        inventory[6] = new Book(7, "978-0-316-03296-3", "The Lightning Thief", false, "");

// SCI-FI BOOKS (7 books)
        inventory[7] = new Book(8, "978-0-14-028329-5", "1984", false, "");
        inventory[8] = new Book(9, "978-0-06-093546-7", "Brave New World", false, "");
        inventory[9] = new Book(10, "978-0-345-39180-3", "Dune", false, "");
        inventory[10] = new Book(11, "978-0-553-38235-9", "Foundation", false, "");
        inventory[11] = new Book(12, "978-0-345-41943-5", "Ender's Game", false, "");
        inventory[12] = new Book(13, "978-0-385-33312-0", "The Martian", false, "");
        inventory[13] = new Book(14, "978-0-7653-7701-2", "Ready Player One", false, "");

// THRILLER BOOKS (6 books)
        inventory[14] = new Book(15, "978-0-7434-3787-9", "The Da Vinci Code", false, "");
        inventory[15] = new Book(16, "978-0-307-58837-1", "The Girl with the Dragon Tattoo", false, "");
        inventory[16] = new Book(17, "978-0-525-95497-0", "Gone Girl", false, "");
        inventory[17] = new Book(18, "978-1-501-17346-4", "The Woman in the Window", false, "");
        inventory[18] = new Book(19, "978-0-316-01784-7", "The Silent Patient", false, "");
        inventory[19] = new Book(20, "978-0-307-74385-4", "The Girl on the Train", false, "");

        //You'll need a scanner to take in user input. Make one.

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Welcome to the Library :)!");
            System.out.println("Please select an option:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Show Checked Out Books");
            System.out.println("4. Check In a Book");
            System.out.println("5. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":// Show all the available books
                    System.out.println("Available Books:");

                    for (int i = 0; i < inventory.length; i++) {

                        if(!inventory[i].isCheckedOut()){
                            System.out.println("ID" + inventory[i].getId() + "|  ISBN" + inventory[i].getIsbn() + "|  Title" + inventory[i].getTitle());
                        }

                    }
                    break;
                case "2"://checkout by selecting bookID
                    System.out.println("Please select book ID to check out!");
                    int checkoutId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Your Name: ");
                    String name = scanner.nextLine();

                    for (int i = 0; i < inventory.length; i++) {
                        if(inventory[i].getId() == checkoutId){
                            inventory[i].checkOut(name);
                            System.out.println("Checked Out Successfully!:");
                            break;
                        }
                    }
                    break;
                case "3":// shows checked out books
                    System.out.println("Checked Out Books");
                    for (int i = 0; i < inventory.length; i++) {
                        if(inventory[i].isCheckedOut()){
                            System.out.println("ID : " +inventory[i].getId() + "| ISBN: " + inventory[i].getIsbn() + "| Title: " + inventory[i].getTitle());
                        }
                    }
                    break;

                case "4": //check in a book
                    System.out.println("Check in a book");
                    System.out.println("Enter Book ID: ");
                    int checkinId = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < inventory.length; i++) {
                        if (inventory[i].getId() == checkinId){
                            inventory[i].checkIn();
                            System.out.println("Checked In Successfully!");
                            break;
                        }


                    }
                    break;

                case "5": //exit
                    System.out.println("Thank you for using our Library!:");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again and type 1, 2, 3, 4, or 5");
                    break;





            }



        }


    }}