package app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.junit.jupiter.api.Test;

@Route("test")
public class TestView extends VerticalLayout {

    public TestView() {
        Button button = new Button("Test Button");
        add(button);
    }
}

// Тестовый класс
class TestVaadinApp {

    @Test
    public void testButtonExists() {
        // Проверяем, существует ли кнопка в представлении
        TestView view = new TestView();

    }
}
