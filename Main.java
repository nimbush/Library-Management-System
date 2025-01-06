package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library obj1 = new Library();
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning){

            System.out.println("Welcome to library Management System");
            System.out.println("1. Display All Books");
            System.out.println("2. Add Books");
            System.out.println("3. Find Book");
            System.out.println("4. Check Out Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.println("What do you wanna do: ");
            int number = sc.nextInt();


            switch (number){
                case 1:
                    obj1.readBooks();
                    break;
                case 2:
                    System.out.println("1. Add books with the title");
                    System.out.println("2. Add books with the all the information as a parameter");
                    System.out.println("3. Add book as a constructor");
                    System.out.println("Select a option");
                    int numbers = sc.nextInt();
                    if (numbers == 1){
                        obj1.addBooks();
                    } else if (numbers==2) {
                        obj1.addBooks(numbers);
                    } else if (numbers==3) {
                        obj1.addBooks(null);
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 3:
                    System.out.println("1. Search book by title");
                    System.out.println("2. Search book by title and ISBN");
                    System.out.println("Add the number to conduct it: ");
                    int n= sc.nextInt();
                    if (n == 1){
                        obj1.searchBook();
                    } else if (n == 2) {
                        obj1.searchBook(n);
                    }else{
                        System.out.println("Invalid");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Do you want to add your name? (y/n):");
                    String doYou = sc.nextLine();
                    if (doYou.equalsIgnoreCase("y")){
                        obj1.checkOutBook(doYou);
                    } else if (doYou.equalsIgnoreCase("n")) {
                        obj1.checkOutBook();
                    }else{
                        System.out.println("Enter valid character");
                    }
                    break;
                case 5:
                    obj1.returnBook();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    isRunning = false;
            }
        }

    }
}
