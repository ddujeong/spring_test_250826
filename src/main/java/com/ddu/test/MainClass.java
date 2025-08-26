package com.ddu.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mycalculator mycalculator = new Mycalculator();
		//Calculator calculator = new Calculator();
		//mycalculator.setA(10);
		//mycalculator.setB(5);
		
		//mycalculator.setCalculator(calculator); // 멤버변수(멤버 객체)인 calculator를 외부에서 객체를 생성하며 초가화 -> DI
		
		//mycalculator.addition();
		
		//Mycalculator mycalculator2 = new Mycalculator(calculator);
		//mycalculator2.division();
		
		String configLocation1 = "classpath:applicationCTX.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		// Spring Container인 application.xml(설정 파일)을 로드해라(불러와라)
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,configLocation2);
		// ctx 라는 이름으로 컨테이너 생성
		
		Mycalculator mycalculator = ctx.getBean("mycalculator", Mycalculator.class);
		// 스프링 컨테이너(application.xml)에서 객체를 가져옴 -> DI 를  클래스로 받아옴
		
		mycalculator.addition();
		
		
//	StudentInfo studentInfo = new StudentInfo();
//	StudentDto studentDto = new StudentDto();
//	studentDto.setName("홍길동");
//	studentDto.setAge(17);
//	studentDto.setGradeNum("4학년");
//	studentDto.setClassNum("5반");
//	
//	
//	
//	StudentDto studentDto2 = new StudentDto();
//	studentDto.setName("이순신");
//	studentDto.setAge(20);
//	studentDto.setGradeNum("3학년");
//	studentDto.setClassNum("7반");
//	
//	studentInfo.setStudentDto(studentDto);
//	studentInfo.printStudentInfo();
//	
//	StudentInfo studentInfo2 = new StudentInfo(studentDto2);
//	studentInfo2.printStudentInfo();
	
	StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
	
	StudentInfo studentInfo2 = ctx.getBean("studentInfo2", StudentInfo.class);
	
	studentInfo.printStudentInfo();
	
	studentInfo2.printStudentInfo();
		
		
	}

}
