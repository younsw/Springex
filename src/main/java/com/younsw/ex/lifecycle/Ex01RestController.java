package com.younsw.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.younsw.ex.lifecycle.model.person;

//@Controller
@RestController // controller + responseBody
@RequestMapping("/lifecycle/ex01")
public class Ex01RestController {
	
	@RequestMapping("lifecycle/ex01/3")
	public String printString() {
		return "RestController 테스트";
	}
	
	@RequestMapping("/4")
	public person printObject() {
		person person = new person();
//		person.setName("연상원");
//		person.setAge(19);
		
		return person;
	}
	
//	@RequestMapping("/5")
	
//	public ResponseEntity<person> entity() {
		person person = new person();
//		person.setName("연상원");
//		person.setAge(19);
		
		// 데이터를 전달 할때 response의 status 코드를 추가로 전달 
		// 정상 status 코드 : 200 OK
		ResponseEntity<person> enity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR); 
//	}

}
