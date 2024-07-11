package com.javaex.ex01;

public class PointList {
	
	//필드
	private Point[] pArray;
	private int crtPos;
	
	//생성자
	public PointList() {
		//메모리 올리고
		pArray = new Point[3];
		crtPos = 0;
	}
	
	//메소드 gs
	
	//메소드 일반
	
	public void add(Point point){
//		현재 배열 몇개?
//		현재 배열 +1 (새로만들고)
//		이전 배열 --> 현재 배열 이동
//		현재 배열 마지막에 point 추가
		this.pArray[crtPos] = point;
		crtPos++;
		
	}
	
	public Point get(int index){
		return pArray[index];
	}
	
	public int size() {
		return crtPos;
	}

}
