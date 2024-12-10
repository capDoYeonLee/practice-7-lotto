package lotto;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        System.out.println("구입금액을 입력해 주세요.");
        Integer money = inputView.getInteger();
        Buyer buyer = new Buyer(money);
        buyer.buyLotto();

        System.out.println("당첨 번호를 입력해 주세요.");
        List<Integer> winningNumbers = Utils.convertType(inputView.getString());
        System.out.println("보너스 번호를 입력해 주세요.");
        Integer bonusNumber = inputView.getInteger();

        WinningStatistics winningStatistics = new WinningStatistics();
        winningStatistics.statistics(buyer.issuedLotto, winningNumbers, bonusNumber);
    }
}
