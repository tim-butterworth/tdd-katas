package coreTDD.plinkPlonkPlunk;

import java.util.LinkedList;
import java.util.List;

public class PlinkPlonkPlunk {
    public String findTheSound(Integer value) {
        List<String> accumulator = new LinkedList<>();

        ifDivides(3, value, "Plink", accumulator);
        ifDivides(5, value, "Plonk", accumulator);
        ifDivides(7, value, "Plunk", accumulator);

        if(accumulator.isEmpty()) return String.valueOf(value);

        return String.join("", accumulator);
    }

    private void ifDivides(int i, Integer value, String message, List<String> accumulator) {
        if(value % i == 0) {
            accumulator.add(message);
        }
    }

}
