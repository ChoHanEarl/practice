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



