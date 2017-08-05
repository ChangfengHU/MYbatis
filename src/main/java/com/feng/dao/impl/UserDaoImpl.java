package com.feng.dao.impl;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements com.feng.dao.UserDao {
	
	private SqlSession sqlSession;
	
	public UserDaoImpl(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}

	@Override
	public com.feng.domain.User queryUserById(Long id) {
		return this.sqlSession.selectOne("UserMapper.queryUserById", id);
	}

	@Override
	public List<com.feng.domain.User> queryUserAll() {
		return this.sqlSession.selectList("UserMapper.queryUserAll");
	}

	@Override
	public void insertUser(com.feng.domain.User user) {
		this.sqlSession.insert("UserMapper.insertUser", user);
		this.sqlSession.commit();
	}

	@Override
	public void updateUser(com.feng.domain.User user) {
		this.sqlSession.update("UserMapper.updateUser", user);
		this.sqlSession.commit();
	}

	@Override
	public void deleteUserById(Long id) {
		this.sqlSession.delete("UserMapper.deleteUserById", id);
		this.sqlSession.commit();
	}

}
