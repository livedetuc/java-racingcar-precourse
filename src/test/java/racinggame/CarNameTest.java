package racinggame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racinggame.domain.CarName;

public class CarNameTest {

	private static final String ERROR_MESSAGE = "[ERROR]";

	@Test
	void 차_이름_테스트_5자_초과() {
		String name = "rabbit";
		Exception exception = assertThrows(IllegalArgumentException.class,
			() -> CarName.validateSize(name));

		assertTrue(exception.getMessage().contains(ERROR_MESSAGE));
	}

	@Test
	void 차_이름_테스트_빈값() {
		String name = "";
		Exception exception = assertThrows(IllegalArgumentException.class,
			() -> CarName.validateSize(name));

		assertTrue(exception.getMessage().contains(ERROR_MESSAGE));
	}

	@Test
	void 차_이름_테스트_성공() {
		String name = "abc";
		CarName.validateSize(name);
	}
}
