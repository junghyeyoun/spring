package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import pack.controller.BoardBean;

@Mapper
public interface DataMappingInterface {
	// 추상메소드 이름은 mapper.xml의 id 명과 일치시킨다.
	
	List<Board> selectList();
	List<Board> selectSearch(BoardBean bean);
	
	Board selectOne(String num);
	
	int insert(BoardBean bean);
	void updateReadcnt(String num);
	
	int update(BoardBean bean);
	int delete(String num);
}
