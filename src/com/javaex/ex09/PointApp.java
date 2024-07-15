package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		//메모리 올리기 <key, value>(키를 어떤 자료형으로 쓸지 알려줘야함. Generic 두개 정해야 함)
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		//포인트 생성
		Point p01 = new Point(2, 4);
		Point p02 = new Point(2, 4);
		Point p03 = new Point(43, 78);
		
		//생성된 포인트를 꾸러미에 넣기
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println("몇개? "+ pMap.size()+"개");
		System.out.println(pMap.toString());
		
		//키가 "박명수"인 자료의 값
		System.out.println("키가 \"박명수\"인 자료의 값");
		System.out.println(pMap.get("박명수").toString());
		System.out.println("키가 \"박명수\"인 자료의 X 값");
		System.out.println(pMap.get("박명수").getX());
		System.out.println("================================");
		
		//새로 생성한 value를 기존에 존재하는 키에 넣으면 기존 값이 새 값으로 변경됨(수정)
		System.out.println("키가 \"박명수\"인 자료에 새로운 값을 입력하면, ");
		Point p04 = new Point(100,100);
		pMap.put("박명수", p04);
		System.out.println("Point p04 = new Point(100,100);");
		System.out.println("pMap.put(\"박명수\", p04);");
		System.out.println(pMap.get("박명수"));
		System.out.println("기존 값은 사라지고 새로 입력된 값이 덮어쓰기 된다.(수정 기능) ");
		System.out.println("================================");
		
		//키값은 keySet()으로 관리된다.
		Set<String> keys = pMap.keySet();
		
		for(String key : keys) {//향상된 for문
			System.out.print("키의 이름: ");
			System.out.println(key);
			System.out.print("키의 value : ");
			System.out.println(pMap.get(key).toString());
			System.out.print("키의 value의 일부분 추출. 여기서는 X 값: ");
			System.out.println(pMap.get(key).getX());
			System.out.println("--------------------------------------");
			
		}
		System.out.println("================================");
		
		//map 섞어쓰기 예시
		Map<String, String> guestbookMap = new HashMap<String, String>();
		guestbookMap.put("date", "2024-07-12");
		guestbookMap.put("userName", "정우성");
		guestbookMap.put("pw", "1234");
		guestbookMap.put("contents", "왔다갑니다.");
		
		System.out.println(guestbookMap.get("userName"));
		System.out.println(guestbookMap.get("contents"));
		
		
		
		

	}

}
