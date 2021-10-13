package racinggame.domain;

public class Progress {

	private int progress;

	public Progress() {
		this.progress = 0;
	}

	public Progress(int progress) {
		validateValue(progress);
		this.progress = progress;
	}

	public int getProgress() {
		return progress;
	}

	public static void validateValue(int progress) {
		if (progress < 0) {
			throw new IllegalArgumentException("[ERROR] progress 는 음수일 수 없습니다.");
		}
	}

	public boolean isProgress(Progress progress) {
		return this.progress == progress.getProgress();
	}

	public void addProgress() {
		this.progress++;
	}
}
