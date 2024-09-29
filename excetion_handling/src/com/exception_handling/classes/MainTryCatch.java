package com.exception_handling.classes;

public class MainTryCatch {

	public static void main(String[] args) {
		MainException main =null;
		try {
			main.setMessage("Hello"); //null pointer exception
			
		}
        catch(NullPointerException ex) {
		System.out.println(ex);	
		}
		catch (RuntimeException ex) {
			
			System.out.println(ex.getMessage());
		}
		
		
	}
}
