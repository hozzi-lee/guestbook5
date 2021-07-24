package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {
	
	@Autowired
	private SqlSession sqlSession; // SqlSessionFactory + OracleDataSource
	
	// addList
	public List<GuestbookVo> getList() {
		List<GuestbookVo> gList = sqlSession.selectList("guestbook.getList");
		
		return gList;
	}
	
	// insert
	public int insert(GuestbookVo guestbookVo) {
		int count = sqlSession.insert("guestbook.insert", guestbookVo);
		
		return count;
	}
	
	// delete
	public int delete(GuestbookVo guestbookVo) {
		int count = sqlSession.delete("guestbook.delete", guestbookVo);
		
		return count;
	}
	
	
	
}
