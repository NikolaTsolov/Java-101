package wednesday_friday;

public class FridayYear {

	public static int CURRENT_YEAR = 2015;
	public static int CURRENT_FIRST_DAY = 4;

	public static int leapYear(int curFiDay) {
		if (curFiDay > 2) {
			curFiDay -= 2;
		} else if (curFiDay == 2) {
			curFiDay = 7;
		} else {
			curFiDay = 6;
		}

		return curFiDay;
	}

	public static int normalYear(int curFiDay) {
		if (curFiDay > 1) {
			curFiDay--;
		} else {
			curFiDay = 7;
		}

		return curFiDay;
	}

	public static int fridayYear(String start, String end) {
		int s = Integer.parseInt(start);
		int e = Integer.parseInt(end);

		int curFiDay = CURRENT_FIRST_DAY;
		int count = 0;

		for (int i = CURRENT_YEAR; i >= s; i--) {
			if (i % 4 == 0 && !(i % 100 == 0 && !(i % 400 == 100))) {
				if ((curFiDay == 5 || curFiDay == 4) && e >= i) {
					count++;
				}
				curFiDay = leapYear(curFiDay);
			} else {
				if (curFiDay == 5 && e >= i) {
					count++;
				}
				curFiDay = normalYear(curFiDay);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(fridayYear("1990", "2015"));
		System.out.println(fridayYear("1753", "2000"));
		System.out.println(fridayYear("1000", "2000"));
	}
}
