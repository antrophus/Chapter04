package com.javaex.ex06;

import java.util.LinkedList;
import java.util.List;

public class CircleApp {

	public static void main(String[] args) {
		//원을 어레이리스트로 관리
		// 원 3개 만든다.
		// 반지름 5, 15, 100
		// 리스트에 추가한다.
		// toString()으로 전체 출력해본다.
		// 갯수 출력해본다.
		// 반지름 15을 삭제한다.
		// toString()으로 전체 출력해본다.
		// 갯수 출력해본다.
		// for문으로 반지름을 출력한다.
		// 출력형식
		// 반지름: 5
		// 반지름: 15
		// 반지름: 100
		
		List<Circle> cList = new LinkedList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(15);
		Circle c03 = new Circle(100);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		// toString()으로 전체 출력해본다.
		System.out.println(" =toString()으로 전체 출력해본다.= ");
		System.out.println(cList);
		System.out.println();
		// 갯수 출력해본다.
		System.out.println(" =갯수 출력해본다.= ");
		System.out.println(cList.size()+" 개");
		System.out.println();
		// 반지름 15을 삭제한다.
		cList.remove(1);
		System.out.println(" =반지름 15을 삭제한다.= ");
		System.out.println(cList);
		System.out.println();
		//for문으로 반지름을 출력한다.
		System.out.println(" =for문으로 반지름을 출력한다.= ");
		for(int i = 0; i<cList.size(); i++) {
			System.out.println("반지름: " + cList.get(i).getRadius());
		}

	}

}
