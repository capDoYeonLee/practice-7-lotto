package lotto;

import java.util.ArrayList;
import java.util.List;

public class Buyer {

    List<Lotto> issuedLotto = new ArrayList<>();
    private Integer money;
    private final Integer WON = 1_000;

    public Buyer(Integer money) {
        this.money = money;
    }

    public void buyLotto() {
        Utils utils = new Utils();
        validateMoney(money);
        Integer quantityAvailableForPurchase = exchangeMoneyToNumberOfPurchase(money); // 희망 로또 구매 개수
        for (int i = 0; i < quantityAvailableForPurchase; i++) {
            issuedLotto.add(new Lotto(utils.makeRandomNumber()));
        }
    }

    private Integer exchangeMoneyToNumberOfPurchase(Integer money) {
        return money / WON;
    }

    private void validateMoney(Integer money) {
        if (money % WON != 0) {
            throw new IllegalArgumentException();
        }
    }
}
