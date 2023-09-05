package pack.controller;

import pack.model.DataDao;

public class BusinessServiceImpl implements BusinessService {
	private DataDao dataDao; 
	
	public BusinessServiceImpl(DataDao dataDao) {
		// 생성자를 통해 DB 처리용 영역 클래스의 객체 주소를 치환 (Injection)
		this.dataDao = dataDao;
	}
	
	public BusinessServiceImpl() {
		// 파라미터가 없는 생성자를 부를 때 사용
	}
	@Override
	public void selectProcess() {
		// DB와 연결해 자료를 읽는 DataDaoImpl 클래스의 selectData 메소드 실행용
		dataDao.selectData();
	}
}
