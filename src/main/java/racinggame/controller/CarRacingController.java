package racinggame.controller;

import java.util.List;

import racinggame.domain.Car;
import racinggame.domain.CarName;
import racinggame.domain.Cars;
import racinggame.domain.RandomNo;
import racinggame.domain.TryCount;
import racinggame.view.CarRacingView;

public class CarRacingController {

	private Cars cars;
	private TryCount tryCount;

	public void init() {
		cars = new Cars(getRacingCarNames());
		tryCount = new TryCount(getTryCount());
	}

	private List<String> getRacingCarNames() {
		List<String> carNames = CarRacingView.getRacingCarNames();
		try {
			carNames.forEach(CarName::validateSize);
		} catch (IllegalArgumentException e) {
			CarRacingView.printMessage(e.getMessage());
			return getRacingCarNames();
		}
		return carNames;
	}

	private String getTryCount() {
		String tryCount = CarRacingView.getTryCount();
		try {
			TryCount.validateCount(tryCount);
		} catch (IllegalArgumentException e) {
			CarRacingView.printMessage(e.getMessage());
			return getTryCount();
		}
		return tryCount;
	}

	public void race() {
		CarRacingView.printRacingResultTitle();
		for (int step = 0; step < tryCount.getCount(); step++) {
			move();
		}
		List<String> winners = cars.getWinners().getNames();
		CarRacingView.printFinalResult(winners);
	}

	private void move() {
		cars.getCars().forEach(this::move);
		CarRacingView.printNewLine();
	}

	private void move(Car car) {
		car.goOrStop(new RandomNo());
		CarRacingView.printRacingProgress(car.getName().getName(), car.getProgress().getProgress());
	}

}
