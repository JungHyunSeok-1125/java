package kr.ac.kopo.day17.hw1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 
 1. 탐색기 구현
----------------------------------------------------------
   iodata 폴더 정보
----------------------------------------------------------
이름      종류   크기   마지막수정날짜
새폴더      폴더
새새폴더      폴더
a.txt      파일   3bytes   2021-05-25 11:25:12
b.txt      파일   25bytes   
----------------------------------------------------------
[M] 새폴더   [R]이름변경   [D]삭제   [.]상위폴더이동   [move]하위폴더 이동 

: move 새새폴더
----------------------------------------------------------
   iodata/새새폴더 폴더 정보
----------------------------------------------------------
이름      종류   크기   마지막수정날짜
----------------------------------------------------------

 */
public class Hw1 {

	public static void main(String[] args) {

		String type = "";
		int cnt = 0;
		File dirObj = new File("IOdata2");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		Scanner sc = new Scanner(System.in);
		File[] fList = null;
		String[]fileNames = null;
		
		while (true) {
			cnt = 0;//LINE :: 카운팅 초기화
			fList = dirObj.listFiles(); 
			fileNames =dirObj.list();
			
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("\t탐색기 구현");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("\t"+dirObj.getName()+"정보");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("이름\t종류\t크기\t마지막수정날짜");
			System.out.println("------------------------------------------------------------------------------------");
			while(fList.length != cnt) {
				System.out.print(fileNames[cnt]);
				System.out.print(fList[cnt].isDirectory() ? "\t디렉토리" :(fList[cnt].isFile() ? "\t파일" : "\t모르겠습니다"));;
				System.out.print("\t"+fList[cnt].length());
				System.out.print("\t"+sdf.format(new Date(fList[cnt].lastModified())));
				System.out.println();
				cnt += 1; 
			}//WHILE :: 카운팅 더하면서 해당 내용들을 출력한다.
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("[M]새폴더\t\t[R]이름변경\t[D]삭제\t\t[.]상위폴더이동\t[move]하위폴더 이동 ");
			System.out.print(": ");
			type = sc.nextLine();
			
			switch (type) {
			case "M": //CASE "M" :: 새폴더
				String newdirName;
				File newDir;
				System.out.print("새로 추가할 폴더 이름을 입력하세요 : ");
				newdirName = sc.nextLine();
				newDir = new File(dirObj +"/"+newdirName);
				System.out.println(newDir.mkdir()?"생성 성공":"생성 실패");
				break;
			case "R": //CASE "R" :: 이름변경
				String changeFileName = null;
				String originFileName = null;
				System.out.print("파일 이름을 입력하세요 : ");
				originFileName = sc.nextLine();
				File originalFile = new File(dirObj +"/"+originFileName);
				if(!originalFile.exists()) {					
					System.out.println("해당 파일이 없습니다"); 
					break;
				} //IF :: 파일 존재 여부 확인
				else {
					System.out.print("변경할 파일 이름을 입력하세요 : ");
					changeFileName = sc.nextLine();
				} 
				System.out.println(originalFile.renameTo(new File(dirObj+"/"+changeFileName))?"변경에 성공하였습니다":"변경에 실패하였습니다." );
				break;
			case "D": //CASE "D" :: 파일 삭제
				String deldirName;
				System.out.print("삭제할 파일 이름을 입력하세요 : ");
				deldirName = sc.nextLine();
				File deldir = new File(dirObj +"/"+deldirName);
				System.out.println(deldir.delete()?"삭제 성공":"삭제 실패");
				break;
			case ".": //CASE "." :: 상위 폴더로 이동
				String parentPath = dirObj.getParent();
				if(parentPath != null) dirObj = new File(parentPath); //LINE :: 상위 폴더가 없다면 널값이 반환된다..
				else System.out.println("최상위 폴더입니다.");
				break;
			case "move": //CASE "move" :: 파일 이동
				System.out.print("하위 폴더 이름을 입력하세요 :");
				String childPath = sc.nextLine();
				File chkObj = new File(dirObj +"/"+ childPath);
				if(chkObj.exists()&&chkObj.isDirectory()) dirObj = chkObj; //LINE :: 존재 여부와 디렉토리인지 동시에 확인
				else System.out.println("해당 하위 폴더가 존재하지 않습니다.");
				
				break;
			case "q": //CASE "q" :: 종료
				System.out.println("종료합니다.");
				System.exit(0);
				break;	
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
			
		}

	}

}
