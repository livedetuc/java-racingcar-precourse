package racinggame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racinggame.domain.Progress;

public class ProgressTest {

	private static final String ERROR_MESSAGE = "[ERROR]";

	@Test
	void Progress_테스트_음수() {
		int progress = -2;
		Exception exception = assertThrows(IllegalArgumentException.class,
			() -> Progress.validateValue(progress));

		assertTrue(exception.getMessage().contains(ERROR_MESSAGE));
	}

	@Test
	void Progress_테스트_성공() {
		int progress = 1;
		Progress.validateValue(progress);
	}
}
