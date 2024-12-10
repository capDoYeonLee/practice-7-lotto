package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static List<Integer> convertType(String lotto) {
        String [] text = lotto.split(",");
        return Arrays.stream(text)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public List<Integer> makeRandomNumber() {
        List<Integer> radoms = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        System.out.println(radoms.toString());
        return radoms;
    }

}
