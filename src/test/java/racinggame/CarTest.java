package racinggame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racinggame.domain.Car;
import racinggame.domain.Progress;
import racinggame.domain.RandomNo;

public class CarTest {

	private static final int MOVING_FORWARD = 4;
	private static final int STOP = 3;

	@Test
	void 전진_3회() {
		Car car = new Car("test");
		car.goForwardOrStop(new RandomNo(MOVING_FORWARD));
		car.goForwardOrStop(new RandomNo(MOVING_FORWARD));
		car.goForwardOrStop(new RandomNo(MOVING_FORWARD));

		assertTrue(car.getProgress().isProgress(new Progress(3)));
	}

	@Test
	void 멈춤_3회() {
		Car car = new Car("test");
		car.goForwardOrStop(new RandomNo(STOP));
		car.goForwardOrStop(new RandomNo(STOP));
		car.goForwardOrStop(new RandomNo(STOP));

		assertTrue(car.getProgress().isProgress(new Progress(0)));
	}

	@Test
	void 멈춤_2회_전진_1회() {
		Car car = new Car("test");
		car.goForwardOrStop(new RandomNo(STOP));
		car.goForwardOrStop(new RandomNo(MOVING_FORWARD));
		car.goForwardOrStop(new RandomNo(STOP));

		assertTrue(car.getProgress().isProgress(new Progress(1)));
	}
}
