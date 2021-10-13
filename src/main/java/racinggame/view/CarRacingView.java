package racinggame.view;

import static nextstep.utils.Console.*;

import java.util.Arrays;
import java.util.List;

public class CarRacingView {

	private static final String GET_RACING_CAR_NAMES_COMMENT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String GET_REPEATED_CNT_COMMENT = "시도할 회수는 몇회인가요?";

	public static List<String> getRacingCarNames() {
		System.out.println(GET_RACING_CAR_NAMES_COMMENT);
		String input = readLine();
		return Arrays.asList(input.split(","));
	}

	public static String getTryCount() {
		System.out.println(GET_REPEATED_CNT_COMMENT);
		return readLine();
	}

	public static void printRacingResultTitle() {
		System.out.println("\n실행 결과");
	}

	public static void printRacingProgress(String name, int progress) {
		System.out.printf("%s : %s%n", name, repeatChar('-', progress));
	}

	private static String repeatChar(char ch, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(ch);
		}
		return sb.toString();
	}

	public static void printNewLine() {
		System.out.println();
	}

	public static void printFinalResult(List<String> names) {
		String nameString = names.toString().replace("[", "").replace("]", "");
		System.out.printf("최종 우승자는 %s 입니다.\n", nameString);
	}
}
