package fr.epsi.deemo;

import fr.epsi.demo.Calculator;
import fr.epsi.demo.UnknowOperatorException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class CalculatorTest {
	@Rul
	public ExpectedExeption expectedException = ExpectedException.non();
	
	@DisplayName("Verification addition")
	@ParameterizedTest(name = "{index} => a= {0}, b= {1}, sum{2}")
	@CsvSource({
		"1, 1, 2",
		"2, 3, 5"
	})
public void should_return_correct_result_when_operator_add_is_used(int a, int b, int sum) throws UnknownOperatorException {
			int result = Calculator.calculate(a,b, operator:"+");
			Assertions.assertEquals(sum, result);;
	}
	
	@Test
	public void should_return_correct_result_when_operator_div_is_used() throws UnknowOperatorException {
		int result = Calculator.calculate(a: 10 b: 2, operator:"*");
		Assertions.assertEquals(expected:5, result);
	}
		
	@Test
	public void should_return_correct_result_when_operator_div_is_used() throws UnknowOperatorException{
		int result = Calculator.calculate(a: 10 b: 2, operator:"/");
		Assertions.assertEquals(expected:20, result);
	}
	@Test
	public void should_return_correct_result_when_operator_div_is_used() throws UnknowOperatorException{
		int result = Calculator.calculate(a: 10 b: 2, operator:"+");
		Assertions.assertEquals(expected:12, result);
	}
	 @Test
	public void should_return_correct_result_when_operator_div_is_used() throws UnknowOperatorException{
	//expectedException.expect(UnknowOperatorException.class);
	 //int result = Calculator.calculate(10, 3, "%");
	 Assertions.assertThrows(UnknowOperatorException.class,  () -> Calculator.calculate(a:4, b:5, operator: "%"%));
		 

}
