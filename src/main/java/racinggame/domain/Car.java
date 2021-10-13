package racinggame.domain;

public class Car {

    private final CarName name;
    private final Progress progress;

    public Car(String name, int progress) {
        this.name = new CarName(name);
        this.progress = new Progress(progress);
    }

    public Car(String name) {
        this.name = new CarName(name);
        this.progress = new Progress();
    }

    public CarName getName() {
        return name;
    }

    public Progress getProgress() {
        return progress;
    }

    public void goOrStop(RandomNo randomNo) {
        if (randomNo.ifMoveForwardNo()) {
            this.progress.addProgress();
        }
    }
}
