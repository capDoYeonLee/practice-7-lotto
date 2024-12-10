package lotto;

public enum WinDetail {

    FIRST(6l, false, 2_000_000_000l, "6개일치(2,000,000,000원"),
    SECOND(5l, true, 30_000_000l, "5개일치, 보너스볼일치(30,000,000원"),
    THIRD(5l, false, 1_500_000l, "5개일치(1,500, 000원)"),
    FOURTH(4l, false, 50_000l, "4개일치(50,000원)"),
    FIVETH(3l, false, 5_000l, "3개일치(5,000원)");


    private final Long matchNumber;
    private final Boolean bonusWhether;
    private final Long lottoPrize;
    private final String prizeIntro;

    WinDetail(Long matchNumber, Boolean bonusWhether, Long lottoPrize, String prizeIntro) {
        this.matchNumber = matchNumber;
        this.bonusWhether = bonusWhether;
        this.lottoPrize = lottoPrize;
        this.prizeIntro = prizeIntro;
    }

    public Long getMatchNumber() {
        return matchNumber;
    }

    public Boolean getBonusWhether() {
        return bonusWhether;
    }

    public Long getLottoPrize() {
        return lottoPrize;
    }

    public String getPrizeIntro() {
        return prizeIntro;
    }
}
