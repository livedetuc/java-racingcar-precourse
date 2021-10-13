package racinggame.domain;

import static nextstep.utils.Randoms.*;

public class RandomNo {

    private static final int MIN_NO = 0;
    private static final int MAX_NO = 9;
    private static final int MOVING_FORWARD_MIN_NUMBER = 4;

    private final int no;

    public RandomNo() {
        this.no = pickNumberInRange(MIN_NO, MAX_NO);;
    }

    public RandomNo(int no) {
        validateNo(no);
        this.no = no;
    }

    public void validateNo(int no) {
        if (MIN_NO > no || MAX_NO < no) {
            throw new IllegalArgumentException(
                String.format("[ERROR] random number 값은 %d ~ %d 사이 값이어야 합니다.",
                MIN_NO, MAX_NO));
        }
    }

    public boolean ifMoveForwardNo() {
        return this.no >= MOVING_FORWARD_MIN_NUMBER;
    }
}
