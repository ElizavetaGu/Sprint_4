public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name != null){
            return name.matches(("^.{3,19}$")) && name.matches("^[\\S]+\\s[\\S]+$");
        } else {return false;}
    }
}
