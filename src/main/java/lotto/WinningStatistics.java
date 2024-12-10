package lotto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class WinningStatistics {

    Map<Long, Boolean> result = new HashMap<>();
    WinDetail winDetail[] = WinDetail.values();

    public void statistics(List<Lotto> issuedLotto, List<Integer> winningNumbers, Integer bonusNumber) {
        for (Lotto lotto : issuedLotto) {
            long count = 0;
            count = lotto.getNumbers().stream()
                    .filter(num -> winningNumbers.stream()
                            .anyMatch(Predicate.isEqual(num)))
                            .count();
            Boolean bonusNumberWhether = lotto.findBonusNumber(bonusNumber);
            result.put(count, bonusNumberWhether);
        }
        verseAnswer();
    }

    public void verseAnswer() {

        for (Map.Entry<Long, Boolean> element : result.entrySet()) {
            for (WinDetail detail : winDetail) {
                if (detail.getMatchNumber() == element.getKey()) {
                    if (detail.getBonusWhether() == element.getValue()) {
                        System.out.println(detail.getPrizeIntro());
                    }
                }
            }
        }
    }





}
