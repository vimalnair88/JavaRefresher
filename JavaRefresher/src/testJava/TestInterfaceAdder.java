	package testJava;
	
	public class TestInterfaceAdder implements TestInterface {
	
		@Override
		public int arithmeticOperation(int op1, int op2) {
			int result=op1 + op2;
			return result;
		}
	
	}
