package in.sbp.showmessages.mainclasses;
import in.sbp.showmessages.interfaces.*;
public class MainShowMessages {
	public static void main(String[] args) {
		ShowMessage message = 
				(str)-> {
					System.out.println(str);
					
					
				};
				message.displayMessage("print");
				
	}

}
