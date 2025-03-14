/**
 * Класс Sugar
 *
 * Поля (примерная идея):
 *   - private String sugarLevel; // Например: "Без сахара", "Мало сахара", "Много сахара"
 *   - private double sugarPrice; // надбавка к цене (может быть 0 для "Без сахара", 10.0 для "Много" и т.д.)
 *
 * Геттеры/сеттеры:
 *   - getSugarLevel(), setSugarLevel(...)
 *   - getSugarPrice(), setSugarPrice(...)
 *
 * Методы (примерные идеи):
 *   - getSugarDescription(): String
 *       (может возвращать что-то вроде: "Добавлен сахар: <уровень>")
 */
public class Sugar {
    // Напишите код здесь (объявление полей)
        private String sugarLevel; // Например: "Без сахара", "Мало сахара", "Много сахара"
        private double sugarPrice; // надбавка к цене (может быть 0 для "Без сахара", 10.0 для "Много" и т.д.)

    // Напишите код здесь (конструкторы)

    public Sugar(String sugarLevel, double sugarPrice) {
        this.sugarLevel = sugarLevel;
        this.sugarPrice = sugarPrice;
    }

    // Напишите код здесь (геттеры/сеттеры)

    public String getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(String sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public double getSugarPrice() {
        return sugarPrice;
    }

    public void setSugarPrice(double sugarPrice) {
        this.sugarPrice = sugarPrice;
    }
}
