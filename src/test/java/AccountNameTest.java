import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountNameTest {
    private final String name;
    private final boolean embossible;

    public AccountNameTest(String name, boolean embossible){
        this.name = name;
        this.embossible = embossible;
    }

    @Parameterized.Parameters
    public static Object[][] checkNameToEmboss(){
        return new Object[][]{
                {"Лиза Гурова", true},
                {"раÖä47 Ёfgj#_!", true},
                {"ЛизaГурова", false},
                {"Лизa  Гурова", false},
                {"E B Гурова", false},
                {"Л Г", true},
                {"Йцукенгш Щзхъфывапр", true},
                {"Йцукенгш Щзхъфывапрй", false},
                {"", false},
                {" Лиза Гурова", false},
                {"Лиза Гурова ", false},
                {" ЛизаГурова", false},
                {"ЛизаГурова ", false},
                {null, false}
        };
    }

    @Test
    public void testCheckNameToEmboss(){
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        boolean expected = embossible;

        assertEquals(name + " is incorrect", expected, actual);
    }
}
