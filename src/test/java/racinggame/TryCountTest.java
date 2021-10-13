package racinggame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racinggame.domain.TryCount;

public class TryCountTest {

	private static final String ERROR_MESSAGE = "[ERROR]";

	@Test
	void 시도횟수_테스트_숫자_아닌() {
		String tryCount = "NOT_NUMERIC";
		Exception exception = assertThrows(IllegalArgumentException.class,
			() -> TryCount.validateCount(tryCount));

		assertTrue(exception.getMessage().contains(ERROR_MESSAGE));
	}

	@Test
	void 시도횟수_테스트_숫자문자열_성공() {
		String tryCount = "11";
		TryCount.validateCount(tryCount);
	}

	@Test
	void 시도횟수_테스트_음수() {
		int tryCount = -11;
		Exception exception = assertThrows(IllegalArgumentException.class,
			() -> TryCount.validateCount(tryCount));

		assertTrue(exception.getMessage().contains(ERROR_MESSAGE));
	}

	@Test
	void 시도횟수_테스트_0() {
		int tryCount = 0;
		Exception exception = assertThrows(IllegalArgumentException.class,
			() -> TryCount.validateCount(tryCount));

		assertTrue(exception.getMessage().contains(ERROR_MESSAGE));
	}

	@Test
	void 시도횟수_테스트_성공() {
		int tryCount = 11;
		TryCount.validateCount(tryCount);
	}
}
