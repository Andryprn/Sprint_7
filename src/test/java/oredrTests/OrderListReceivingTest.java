package oredrTests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import ru.yandex.order.OrderSteps;

import static org.hamcrest.CoreMatchers.notNullValue;

public class OrderListReceivingTest {
    @Test
    @DisplayName("Получение списка заказов")
    @Description("Проверка успешного получения списка заказов")
    public void getOrderList() {
        OrderSteps orderSteps = new OrderSteps();
        ValidatableResponse responseOrderList = orderSteps.getOrderList();
        responseOrderList.assertThat()
                .statusCode(200)
                .body("orders", notNullValue());
    }
}