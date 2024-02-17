package PhoneBook;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        String names = "";
        Contact myContact = new Contact();
        System.out.println("Привет, выберите пункт меню:");
        System.out.println("Создать контакт - нажмите 1");
        System.out.println("Найти контакт - нажмите 2");
        System.out.println("Показать телефонную книгу - нажмите 3");
        System.out.println("Выйти из телефонной книги - нажмите 4");

        Scanner iScanne = new Scanner(System.in);
        int menuNum = iScanne.nextInt();
        switch (menuNum){
            case 1:
                Scanner iScanner = new Scanner(System.in);
                System.out.println("Введите имя: ");
                String name = iScanner.nextLine();
                Scanner iScann = new Scanner(System.in);
                System.out.println("Ведите номер телефона: ");
                int phone = iScann.nextInt();
                myContact.add(name, phone);
                try(FileWriter writer = new FileWriter("pb.txt", false))
                {
                    String text = "Владимир";
                    writer.write(text);
                    writer.flush();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
                break;
            case 2:
                myContact.find(names);
                if (myContact == null) {
                    System.out.println("Контакта с именем" + names + "не существует");
                } else {
                    System.out.println("Контакт: "+ names +" ,номер телефона "+ myContact.find(names));
                }
                break;
            case 3:
                System.out.println(Contact.showPhoneBook());
                break;
            case 4:
                break;

        }
    }

}