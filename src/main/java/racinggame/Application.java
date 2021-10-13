package racinggame;

import racinggame.controller.CarRacingController;

public class Application {

    public static void main(String[] args) {
        CarRacingController racingController = new CarRacingController();
        racingController.init();
        racingController.race();

    }
}
