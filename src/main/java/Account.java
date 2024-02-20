public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // Проверка на длину строки
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }
        // Проверка, что пробел в строке только один и не находится на краях строки
        int spaceIndex = name.indexOf(" ");
        if (spaceIndex == -1 || spaceIndex != name.lastIndexOf(" ") || spaceIndex == 0 || spaceIndex == name.length() - 1) {
            return false;
        }
        return true;
    }
}