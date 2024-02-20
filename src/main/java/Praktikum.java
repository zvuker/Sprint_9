public class Praktikum {

    public static void main(String[] args) {
        // Создаем экземпляр класса Account с тестовыми данными
        Account account = new Account("Тимоти Шаламе");
        // Вызываем метод проверки и выводим результат на экран
        System.out.println(account.checkNameToEmboss());
    }
}

