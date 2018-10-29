package coreRefactor.cashRegister;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class CashRegisterTest {

    private CashRegister cashRegister = new CashRegister();

    @Test
    public void water_costs_100_cents() {
        assertThat(cashRegister.checkout(Collections.singletonList(new Item("WATER")))).isEqualTo(100);
    }

    @Test
    public void milk_costs_400_cents() {
        assertThat(cashRegister.checkout(Collections.singletonList(new Item("MILK")))).isEqualTo(400);
    }

    @Test
    public void fancy_water_costs_200_cents_plus_8_percent_tax() {
        assertThat(cashRegister.checkout(Collections.singletonList(new Item("FANCY_WATER")))).isEqualTo(216);
    }

    @Test
    public void green_beans_cost_50_cents_plus_8_percent_tax() {
        assertThat(cashRegister.checkout(Collections.singletonList(new Item("GREEN_BEANS")))).isEqualTo(54);
    }

    @Test
    public void green_beans_are_buy_one_get_one_free() {
        Function<Integer, List<Item>> listOfGreenBeans = (Integer i) -> IntStream.range(0, i)
                .mapToObj(index -> new Item("GREEN_BEANS"))
                .collect(Collectors.toList());

        assertThat(cashRegister.checkout(listOfGreenBeans.apply(2))).isEqualTo(54);
        assertThat(cashRegister.checkout(listOfGreenBeans.apply(3))).isEqualTo(108);
        assertThat(cashRegister.checkout(listOfGreenBeans.apply(4))).isEqualTo(108);
        assertThat(cashRegister.checkout(listOfGreenBeans.apply(5))).isEqualTo(162);
    }

    @Test
    public void fancy_water_can_have_a_coupon_for_50_percent_off() {
        List<Item> couponSecond = Arrays.asList(
                new Item("FANCY_WATER"),
                new Item("FANCY_WATER_COUPON")
        );
        List<Item> couponFirst = Arrays.asList(
                new Item("FANCY_WATER_COUPON"),
                new Item("FANCY_WATER")
        );

        assertThat(cashRegister.checkout(couponSecond)).isEqualTo(108);
        assertThat(cashRegister.checkout(couponFirst)).isEqualTo(108);
    }

    @Test
    public void only_a_fancy_water_coupon_does_not_give_you_money_back() {
        assertThat(cashRegister.checkout(Collections.singletonList(new Item("FANCY_WATER_COUPON")))).isEqualTo(0);
    }
}