package pack.model;


public class Gugudan implements CalcInter{
	@Override
	public int[] numberCalc(int su) {
		int[] cal = new int[9];
		
		for(int i=0;i<9;i++) {
			cal[i] = su *(1+i);
		}
		return cal;
	}
}
