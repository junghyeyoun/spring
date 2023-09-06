package pack.controller;

import java.util.List;


public interface BusinessInter {
	List<JikwonDto>selectDataAll();
	void dataShow();
	List<JikwonDto>selectInwon();
	void dataShow2();
	List<JikwonDto>selectBuser();
	void dataShow3();
}