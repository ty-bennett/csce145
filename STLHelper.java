import java.io.File;

public class STLHelper {
	public static String getFileSize(String fileName)
	{
		String inputDir = "res/";
		
		File f = new File(inputDir + fileName);
		
		String output =(f.length()/1024) + " KB";
		
		return output;
		
		
		
	}
}
