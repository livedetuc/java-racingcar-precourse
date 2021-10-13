package racinggame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nextstep.test.NSTest;
import racinggame.domain.RandomNo;

public class RandomNoTest extends NSTest {

	private static final int MOVING_FORWARD = 4;
	private static final int STOP = 3;

	@Test
	void randomNo1() {
		assertRandomTest(() -> {
			RandomNo randomNo = new RandomNo();
			assertTrue(randomNo.ifMoveForwardNo());
		}, MOVING_FORWARD);
	}

	@Test
	void randomNo2() {
		assertRandomTest(() -> {
			RandomNo randomNo = new RandomNo();
			assertFalse(randomNo.ifMoveForwardNo());
		}, STOP);
	}

	@Override
	protected void runMain() {

	}
}
