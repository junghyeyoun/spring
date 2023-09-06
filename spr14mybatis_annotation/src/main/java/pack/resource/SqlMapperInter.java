package pack.resource;

import java.util.List;

import org.apache.ibatis.annotations.Select;


import pack.controller.JikwonDto;


public interface SqlMapperInter {
	@Select("select jikwon_no, jikwon_name, buser_name, substring(jikwon_ibsail,1,4) as ib from jikwon left outer join buser on buser_num = buser_no")
	List<JikwonDto> selectDataAll();
	
	@Select("select buser_name, count(*) as inwon from jikwon left outer join buser on buser_num = buser_no group by buser_name")
	List<JikwonDto> selectInwon();
	
	@Select("select ifnull((select buser_name from buser where buser_num=buser_no),'무소속') as buser_name, jikwon_name, jikwon_pay from jikwon a where a.jikwon_pay=(select max(b.jikwon_pay) from jikwon b where a.buser_num=b.buser_num) order by buser_num")
	List<JikwonDto> selectBuser();
	
}
