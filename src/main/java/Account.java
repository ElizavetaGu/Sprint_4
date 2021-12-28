public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19){
            return name.matches("^[а-яА-ЯёЁ]+\\s[а-яА-ЯёЁ]+$");
        } else {return false;}
    }
}
