package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository  //컨트롤러에 필드에 넣은거 사용을 위해 넣어주기 저장소의 의미
public class PhonebookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//리스트 가져오기
	public List<PersonVo> getPersonList() {
		//System.out.println("PhonebookDao.getPersonList()");
		
		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");
		
		//System.out.println(personList);
		
		return personList;
		
	}
	
	
}
