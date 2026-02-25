package vinaya_day12;
import java.io.File;
public class DeleteFH {
	public static void main(String[] args) {
		File f=new File("");
		if(f.delete()) {
			System.out.println("File deleted successfully.");
		}
		else {
			System.out.println("File not found");
		}
	}
}