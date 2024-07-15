package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
/*
		Set<Integer> iSet = new HashSet<Integer>();

		for (int i = 0; i < 6; i++) {
			Integer no = (int) (Math.random() * 45 + 1);
			iSet.add(no);

		}
		for (Integer lotto : iSet) {
			System.out.println(lotto);

		}
*/
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(true) {
			
			if(iSet.size()==6) {
				break;
			}
			
			int no = (int)(Math.random() * 45) + 1;
			
			iSet.add(no); // 박싱 : 주머니에 숫자가 들어가는게 아니라 박싱한 주소가 들어감
			System.out.print(no + "\t");
			
		}
		System.out.println();
		System.out.println();
		System.out.println("----- 최종출력 :  주머니 속 내용물 생성 순서와 관련 없이 무작위로 추출 -----");
		for(int no : iSet) {
			System.out.print(no + "\t");
		}
		
	}

}
