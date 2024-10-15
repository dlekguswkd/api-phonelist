package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.uti.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
public class PhonebookController {
	
	@Autowired
	private PhonebookService phonebookService;

	// 리스트
	@GetMapping("/api/persons")
	public JsonResult getList() {
		//System.out.println("PhonebookController.getList()");
		
		List<PersonVo> personList = phonebookService.exeGetPerson();
		//System.out.println(personList);
		
		return JsonResult.success(personList);
	}
	
	
}
