package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		//메모리 올리기
		Set<Point> pSet = new HashSet<Point>();
		
		//포인트 생성
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(1,2);
		
		/*
		boolean test = p01.equals(p03);
		System.out.println(test);
		*/
		
		//포인트를 꾸러미에 담기
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		//출력해보기(향상된 for문) : 각각의 x좌표만 출력
		for(Point point : pSet) {
			System.out.println(point + "\t x 좌표: " + point.getX());
			System.out.println(point.hashCode());
		}

	}

}
