package standin;

public class VerifyNum implements StrategyVerification {
	@Override
	public boolean Verify(String Num)
	{
		for (int i=0;i<Num.length();i++) {
			if (Character.isDigit(Num.charAt(i)));
			else {
				System.out.println("Please only insert numbers.");
				return false;
				}	
										 }
		return true;
	}
}
