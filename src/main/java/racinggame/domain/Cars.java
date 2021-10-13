package racinggame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {

	private final List<Car> cars = new ArrayList<>();

	public Cars() {
	}

	public Cars(List<String> names) {
		for (String name : names) {
			cars.add(new Car(name));
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	public List<String> getNames() {
		// return cars.stream().map(Car::getName).collect(Collectors.toList());
		List<String> names = new ArrayList<>();
		cars.forEach(car -> names.add(car.getName().getName()));
		return names;
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public Cars getWinners() {
		Cars winners = new Cars();
		// get max progress
		Car maxProgressCar= Collections.max(cars, Comparator.comparingInt(car -> car.getProgress().getProgress()));
		for (Car car: cars) {
			if (car.getProgress().isProgress(maxProgressCar.getProgress())) {
				winners.addCar(car);
			}
		}
		return winners;
	}

}
