package com.javaex.practice99;

import java.util.ArrayList;
import java.util.List;

public class RactangleApp {

	public static void main(String[] args) {
		//사각형을 어레이리스트로 관리
		// 사각형 4개 만든다.
		// 가로-세로 
		// 리스트에 추가한다.
		// toString()으로 전체 출력해본다.
		// 갯수 출력해본다.
		// 넓이 15을 삭제한다.
		// toString()으로 전체 출력해본다.
		// 갯수 출력해본다.
		// for문으로 가로 세로를 출력한다.
		
		//사각형을 어레이리스트로 관리
		List<Ractangle> rList = new ArrayList();
		
		// 사각형 4개 만든다.
		// 가로-세로
		Ractangle r01 = new Ractangle(3, 4);
		Ractangle r02 = new Ractangle(10, 20);
		Ractangle r03 = new Ractangle(5, 3);
		Ractangle r04 = new Ractangle(7, 8);
		
		// 리스트에 추가한다.
		rList.add(r01);
		rList.add(r02);
		rList.add(r03);
		rList.add(r04);
		
		// toString()으로 전체 출력해본다.
		System.out.println("== toString()으로 전체 출력해본다. ==");
		System.out.println(rList.toString());
		
		// 갯수 출력해본다.
		System.out.println("== 갯수 출력해본다. ==");
		System.out.println("갯수: " + rList.size() + " 개");
		
		// 넓이 15을 삭제한다.
		System.out.println();
		System.out.println("== 넓이 15을 삭제한다. ==");
		int area = 0;
		for(int i = 0; i<rList.size(); i++) {
			
			area = rList.get(i).getWidth()*rList.get(i).getHeight();
			
			if(area == 15) {
				rList.remove(i);
			}
		}
		// toString()으로 전체 출력해본다.
		System.out.println("== toString()으로 전체 출력해본다.(넓이 15인 방이 삭제 되었는지 확인) ==");
		System.out.println(rList.toString());
		// 갯수 출력해본다.
		System.out.println("== 삭제 되었는지 갯수 확인 ==");
		System.out.println("갯수: " + rList.size() + " 개");
		
		// for문으로 가로 세로를 출력한다.
		System.out.println("== for문으로 가로 세로를 출력한다. ==");
		for(int i =0; i<rList.size(); i++) {
			System.out.println("["+ i + "]"+ " 방: " + "가로: " + rList.get(i).getWidth() + ", 세로: " + rList.get(i).getHeight()+"\n");
		}
		
		
		

	}

}
