package poly.edu;


public class Calculator implements calculatorInterface {

	@Override
	public Integer sum(Integer a, Integer b) {
		return a+b;
	}
	@Override
	public Integer sub(Integer a, Integer b) {
		return a-b;
	}

}
