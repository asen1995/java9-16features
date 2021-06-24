package java14;

public class SwitchExpressions {

	public static boolean isTodayHoliday(String day) {

		return switch (day) {
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
		case "SATURDAY", "SUNDAY" -> true;
		default -> throw new IllegalArgumentException("What's a " + day);
		};

	}

}
