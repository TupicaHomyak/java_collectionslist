package practice;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String todo) {
        todos.add(todo);
        System.out.println("Дело добавлено.");
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index >= 0 && index <= todos.size()) {
            todos.add(index, todo);
            System.out.println("Дело добавлено на указанный индекс.");
        } else {
            todos.add(todo); // Добавляем дело в конец списка
            System.out.println("Некорректный индекс. Дело добавлено в конец списка.");
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index >= 0 && index < todos.size()) {
            todos.set(index, todo);
            System.out.println("Дело отредактировано.");
        } else {
            System.out.println("Некорректный индекс. Дело не отредактировано.");
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
            System.out.println("Дело удалено.");
        } else {
            System.out.println("Некорректный индекс. Дело не удалено.");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }


    public ArrayList<String> getTodos() {
        if (todos.isEmpty()) {
            System.out.println("Список дел пуст.");
        } else {
            System.out.println("Список дел:");
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }
        return todos;
        // TODO: вернуть список дел
    }
}



