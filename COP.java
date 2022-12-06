import java.io.*;

class COP{

	public static void main(String[]args)throws IOException{
		FileInputStream fis = null;
		FileOutputStream fos = null;

	
	try {
		fis = new FileInputStream("C:\\Users\\kaila\\Desktop\\Adobe\\exam\\s1.txt");
		fos = new FileOutputStream("C:\\Users\\kaila\\Desktop\\Adobe\\exam\\s2.txt");
	
	int c;
	System.out.println("file copied");
	while((c = fis.read()) != -1){
		fos.write(c);
	}
}
	finally{
		if(fis != null){
			fis.close();
		}
		if(fos != null){
			fos.close();
		}
	}

}
}