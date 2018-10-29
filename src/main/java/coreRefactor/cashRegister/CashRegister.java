package coreRefactor.cashRegister;

import java.util.List;

import static coreRefactor.cashRegister.Item.*;

public class CashRegister {
    public Long checkout(List<Item> items) {
        final Integer[] greenBeanCountContainer = {0};
        final Integer[] fancyWaterCouponCountContainer = {0};
        final Integer[] fancyWaterCountContainer = {0};

        return items.stream()
                .mapToLong(item -> {
                    if (WATER.equals(item)) {
                        return 100;
                    }
                    if (MILK.equals(item)) {
                        return 400;
                    }
                    if (FANCY_WATER.equals(item)) {
                        if (fancyWaterCouponCountContainer[0] > 0) {
                            fancyWaterCountContainer[0]--;
                            return 108;
                        }
                        fancyWaterCountContainer[0]++;
                        return 216;
                    }
                    if (FANCY_WATER_COUPON.equals(item)) {
                        if (fancyWaterCountContainer[0] > 0) {
                            fancyWaterCountContainer[0]--;
                            return -108;
                        }
                        fancyWaterCouponCountContainer[0]++;
                        return 0;
                    }
                    if (GREEN_BEANS.equals(item)) {
                        greenBeanCountContainer[0]++;

                        if (greenBeanCountContainer[0] % 2 == 0) return 0;
                        else return 54;
                    }
                    return 0;
                }).sum();
    }
}
