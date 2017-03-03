import java.io.IOException;

public class Call_MORL_Glue 
{
	static Runtime rt = Runtime.getRuntime();
	
	
	//used in MORL_Glue_Driver.java
	public static void runMorlGlue()
	{
		try {
			rt.exec("G:\\Users\\Tanya\\workspace\\GuidedStudy\\MO586rl_glue.exe");//local path
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

