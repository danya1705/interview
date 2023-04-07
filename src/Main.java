import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Дан массив пар названий книг и авторов,
        // необходимо привести каждую пару в строку вида:
        // “Название книги” Имя Отчество Фамилия автора

        String[][] arr = {
                {"Война и мир", "Лев Николаевич Толстой"},
                {"Идиот","Фёдор Михайлович Достоевский"},
                {"Евгений Онегин","Александр Сергеевич Пушкин"}
        };

//        for (String[] s : arr) {
//            System.out.println("\"" + s[0] + "\" " + s[1]);
//        }

        Arrays.stream(arr)
                .map(s -> "\"" + s[0] + "\" " + s[1])
                .forEach(System.out::println);
    }
}