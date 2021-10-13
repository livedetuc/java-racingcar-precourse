package racinggame.domain;

public class TryCount {

	private int count;

	public TryCount(int count) {
		validateCount(count);
		this.count = count;
	}

	public TryCount(String count) {
		validateCount(count);
		this.count = Integer.parseInt(count);
	}

	public int getCount() {
		return count;
	}

	public static void validateCount(int count) {
		if (count <= 0) {
			throw new IllegalArgumentException("[ERROR] 시도 횟수는 0 이하일 수 없습니다.");
		}
	}

	public static void validateCount(String count) {
		int countNo;
		try {
			countNo = Integer.parseInt(count);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자이어야 합니다.");
		}
		validateCount(countNo);
	}
}
