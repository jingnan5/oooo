package quiz;

import java.util.Scanner;



public class paper {	
	public static void main(String[] args) throws Exception {
		Ti1 myTi1 = new Ti1();
		myTi1.newOne();
//		Ti2 myTi2 = new Ti2(); Ti2 extends
		System.out.println("Congratulations! I think you are ready for the final!");
		System.out.println("Do you want to print your result as a pdf? If yes, type 1.");
		 Scanner a = new Scanner(System.in);
		 int res = a.nextInt();
		 if (res == 1) {
		printPdf("C:");	  
		 }
	}
	public static boolean printPdf(String pdfPath){  
        try{  
            Runtime.getRuntime().exec("cmd.exe /C start acrord32 /P /h " + pdfPath);  
            return true;  
        }catch(Exception e){  
            e.printStackTrace();  
            return false;  
        }  
    }  
	
}

