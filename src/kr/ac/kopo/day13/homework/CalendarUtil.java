package kr.ac.kopo.day13.homework;

/*

과제2>
선택하세요(1. 특정년도   2. 특정월   3. 종료) => 1
년도를 입력하세요 : 2020
<< 2020년 1월 >>
일  월  화  수  목  금  토
           1  2   3   4
5  6

<< 2020년 2월 >>

<< 2020년 12월 >>

선택하세요(1. 특정년도   2. 특정월   3. 종료) => 2
년도를 입력하세요 : 2020
월을 입력하세요 : 1
<< 2020년 1월 >>
일  월  화  수  목  금  토
          1   2   3   4
5   6

선택하세요(1. 특정년도   2. 특정월   3. 종료) => 3

 */
public class CalendarUtil {

	public static void main(String[] args) {
		
		InputUtil input = new InputUtil();
		
		int year = 0;
		int month = 0;
		int menuNum = 0;
		
		CalendarMaker c = new CalendarMaker();
		
		while (menuNum != 3) {
			
			menuNum = input.getInt("선택하세요(1. 특정년도   2. 특정월   3. 종료  4. 교수님 코드)");
			 
			switch(menuNum) {
			
			case 1:
				year = input.getInt("년도를 입력하세요 :");
				c.printYearCalendar(year);
				break;
			case 2:				
				year = input.getInt("년도를 입력하세요 :");
				month = input.getInt("월을 입력하세요 :");
				c.printMonthCalendar(year, month);
				break;
			case 3:
				System.out.println("종료합니다.");
				System.exit(0);//프로그램을 종료합니다.
				//break;
			case 4: 
				System.out.println("교수님 작성하신 코드입니다.");
				year = input.getInt("년도를 입력하세요 :");
				c.showDayByYear(year);
				break;
			default :
				System.out.println("다시 입력하세요");
			}
			
		}//WHILE :: while 종료
	}
}

// BuildPath => comfigureBuildPath => 3 번째 libraries =>  