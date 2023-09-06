package pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.resource.SqlMapConfig;
import pack.resource.SqlMapperInter;

@Service
public class BusinessImpl implements BusinessInter {
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();

	@Autowired
	private BusinessInter businessInter;

	@Override
	public void dataShow() {
		ArrayList<JikwonDto> list = (ArrayList<JikwonDto>) businessInter.selectDataAll();

		for (JikwonDto s : list) {
			System.out.println(s.getJikwon_no()+" " + s.getJikwon_name() +" " +s.getBuser_name() + " " +s.getIb());
		}
	}

	@Override
	public List<JikwonDto> selectDataAll() {
		SqlSession sqlSession = factory.openSession();
		List<JikwonDto> list = null;
		try {
			SqlMapperInter inter = (SqlMapperInter) sqlSession.getMapper(SqlMapperInter.class);
			list = inter.selectDataAll();
		} catch (Exception e) {
			System.out.println("selectDataAll err : " + e.getMessage());
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return list;

	}
	
	@Override
	public void dataShow2() {
		ArrayList<JikwonDto> list = (ArrayList<JikwonDto>) businessInter.selectInwon();

		for (JikwonDto s : list) {
			System.out.println(s.getBuser_name()+" " + s.getInwon());
		}
	}
	
	@Override
	public List<JikwonDto> selectInwon() {
		SqlSession sqlSession = factory.openSession();
		List<JikwonDto> list = null;
		try {
			SqlMapperInter inter = (SqlMapperInter) sqlSession.getMapper(SqlMapperInter.class);
			list = inter.selectInwon();
		} catch (Exception e) {
			System.out.println("selectInwon err : " + e.getMessage());
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return list;
	}
	
	@Override
	public void dataShow3() {
		ArrayList<JikwonDto> list = (ArrayList<JikwonDto>) businessInter.selectBuser();

		for (JikwonDto s : list) {
			System.out.println(s.getBuser_name()+" " + s.getJikwon_name()+" "+ s.getJikwon_pay());
		}
	}
	
	@Override
	public List<JikwonDto> selectBuser() {
		SqlSession sqlSession = factory.openSession();
		List<JikwonDto> list = null;
		try {
			SqlMapperInter inter = (SqlMapperInter) sqlSession.getMapper(SqlMapperInter.class);
			list = inter.selectBuser();
		} catch (Exception e) {
			System.out.println("selectBuser err : " + e.getMessage());
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return list;
	}
}
