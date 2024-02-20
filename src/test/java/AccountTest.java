import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testCheckNameToEmbossValid() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    void testCheckNameToEmbossInvalid() {
        Account account = new Account("ТимотейШевроле");
        assertFalse(account.checkNameToEmboss());
    }

    // Добавьте больше тестов для проверки различных граничных условий
}
