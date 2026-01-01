package test;

import java.util.Scanner;

public class Test02 {
    static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("등록할 인원수 : ");
    int num = sc.nextInt();
    Students[] students = new Students[num];

    for (int i=0; i<num; i++) {
        students[i] = new Students();
        System.out.print("이름 : ");
        students[i].setName(sc.next());
        System.out.print("수학 : ");
        students[i].setMath(sc.nextInt());
        System.out.print("영어 : ");
        students[i].setEnglish(sc.nextInt());
        System.out.println("-------------");
    }
    System.out.println(num+"명 등록 완료!!");
    for (int i=0; i<num; i++) {
        System.out.print(students[i].getName()+" ");
        System.out.print(students[i].getMath()+" ");
        System.out.println(students[i].getEnglish()+" ");
    }

    }

}

class Students {
    String name;
    int math;
    int english;

    void setName (String name) {
        this.name = name;
    }
    String getName () {
        return name;
    }

    void setMath (int math) {
        this.math = math;
    }
    int getMath () {
        return math;
    }
    void setEnglish (int english) {
        this.english = english;
    }
    int getEnglish () {
        return english;
    }

}



package test;

public class Test02 {
	// 학생들의 정보를 입력하고, 출력하는 프로그램을 작성하기
	
	// 학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
	// 프로그램을 실행하면 몇 명의 정보를 저장 할 것인지를 입력받은 후, 
	// 입력받은 수 만큼 학생들의 이름과 수학성적, 
	// 영어성적을 입력받는 프로그램 작성
	
	// 출력 결과
	/*
	결과 :
	등록할 인원수 : 2
	이름 : 홍길동
	수학 : 90
	영어 : 87
	-------------------------
	이름 : 독고길동
	수학 : 70
	영어 : 100
	-------------------------
	2명 등록 완료!!
	홍길동 90 87
	독고길동 70 100
	*/
	
}

