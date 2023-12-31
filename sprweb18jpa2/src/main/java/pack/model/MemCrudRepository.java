package pack.model;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemCrudRepository extends JpaRepository<MemDto, Integer>{
	// num 자동 증가 처리를 할 경우 아래처럼 코드를 작성
//	@Query(value="select max(p.num) from MemDto as p")
//	
//	
//	@Query(value="select max(num) from mem", nativeQuery = true)
//	int findByMaxNum();
	
	@Query(value = "select m from Memdto as m where m.num=?1")
	MemDto findByNum(String num);
	
}
