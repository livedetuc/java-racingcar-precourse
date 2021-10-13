package racinggame.domain;

public class CarName {
	private static final int NAME_STRING_SIZE_LIMIT = 5;

	private String name;

	public CarName(String name) {
		validateSize(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void validateSize(String name) {
		if (name.length() > NAME_STRING_SIZE_LIMIT) {
			throw new IllegalArgumentException(String.format("[ERROR] 이름은 %d자 이하만 가능합니다.", NAME_STRING_SIZE_LIMIT));
		}

		if (name.isEmpty()) {
			throw new IllegalArgumentException("[ERROR] 유효한 이름을 넣어주세요.");
		}
	}
}
