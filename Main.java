
//import scanner class.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//initialize scanner class in main method.
		Scanner In = new Scanner(System.in);
		//call method runProgram() to run the whole program in main method.
		runProgram();
		//print newline for equal spacing and presentable output.
		System.out.println();
		//Take user input and check if user wants to run the program again.
		String reRun;
		System.out.println("User, would you like to rerun the program, yes or no: ");
		reRun = In.nextLine();
		// using a while loop to keep asking user to rerun the program after one execution of the program had completed.
		while (reRun.equals("yes") || reRun.equals("Yes")) {
		    //print newline for equal spacing and presentable output.
			System.out.println();
			//if yes, call method runProgram() again.
			runProgram();
			//print newline for equal spacing and presentable output.
			System.out.println();
			//Take user input and check if user wants to run the program again.
			System.out.println("User, would you like to rerun the program, yes or no: ");
		    reRun = In.nextLine();
		    //condition to check if user wants to run the program again.
			if(reRun.equals("yes") || reRun.equals("Yes")){
			    //print newline for equal spacing and presentable output.
			    System.out.println();
			    //if yes, call method runProgram() again.
			    runProgram();
			}
		}

	}
	//define method runProgram() to run the whole program.
	public static void runProgram() {
		//initialize scanner class in runProgram() method.
		Scanner In = new Scanner(System.in);
		//declare variables
		int userChoice;
		boolean truth = true;

		//display menu to user and prompt them to choose an option.
		System.out.println("User, welcome to the Calendar program. Please select the following options below on which program you would like to run: ");
		System.out.println("1. Display calendar for 12 months of a whole year of any year after 1900 or the year 1900.");
		System.out.println("2. Display calendar for one month of any year after 1900 or the year 1900.");
		System.out.println("3. Display what day of the week of any year after 1900 or the year 1900.");
		System.out.println("4. Display the date of n days after February 1, 2021.");
		System.out.println("User, would option would you like to choose, 1, 2, 3, 4 , please enter option as a whole number, like if you pick option1, type 1, and so on.");
		userChoice = In.nextInt();

		//while loop to check if user entered an invalid value.
		while (userChoice > 4 || userChoice<1) {
			//if yes, they are prompted every time, until they enter an valid value.
			System.out.println("Invalid Input. User, please reneter the option, with one of the following numbers, 1, 2, 3, or 4: ");
			userChoice = In.nextInt();
			//if user, enters a value, the while loop is stopped and exited.
			if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4)
				break;
		}

		//condition to check if user chose option 1.
		if (userChoice == 1) {
			//if yes, the variable yearInput is declared and they are asked to enter a value of the year, they would like to see the whole year 12 month calendar for the year they entered.
			int yearInput;
			System.out.println("User, please enter any year: ");
			yearInput = In.nextInt();
			//check for invalid user input, when user enters a number less than 1900.
			while (yearInput<1900) {
				System.out.println("Invalid Input. User, please enter a positive integer value greater than or equal to 1900 for the year: ");
				yearInput = In.nextInt();
			}

			//call method yearCalendar(yearInput) with the year as the parameter, to print calendar for that year.
			yearCalendar(yearInput);
		}

		//condition to check if user chose option 2.     
		if (userChoice == 2) {
			//declare variables.
			String monthInput;
			int userYearInput;

			//take user input for year.

			System.out.println("User, please enter any year: ");
			userYearInput = In.nextInt();
			//check for invalid user input, when user enters a number less than 1900.
			while (userYearInput<1900) {
				System.out.println("Invalid Input. User, please enter a positive integer value greater than or equal to 1900 for the year: ");
				userYearInput = In.nextInt();
			}
			//take user input for month, I did two lines for user input because when you are taking user input for a string if you don't have two lines, the user will not be able to input the month.
			System.out.println("User, please enter the name of the month as a string that you would like to enter.");
			monthInput = In.nextLine();
			monthInput = In.nextLine();

			//check for invalid user input for month.
			while (truth == true) {
				//if input for the name of the month is valid, the loop is exited.
				if (monthInput.equals("January") || monthInput.equals("February") || monthInput.equals("March") || monthInput.equals("April") || monthInput.equals("May") || monthInput.equals("June") || monthInput.equals("July") || monthInput.equals("August") || monthInput.equals("September") || monthInput.equals("October") || monthInput.equals("November") || monthInput.equals("December")) {
					break;
				}
				//otherwise, if the input is invalid the user is prompted again to enter the name of the month.
				else {
					System.out.println("Invalid Input. User, please reenter the value of the month with proper spelling and the first letter should be capitalized.");
					monthInput = In.nextLine();
				}
			}
			//call method monthCalendar(monthInput, userYearInput) with the name of the month entered by the user and the year enetered by the user as two parameters and prints calendar of any 1 month user wants printed for the year entered by the user.
			monthCalendar(monthInput, userYearInput);

		}

		//condition to check if user chose option 3. 
		if (userChoice == 3) {
			//declare variables.
			int yearInput, dayInput;
			String monthInput;

			//take user input for year.
			System.out.println("User, please enter any year: ");
			yearInput = In.nextInt();

			//check for invalid user input, when user enters a number less than 1900.
			while (yearInput<1900) {
				System.out.println("Invalid Input. User, please enter a positive value greater than or equal to 1900 for the year: ");
				yearInput = In.nextInt();
			}

			//take user input for month, I did two lines for user input because when you are taking user input for a string if you don't have two lines, the user will not be able to input the month.
			System.out.println("User, please enter the name of the month as a string that you would like to enter.");
			monthInput = In.nextLine();
			monthInput = In.nextLine();

			//check for invalid user input for month.
			while (truth == true) {
				//if input for the name of the month is valid, the loop is exited.
				if (monthInput.equals("January") || monthInput.equals("February") || monthInput.equals("March") || monthInput.equals("April") || monthInput.equals("May") || monthInput.equals("June") || monthInput.equals("July") || monthInput.equals("August") || monthInput.equals("September") || monthInput.equals("October") || monthInput.equals("November") || monthInput.equals("December")) {
					break;
				}

				//otherwise, if the input is invalid the user is prompted again to enter the name of the month.
				else {
					System.out.println("Invalid Input. User, please reenter the value of the month with proper spelling and the first letter should be capitalized.");
					monthInput = In.nextLine();
				}
			}
			//take user input for day.
			System.out.println("User, please enter the day of the month you would like to find out the date for: ");
			dayInput = In.nextInt();
			//check for invalid input for day, if day is less than 0
			while (dayInput<= 0 || dayInput > 31){
				System.out.println("Invalid Input. User, please reneter the value of the days of the month: ");
				dayInput = In.nextInt();
				if(dayInput > 0 || ((monthInput.equals("January") || monthInput.equals("March") || monthInput.equals("May") || monthInput.equals("July") || monthInput.equals("August") || monthInput.equals("October") || monthInput.equals("December") && dayInput <= 31)) || ((monthInput.equals("April") || monthInput.equals("June") || monthInput.equals("September") || monthInput.equals("November") && dayInput <= 30)) || ((leapYear(yearInput) && monthInput.equals("February") && dayInput <= 29)) || ((monthInput.equals("February") && dayInput <= 28))){
				    break;
				}
			}

			//call method dayNameFinder((monthInput, dayInput, yearInput)) with the month inputed by the user, the day inputted by the user and year inputted by the user as three parameters, the method will print out the day fo the week for the date given by the user after and inclduing the year 1900.
			dayNameFinder(monthInput, dayInput, yearInput);

		}

		//condition to check if user chose option 4.
		if (userChoice == 4) {
			//declare variable.
			int userDaysInput;
			//take user input for days entered by the user.
			System.out.println("User, please enter the number of days after February 1, 2021, that you would like to find the date for: ");
			userDaysInput = In.nextInt();

			//check for invalid input for days entered by the user.
			while (userDaysInput<= 0) {
				System.out.println("Invalid Input. User, please enter a positive value of the number of days that is greater than 0: ");
				userDaysInput = In.nextInt();
			}

			//called method dateFinder(userDaysInput) that takes the number of days after February 1, 2021, that the user would like to find the date for and the program finds that date.
			dateFinder(userDaysInput);
		}
	}

	//define method yearCalendar(year) with year as an integer parameter to print out the 12 month calendar for the year entered by the user after and including 1900.
	public static void yearCalendar(int year) {
		//declare variables adn display dashed lines on line 186 for presentable and neat looking output.
		String monthStartday = "", month = "";
		int days = 0, febDay = 0, monthNum = 0, daysPerMonth = 0;
		System.out.println("------------------------------------------------------");
		month = "January";

		//condition to check if month is equal to Janaury.
		if (month.equals("January")) {
			//if yes, program uses a for loop and calculates all the days from 1900 and the previous year before the year entered by the user.
			for (int j = 1900; j<year; j++) {
				//leapYear method call to check if j is a leap year.
				if (leapYear(j))
					//if yes, add 366 to days.
					days = days + 366;
				else
					//otherwise, add 366 to days.
					days = days + 365;
			}

		}

		// Find out the days for February by checking if year entered by user is a leap year by calling the leap year method.
		if (leapYear(year)) {
			febDay = 29;
		} else {
			febDay = 28;
		}
		//for loop to print the whole year calendar for all 12 months in an year.
		for (int i = 1; i<= 12; i++) {

			System.out.println();
			//condition check if i is equal to 1 and print calendar for the month of January.
			if (i == 1) {
				System.out.println("                  January");
				daysPerMonth = 31;
			}

			//condition check if i is equal to 2 and print calendar for the month of February.
			if (i == 2) {
				System.out.println("                  February");
				daysPerMonth = febDay;
				//Add days of printed January calendar.
				days = days + 31;
			}

			//condition check if i is equal to 3 and print calendar for the month of March.
			if (i == 3) {
				System.out.println("                  March");
				//Add days of printed February calendar.
				daysPerMonth = febDay;
			}

			//condition check if i is equal to 4 and print calendar for the month of April.
			if (i == 4) {
				System.out.println("                  April");
				daysPerMonth = 30;
				//Add days of printed March Calendar.
				days = days + 31;
			}

			//condition check if i is equal to 5 and print calendar for the month of May.
			if (i == 5) {
				System.out.println("                  May");
				daysPerMonth = 31;
				//Add days of printed April Calendar.
				days = days + 30;
			}

			//condition check if i is equal to 6 and print calendar for the month of June.
			if (i == 6) {
				System.out.println("                  June");
				daysPerMonth = 30;
				//Add days of printed May calendar.
				days = days + 31;
			}

			//condition check if i is equal to 7 and print calendar for the month of July.
			if (i == 7) {
				System.out.println("                  July");
				daysPerMonth = 31;
				//Add days of printed June Calendar.
				days = days + 30;
			}

			//condition check if i is equal to 8 and print calendar for the month of August.
			if (i == 8) {
				System.out.println("                  August");
				daysPerMonth = 31;
				//Add days of printed July Calendar.
				days = days + 31;
			}

			//condition check if i is equal to 9 and print calendar for the month of September.
			if (i == 9) {
				System.out.println("                  September");
				daysPerMonth = 30;
				//Add printed days of August Calendar.
				days = days + 31;
			}

			//condition check if i is equal to 10 and print calendar for the month of October.
			if (i == 10) {
				System.out.println("                  October");
				daysPerMonth = 31;
				//Add printed days of September Calendar.
				days = days + 30;
			}

			//condition check if i is equal to 11 and print calendar for the month of November.
			if (i == 11) {
				System.out.println("                  November");
				daysPerMonth = 30;
				//Add printed days of the October Calendar.
				days = days + 31;
			}

			//condition check if i is equal to 12 and print calendar for the month of December.
			if (i == 12) {
				System.out.println("                  December");
				daysPerMonth = 31;
				//Add printed days of Novemeber Calendar.
				days = days + 30;
			}

			//declare monthStartDay variable equal to the method of startDayOfMonth days to find out the start day of the month.
			monthStartday = startDayOfMonth(days);
			//called method printMonthCalendar(daysPerMonth, monthStartday); 12 inside the for loop to print the calendar of the whole year.
			printMonthCalendar(daysPerMonth, monthStartday);
		}
		//print newline and dash after it for presentable output and proper spacing.
		System.out.println();
		System.out.println("------------------------------------------------------");

	}

	//define method leapYear(year), with year as one int parameter and check if the year entered by the user is a leap year or not.
	public static boolean leapYear(int year) {

		if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			return true;
		else
			return false;
	}

	//define method printMonthCalendar(numberofdaysinmonth, daymonthstarts)to print the calendar of a month based on the start day of the month and numebr of days in the month entered by the user.
	public static void printMonthCalendar(int numOfDays, String dayMonthStarts) {
		//print calendar header using printf.
		System.out.println("------------------------------------------------------");
		System.out.printf("%7s%7s%7s%7s%7s%7s%7s\n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
		//declare and initialize variable spaceCounterPerDay.
		int spaceCounterPerDay = 0;
		//condition to check if month starts on Sunday.
		if (dayMonthStarts.equals("Monday")) {
			//if yes, spaceCounterPerDay is equal to 0.
			spaceCounterPerDay = 0;
		}

		//condition to check if month starts on Monday.
		else if (dayMonthStarts.equals("Tuesday")) {
			//if yes, spaceCounterPerDay is equal to 1 and there is 7 spaces in front of the numebr for formatting calendar.
			spaceCounterPerDay = 1;
			System.out.printf("%7s", " ");
		}

		//condition to check if month starts on Tuesday.
		else if (dayMonthStarts.equals("Wednesday")) {
			//if yes, spaceCounterPerDay is equal to 2 and there is 14 spaces in front of the numebr for formatting calendar.
			spaceCounterPerDay = 2;
			System.out.printf("%14s", " ");
		}

		//condition to check if month starts on Wednesday.
		else if (dayMonthStarts.equals("Thursday")) {
			//if yes, spaceCounterPerDay is equal to 3 and there is 21 spaces in front of the numebr for formatting calendar.
			spaceCounterPerDay = 3;
			System.out.printf("%21s", " ");
		}

		//condition to check if month starts on Thursday.
		else if (dayMonthStarts.equals("Friday")) {
			//if yes, spaceCounterPerDay is equal to 4 and there is 28 spaces in front of the numebr for formatting calendar.
			spaceCounterPerDay = 4;
			System.out.printf("%28s", " ");
		}

		//condition to check if month starts on Friday.
		else if (dayMonthStarts.equals("Saturday")) {
			//if yes, spaceCounterPerDay is equal to 5 and there is 35 spaces in front of the numebr for formatting calendar.
			spaceCounterPerDay = 5;
			System.out.printf("%35s", " ");
		}

		//condition to check if month starts on Saturday.
		else if (dayMonthStarts.equals("Sunday")) {
			//if yes, spaceCounterPerDay is equal to 6 and there is 42 spaces in front of the numebr for formatting calendar.
			spaceCounterPerDay = 6;
			System.out.printf("%42s", " ");
		}

		//for loop to print numebrs in the calendar from 1 to total days in the calendar entered by the user, with loop control variable j being incremented by 1 each time.
		for (int j = 1; j<= numOfDays; j++) {
			//format numbers with seven spaces between them.
			System.out.printf("%7s", j);
			//condition to check how many numebrs to print on the first line, when j+spaceCounterPerDay % 7 == 0. For, example 7 numebrs for start day Sunday in line1, 6 numbers for start day Monday, and so on.
			if ((j + spaceCounterPerDay) % 7 == 0) {
				//if yes, print newline.
				System.out.println();
			}

		}
		System.out.println();
	}

	//define method monthCalendar(month, year) which takes one string parameter, the name of the month entered by the user and the year entered by the user and prints the calendar one month in that year, both are chosen by the user.
	public static void monthCalendar(String month, int year) {
		//declare variables.
		String monthStartday = "";
		int days = 0, febDay = 0, monthNum = 0, daysPerMonth = 0;

		// for loop that calculates all the days from 1900 and the previous year before the year entered by the user.
		for (int j = 1900; j<year; j++) {
			if (leapYear(j))
				days = days + 366;
			else
				days = days + 365;
		}

		// Find out the days for February by checking if year entered by user is a leap year by calling the leap year method.
		if (leapYear(year)) {
			febDay = 29;
		} else {
			febDay = 28;
		}

		//for loop to go through all the 12 months in year.
		for (int i = 1; i<= 12; i++) {

			//condition to check if i is equal to 1 and month entered by user is January. 
			if (i == 1 && month.equals("January")) {
				System.out.println("    January " + year);
				daysPerMonth = 31;
			}

			//condition to check if i is equal to 2 and month entered by user is February. 
			if (i == 2 && month.equals("February")) {
				System.out.println("    February " + year);
				days = days + 31;
				//Add days of January calendar.
				daysPerMonth = febDay;

			}

			//condition to check if i is equal to 3 and month entered by user is March. 
			if (i == 3 && month.equals("March")) {
				System.out.println("   March " + year);
				//Add days of February and January calendar.
				days = days + febDay + 31;
				daysPerMonth = 31;

			}

			//condition to check if i is equal to 4 and month entered by user is April. 
			if (i == 4 && month.equals("April")) {
				System.out.println("   April " + year);
				//Add days of February, January and March calendar.
				days = days + (31 * 2) + febDay;
				daysPerMonth = 30;
			}

			//condition to check if i is equal to 5 and month entered by user is May. 
			if (i == 5 && month.equals("May")) {
				System.out.println("   May " + year);
				//Add days of January, February, March and April calendar.
				days = days + (31 * 2) + febDay + 30;
				daysPerMonth = 31;
			}

			//condition to check if i is equal to 6 and month entered by user is June. 
			if (i == 6 && month.equals("June")) {
				System.out.println("   June " + year);
				//Add days of January, February, March, April and May calendar.
				days = days + (31 * 3) + febDay + 30;
				daysPerMonth = 30;
			}

			//condition to check if i is equal to 7 and month entered by user is July. 
			if (i == 7 && month.equals("July")) {
				System.out.println("   July " + year);
				//Add days of January, February, March, April, May and June calendar.
				days = days + (31 * 3) + febDay + (30 * 2);
				daysPerMonth = 31;
			}

			//condition to check if i is equal to 8 and month entered by user is August. 
			if (i == 8 && month.equals("August")) {
				System.out.println("   August " + year);
				//Add days of January, February, March, April, May, June and July calendar.
				days = days + (31 * 4) + febDay + (30 * 2);
				daysPerMonth = 31;
			}

			//condition to check if i is equal to 9 and month entered by user is September. 
			if (i == 9 && month.equals("September")) {
				System.out.println("   September " + year);
				//Add days of January, February, March, April, May, June, July and August calendar.
				days = days + (31 * 5) + febDay + (30 * 2);
				daysPerMonth = 30;
			}

			//condition to check if i is equal to 10 and month entered by user is October. 
			if (i == 10 && month.equals("October")) {
				System.out.println("   October " + year);
				//Add days of January, February, March, April, May, June, July, August and September calendar.
				days = days + (31 * 5) + febDay + (30 * 3);
				daysPerMonth = 31;
			}

			//condition to check if i is equal to 11 and month entered by user is November. 
			if (i == 11 && month.equals("November")) {
				System.out.println("  November " + year);
				//Add days of January, February, March, April, May, June, July, August, September, and October calendar.
				days = days + (31 * 6) + febDay + (30 * 3);
				daysPerMonth = 30;
			}

			//condition to check if i is equal to 12 and month entered by user is December. 
			if (i == 12 && month.equals("December")) {
				System.out.println("  December " + year);
				//Add days of January, February, March, April, May, June, July, August, September, October and November calendar.
				days = days + (31 * 6) + febDay + (30 * 4);
				daysPerMonth = 31;
			}

		}

		//declare monthStartDay variable equal to the method of startDayOfMonth days to find out the start day of the month.
		monthStartday = startDayOfMonth(days);
		//called method printMonthCalendar(daysPerMonth, monthStartday); 12 inside the for loop to print the calendar of only one month.
		printMonthCalendar(daysPerMonth, startDayOfMonth(days));
		//print new line and dashing line for presentable output and proper spacing.
		System.out.println();
		System.out.println("------------------------------------------------------");

	}

	//define method startDayOfMonth(totDay) with total days as an parameter to determine and return the start day of each month fro part a, b, and c.	
	public static String startDayOfMonth(int totDay) {
		//declare variable.
		String monthStartday = "";

		//start day of the month is Monday if total days %(modulus) 7 is equal to 0.
		if (totDay % 7 == 0)
			monthStartday = "Monday";

		//start day of the month is Tuesday if total days %(modulus) 7 is equal to 1.  
		else if (totDay % 7 == 1)
			monthStartday = "Tuesday";

		//start day of the month is Wednesday if total days %(modulus) 7 is equal to 2.     
		else if (totDay % 7 == 2)
			monthStartday = "Wednesday";

		//start day of the month is Thursday if total days %(modulus) 7 is equal to 3.      
		else if (totDay % 7 == 3)
			monthStartday = "Thursday";

		//start day of the month is Friday if total days %(modulus) 7 is equal to 4.      
		else if (totDay % 7 == 4)
			monthStartday = "Friday";

		//start day of the month is Saturday if total days %(modulus) 7 is equal to 5.      
		else if (totDay % 7 == 5)
			monthStartday = "Saturday";

		//start day of the month is Sunday if total days %(modulus) 7 is equal to 6.      
		else if (totDay % 7 == 6)
			monthStartday = "Sunday";

		//return stary day of month.      
		return monthStartday;
	}

	//define method dayNameFinder(month, day, year) with month as a string parameter, and day and year as int parameter, month returns the day of the week of any date specified by the user after and including the year 1900.
	public static String dayNameFinder(String month, int day, int year) {
		//declare variables.
		String monthStartday = "";
		int days = 0, febDay = 0, monthNum = 0, daysPerMonth = 0;

		// for loop that calculates all the days from 1900 and the previous year before the year entered by the user.
		for (int j = 1900; j<year; j++) {
			if (leapYear(j))
				days = days + 366;
			else
				days = days + 365;
		}

		// Find out the days for February by checking if year entered by user is a leap year by calling the leap year method.
		if (leapYear(year)) {
			febDay = 29;
		} else {
			febDay = 28;
		}

		////for loop to go through all the 12 months in year.
		for (int i = 1; i<= 12; i++) {

			//condition to check if i is equal to 1 and month entered by user is equal to January.
			if (i == 1 && month.equals("January")) {
				//days in January is equal to day entered by the user - 1.
				daysPerMonth = day+1;
			}

			//condition to check if i is equal to 2 and month entered by user is equal to February.
			if (i == 2 && month.equals("February")) {
				//Add days of January calendar, plus day entered by the user - 1.
				days = (days + 31 + day) - 1;

			}

			//condition to check if i is equal to 3 and month entered by user is equal to March.
			if (i == 3 && month.equals("March")) {
				//Add days of January and February calendar, plus day entered by the user - 1.
				days = (days + febDay + 31 + day) - 1;
			}

			//condition to check if i is equal to 4 and month entered by user is equal to April.
			if (i == 4 && month.equals("April")) {
				//Add days of January, February and March calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 2) + day) - 1;
			}

			//condition to check if i is equal to 5 and month entered by user is equal to May.
			if (i == 5 && month.equals("May")) {
				//Add days of January, February, March and April calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 2) + 30 + day) - 1;
			}

			//condition to check if i is equal to 6 and month entered by user is equal to June.
			if (i == 6 && month.equals("June")) {
				//Add days of January, February, March, April and May calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 3) + 30 + day) - 1;
			}

			//condition to check if i is equal to 7 and month entered by user is equal to July.
			if (i == 7 && month.equals("July")) {
				//Add days of January, February, March, April, May and June calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 3) + (30 * 2) + day) - 1;
			}

			//condition to check if i is equal to 8 and month entered by user is equal to August.
			if (i == 8 && month.equals("August")) {
				//Add days of January, February, March, April, May, June and July calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 4) + (30 * 2) + day) - 1;
			}

			//condition to check if i is equal to 9 and month entered by user is equal to September.
			if (i == 9 && month.equals("September")) {
				//Add days of January, February, March, April, May, June, July and August calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 5) + (30 * 2) + day) - 1;
			}

			//condition to check if i is equal to 10 and month entered by user is equal to October.
			if (i == 10 && month.equals("October")) {
				//Add days of January, February, March, April, May, June, July, August and September calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 5) + (30 * 3) + day) - 1;
			}

			//condition to check if i is equal to 11 and month entered by user is equal to November.
			if (i == 11 && month.equals("November")) {
				//Add days of January, February, March, April, May, June, July, August, September and October calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 6) + (30 * 3) + day) - 1;

			}

			//condition to check if i is equal to 12 and month entered by user is equal to December.
			if (i == 12 && month.equals("December")) {
				//Add days of January, February, March, April, May, June, July, August, September, October and November calendar, plus day entered by the user - 1.
				days = (days + febDay + (31 * 6) + (30 * 4) + day) - 1;

			}

		}
		//call method startDayOfMonth(days) to print out what day of the week, the date specified by the user falls on.
		System.out.print(startDayOfMonth(days));

		//return method startDayOfMonth(days).
		return startDayOfMonth(days);
	}

	//define method dateFinder(n), with n as integer paprameter to calculate and print out the date n days after February 1, 2021.        
	public static void dateFinder(int n) {
		//condition to check if n less than or equal to 365.
		if (n<= 365) {
			//if yes, check all these conditions to find out which month the future date falls.
			if (n<= 27)
				System.out.println("February " + ((1 + n)) + ", 2021");
			if (n > 27 && n<= 58)
				System.out.println("March " + ((n - 27)) + ", 2021");
			if (n > 58 && n<= 88)
				System.out.println("April " + ((n - 58)) + ", 2021");
			if (n > 88 && n<= 119)
				System.out.println("May " + ((n - 88)) + ", 2021");
			if (n > 119 && n<= 149)
				System.out.println("June " + ((n - 119)) + ", 2021");
			if (n > 149 && n<= 180)
				System.out.println("July " + ((n - 149)) + ", 2021");
			if (n > 180 && n<= 211)
				System.out.println("August " + ((n - 180)) + ", 2021");
			if (n > 211 && n<= 241)
				System.out.println("September " + ((n - 211)) + ", 2021");
			if (n > 241 && n<= 272)
				System.out.println("October " + ((n - 241)) + ", 2021");
			if (n > 272 && n<= 302)
				System.out.println("November " + ((n - 272)) + ", 2021");
			if (n > 302 && n<= 333)
				System.out.println("December " + ((n - 302)) + ", 2021");
			if (n > 333 && n<= 364)
				System.out.println("January " + ((n - 333)) + ", 2022");
			if (n == 365)
				System.out.println("February 1, 2022");

		}
		//declare variables to calculate year date falls on, and number of leapyears.
		int year = 2021 + (n / 365);
		int leapYears = (n / 365) / 4;

		//condition to check if n is greater than 365.
		if (n > 365) {
			//update value of n.
			n = (n - (n / 365) * 365) - leapYears;
			//if yes, check all these conditions to find out which month the future date falls.
			if (n<= 27)
				System.out.println("February " + ((1 + n)) + ", " + year);
			if (n > 27 && n<= 58)
				System.out.println("March " + ((n - 27)) + ", " + year);
			if (n > 58 && n<= 88)
				System.out.println("April " + ((n - 58)) + ", " + year);
			if (n > 88 && n<= 119)
				System.out.println("May " + ((n - 88)) + ", " + year);
			if (n > 119 && n<= 149)
				System.out.println("June " + ((n - 120)) + ", " + year);
			if (n > 149 && n<= 180)
				System.out.println("July " + ((n - 149)) + ", " + year);
			if (n > 180 && n<= 211)
				System.out.println("August " + ((n - 180)) + ", " + year);
			if (n > 211 && n<= 241)
				System.out.println("September " + ((n - 211)) + ", " + year);
			if (n > 241 && n<= 272)
				System.out.println("October " + ((n - 241)) + ", " + year);
			if (n > 272 && n<= 302)
				System.out.println("November " + ((n - 272)) + ", " + year);
			if (n > 302 && n<= 333)
				System.out.println("December " + ((n - 302)) + ", " + year);
			if (n > 333 && n<= 364)
				System.out.println("January " + ((n - 333)) + ", " + (year + 1));
			if (n % 365 == 0 || n % 366 == 0)
				System.out.println("February 1, " + (year + 1));

		}
		//declare variables to calculate year date falls on, and number of leapyears.
		year = 2021 + (n / 365) + 1;
		leapYears = (n / 365) / 4;
		//condition to check if n is greater than 10,000.
		if (n >= 10000 && n > 365) {
			//update value of n.
			n = (n - (n / 365) * 365) - leapYears;
			//if yes, check all these conditions to find out which month the future date falls.
			if (n<= 27)
				System.out.println("February " + ((1 + n)) + ", " + year);
			if (n > 27 && n<= 58)
				System.out.println("March " + ((n - 27)) + ", " + year);
			if (n > 58 && n<= 88)
				System.out.println("April " + ((n - 58)) + ", " + year);
			if (n > 88 && n<= 119)
				System.out.println("May " + ((n - 88)) + ", " + year);
			if (n > 119 && n<= 149)
				System.out.println("June " + ((n - 119)) + ", " + year);
			if (n > 149 && n<= 180)
				System.out.println("July " + ((n - 149)) + ", " + year);
			if (n > 180 && n<= 211)
				System.out.println("August " + ((n - 180)) + ", " + year);
			if (n > 211 && n<= 241)
				System.out.println("September " + ((n - 211)) + ", " + year);
			if (n > 241 && n<= 272)
				System.out.println("October " + ((n - 241)) + ", " + year);
			if (n > 272 && n<= 302)
				System.out.println("November " + ((n - 272)) + ", " + year);
			if (n > 302 && n<= 333)
				System.out.println("December " + ((n - 302)) + ", " + year);
			if (n > 333 && n<= 364)
				System.out.println("January " + ((n - 333)) + ", " + (year + 1));
			if (n % 365 == 0 || n % 366 == 0)
				System.out.println("February 1, " + (year + 1));

		}
		//print new line and dashing line for presentable output and proper spacing.
		System.out.println();
		System.out.println("------------------------------------------------------");

	}

}









