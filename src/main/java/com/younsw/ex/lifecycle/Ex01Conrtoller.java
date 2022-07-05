package com.younsw.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/ex01")
public class Ex01Conrtoller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "예제 1번 문자열을 response에 담는다";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> printMap() {
		// 과일 이름과 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("orange", 3000);
		map.put("banana", 1000);
		
		return map;
	}
	
	
}
