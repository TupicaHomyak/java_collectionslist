package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду (LIST, ADD, EDIT, DELETE, EXIT):");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("LIST")) {
                todoList.getTodos();
            } else if (command.equalsIgnoreCase("ADD")) {
                System.out.println("Введите дело для добавления:");
                String todo = scanner.nextLine();
                todoList.add(todo);
            } else if (command.equalsIgnoreCase("EDIT")) {
                System.out.println("Введите номер дела для редактирования:");
                int index = scanner.nextInt();
                scanner.nextLine(); // Считываем символ новой строки
                System.out.println("Введите новое дело:");
                String todo = scanner.nextLine();
                todoList.edit(index, todo);
            } else if (command.equalsIgnoreCase("DELETE")) {
                System.out.println("Введите номер дела для удаления:");
                int index = scanner.nextInt();
                scanner.nextLine(); // Считываем символ новой строки
                todoList.delete(index);
            } else if (command.equalsIgnoreCase("EXIT")) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Некорректная команда. Попробуйте ещё раз.");
            }
        }
    }
}