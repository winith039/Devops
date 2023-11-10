package myCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
        int result = calculator.add(4, 2);
        assertEquals(6, result);
	}
	void testSubt() {
		Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
	}
	void testMul() {
		Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 2);
        assertEquals(8, result);
	}
	void testDiv() {
		Calculator calculator = new Calculator();
        double result = calculator.divide(4, 2);
        assertEquals(2, result);
	}

}
