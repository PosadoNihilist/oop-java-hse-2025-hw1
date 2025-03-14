import java.util.Scanner;

/**
 * Класс CoffeeOrder
 *
 * В этом классе у вас должен быть метод main:
 * 1. Создание объекта Scanner для ввода пользователя.
 * 2. Логика меню (switch или if-else) для выбора кофе и сахара.
 * 3. Создание объекта Coffee и объекта Sugar, исходя из выбора пользователя.
 * 4. Вызов методов (например, coffee.calculatePriceWithSugar(sugar)).
 * 5. Вывод информации о заказе (название кофе, уровень сахара, итоговая цена).
 * 6. (Опционально) повтор решения в цикле до выхода из программы.
 */
public class CoffeeOrder {

    public static void main(String[] args) {
        // Напишите вашу логику здесь:
        // 1) Создать Scanner;
        Scanner scanner = new Scanner(System.in);

        // 2) Спросить пользователя, какой кофе (название, цена) или номер опции;

        System.out.println("========== MENU ==========\n");
        System.out.println("1. Espresso            $1.49");
        System.out.println("2. Americano           $2.79");
        System.out.println("3. Cappuccino          $3.69");
        System.out.println("4. Latte               $3.69");
        System.out.println("5. French Vanilla      $2.99");

        System.out.print("Pick an option: ");
        int coffee_id = scanner.nextInt();

        // 3) Спросить пользователя, какой сахар (номер опции, уровень, цена);

        System.out.println("\n========== SUGAR ==========\n");
        System.out.println("1. No Sugar           $0.00");
        System.out.println("2. 1 Sugar            $0.10");
        System.out.println("3. 2 Sugar            $0.20");
        System.out.println("4. 3 Sugar            $0.30");

        System.out.print("Pick an option: ");
        int sugar_id = scanner.nextInt();

        // 4) Создать объекты Coffee и Sugar (конструкторы, сеттеры);

        if (coffee_id ==1) {
            Coffee coffee = new Coffee("Espresso", 1.49);
        } else if (coffee_id == 2){
            Coffee coffee = new Coffee("Americano", 2.79);
        } else if (coffee_id == 3){
            Coffee coffee = new Coffee("Cappuccino", 3.69);
        } else if (coffee_id == 4){
            Coffee coffee = new Coffee("Latte", 3.69);
        } else {
            Coffee coffee = new Coffee("French Vanilla", 2.99);
        }

        if (sugar_id == 1) {
            Sugar sugar = new Sugar("No Sugar", 0);
        } else if (sugar_id == 2) {
            Sugar sugar = new Sugar("1 Sugar", 0.1);
        } else if (sugar_id == 3) {
            Sugar sugar = new Sugar("2 Sugar", 0.2);
        } else {
            Sugar sugar = new Sugar("3 Sugar", 0.3);
        }

        // 5) Вычислить общую стоимость и вывести результат;

        coffee.calculatePriceWithSugar(sugar);

        // 6) (Опционально) продолжать спрашивать, пока пользователь не решит завершить.
    }
}
