package serialization;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = null;

        while (true) {
            System.out.println("Enter 1 to add information to the file.");
            System.out.println("Enter 2 to retrieve information from the file and display them.");
            System.out.println("Enter 3 to delete information.");
            System.out.println("Enter 4 to update information.");
            System.out.println("Enter 5 to exit.");

            System.out.print("Enter selection: ");
            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Phone number: ");
                    String phonenumber = sc.next();
                    System.out.println("Date of birth: ");
                    String dateofbirth = sc.next();
                    System.out.println("Email address: ");
                    String emailaddress = sc.next();
                    person = new Person(name, phonenumber, dateofbirth, emailaddress);
                    writeToFile(person);
                    System.out.println("Information recorded.");
                    break;

                case 2:
                    try {
                        person = readFile();
                        System.out.println(person);
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    if (person != null) {
                        person.setName(null);
                        person.setPhonenumber(null);
                        person.setDateofbirth(null);
                        person.setEmailaddress(null);
                        writeToFile(person);
                        System.out.println("Information deleted.");
                    } else {
                        System.out.println("No information.");
                    }
                    break;

                case 4:
                    if (person != null) {
                        System.out.println("Enter name: ");
                        String name1 = sc.next();
                        person.setName(name1);

                        System.out.println("Enter phone number: ");
                        String phonenumber1 = sc.next();
                        person.setPhonenumber(phonenumber1);

                        System.out.println("Enter date of birth: ");
                        String dateofbirth1 = sc.next();
                        person.setDateofbirth(dateofbirth1);

                        System.out.println("Enter email address: ");
                        String emailaddress1 = sc.next();
                        person.setEmailaddress(emailaddress1);

                        writeToFile(person);
                        System.out.println("Updated information.");
                    } else {
                        System.out.println("File is empty.");
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            }
        }
    }

    public static void writeToFile(Person person) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.bin"));
            oos.writeObject(person);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.bin"));
        Person person = (Person) ois.readObject();
        ois.close();
        return person;
    }
}

	


