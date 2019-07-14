package pl.coderslab.warsztat2.controller;


import java.util.Scanner;

public class UserController {
    public static void main(String[] args) {
        System.out.println("Witaj w programie nadzędziowym Usera.");
        Scanner sc = new Scanner(System.in);
        while (true){
            displayMenu();
            final String option = sc.nextLine();

            if(option.equals("1")){
                addUser();
            }
            if(option.equals("2")){
                editUser();
            }
            if(option.equals("3")){
                deleteUser();
            }
            if(option.equals("0")){
                break;
            }
//            System.out.println("Wybrano niepoprawną opcję");
        }
        System.out.println("Zakończono program");
    }


    private static void addUser() {
        System.out.println("add user");
    }

    private static void editUser() {
        System.out.println("edit user");
    }

    private static void deleteUser() {
        System.out.println("edit user");
    }


    private static void displayMenu() {
        System.out.println();
        System.out.println("Choose option and press enter. Options:");
        System.out.println("1 - add ");
        System.out.println("2 - edit ");
        System.out.println("3 - delete ");
        System.out.println("0 - quit ");
    }
}
