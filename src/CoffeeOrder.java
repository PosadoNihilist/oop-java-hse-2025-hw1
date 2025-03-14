import java.util.InputMismatchException;
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
        boolean satisfied = false;
        while (!satisfied){
            System.out.println("========== MENU ==========\n");
            System.out.println("1. Espresso            $1.49");
            System.out.println("2. Americano           $2.79");
            System.out.println("3. Cappuccino          $3.69");
            System.out.println("4. Latte               $3.69");
            System.out.println("5. French Vanilla      $2.99");


            boolean validInput = false;
            int coffee_id = 0;
            while (!validInput) {
                try {
                    System.out.print("Pick an option: ");
                    coffee_id = scanner.nextInt();
                    if (coffee_id < 1 || coffee_id >5) {
                        System.out.println("Error: Number must be between 1 and 5.");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a number.");
                    scanner.nextLine();
                }
            }


            // 3) Спросить пользователя, какой сахар (номер опции, уровень, цена);

            System.out.println("\n========== SUGAR ==========\n");
            System.out.println("1. No Sugar           $0.00");
            System.out.println("2. 1 Sugar            $0.10");
            System.out.println("3. 2 Sugar            $0.20");
            System.out.println("4. 3 Sugar            $0.30");

            validInput = false;
            int sugar_id = 0;
            while (!validInput) {
                try {
                    System.out.print("Pick an option: ");
                    sugar_id = scanner.nextInt();
                    if (sugar_id < 1 || sugar_id > 4) {
                        System.out.println("Error: Number must be between 1 and 4.");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a number.");
                    scanner.nextLine();
                }
            }

            // 4) Создать объекты Coffee и Sugar (конструкторы, сеттеры);
            Coffee coffee = new Coffee("Espresso", 1.49);

            if (coffee_id == 2){
                coffee.setName("Americano");
                coffee.setBasePrice(2.79);
            } else if (coffee_id == 3){
                coffee.setName("Cappuccino");
                coffee.setBasePrice(3.69);
            } else if (coffee_id == 4){
                coffee.setName("Latte");
                coffee.setBasePrice(3.69);
            } else if (coffee_id == 5){
                coffee.setName("French Vanilla");
                coffee.setBasePrice(2.99);
            }

            Sugar sugar = new Sugar("No Sugar", 0);

            if (sugar_id == 2) {
                sugar.setSugarLevel("1 Sugar");
                sugar.setSugarPrice(0.1);
            } else if (sugar_id == 3) {
                sugar.setSugarLevel("2 Sugar");
                sugar.setSugarPrice(0.2);
            } else if (sugar_id ==4) {
                sugar.setSugarLevel("3 Sugar");
                sugar.setSugarPrice(0.3);
            }

            // 5) Вычислить общую стоимость и вывести результат;

            double price = coffee.calculatePriceWithSugar(sugar);
            System.out.println("Your order is: " + coffee.getName() + " with " + sugar.getSugarLevel());
            System.out.println("Total price for the order: " + price);

            // 6) (Опционально) продолжать спрашивать, пока пользователь не решит завершить.

            System.out.println("Are you satisfied with your order?");
            System.out.println("1. Yes");
            System.out.println("2. No, I would like to start over.");

            int satisf_response = scanner.nextInt();
            if (satisf_response==1) {
                System.out.println("That's great! Thank you for your order.");
                satisfied = true;
            } else if (satisf_response == 2) {
                System.out.println("Okay, try again.");
            }
        }
        scanner.close();
    }
}
