package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DataMapperInterface {
	@Select("select * from sangdata")
	List<SangpumDto> selectAll();
	
	// MariaDb, MySQL 인 경우 :  where sang like concat('%',#{svalue},'%')
	// Oracle 인 경우 :  where sang like '%'||#{svalue}||'%'
	@Select("select * from sangdata where sang like concat('%',#{svalue},'%')")
	List<SangpumDto> selectSearch(String svalue);
}
