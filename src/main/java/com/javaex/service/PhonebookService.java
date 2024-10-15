package com.javaex.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.PersonVo;

@Service
public class PhonebookService {
	
	@Autowired
	private PhonebookDao phonebookDao;
	
	/* 전화번호 전체 가져오기 */
	public List<PersonVo> exeGetPerson() {
		//System.out.println("PhonebookService.exeGetPerson()");
		
		List<PersonVo> personList = phonebookDao.getPersonList();
		
		return personList;
		
	}
	
	
}
