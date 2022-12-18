import org.example.cook.Cooking;
import org.example.cook.Cook;
import org.example.cook.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {
    @DisplayName("메뉴 항목에 대한 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);
        Cook cook = cooking.makeCook(menuItem);
        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
