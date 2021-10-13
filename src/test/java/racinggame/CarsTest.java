package racinggame;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racinggame.domain.Car;
import racinggame.domain.Cars;

public class CarsTest {

	@Test
	void winner_하나() {
		Cars cars = new Cars();
		Car winner = new Car("test1", 5);
		Car loser1 = new Car("test2", 4);
		Car loser2 = new Car("test3", 3);
		cars.addCar(winner);
		cars.addCar(loser1);
		cars.addCar(loser2);

		assertThat(cars.getWinners().getCars().size()).isEqualTo(1);
		assertEquals(cars.getWinners().getCars().get(0), winner);
	}

	@Test
	void winner_둘() {
		Cars cars = new Cars();
		Car winner1 = new Car("test1", 4);
		Car winner2 = new Car("test2", 4);
		Car loser = new Car("test3", 0);
		cars.addCar(winner1);
		cars.addCar(winner2);
		cars.addCar(loser);

		assertThat(cars.getWinners().getCars().size()).isEqualTo(2);
		assertEquals(cars.getWinners().getCars().get(0), winner1);
		assertEquals(cars.getWinners().getCars().get(1), winner2);
	}
}
