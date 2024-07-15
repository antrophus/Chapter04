package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(3);
		Integer i02 = 6; // 자동 박싱이 됨 " =new Integer(6); "과 같음 : int i = new Integer(3); //자동 언박싱이 됨 " int i = 3 " 과 같음
		Integer i03 = new Integer(9);
		
		//꾸러미에 넣기
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		//몇개 들어있는지 확인
		iSet.size();
		System.out.println(iSet.size());
		
		//들어있는게 뭐인지 확인
		System.out.println(iSet.toString());
		
		//for문으로 안의 내용을 확인해보자
		/*
		for(int i = 0; i<iSet.size(); i++)
			// i 를  방번호(index)로 사용 - 기존 활용방법
			  Set은 방번호가 없이 무작위로 꾸러미에 넣었기에 위 방법을 사용 할 수 없다. : 향상된 for문 사용
			  => 1. for문 우변에 전체꾸러미를 넣는다.
			  	 2. 좌변에 주소를 받을 자료형과 변수를 넣는다.
		 */
		for(Integer no : iSet) {
			System.out.println(no.toString());
			
		}

	}

}
