package quiz;
import java.util.Scanner;

public class Ti1 {
	private static int count = 0;
	private static int warning = 0;
	private int myAns;
	private int ans;
	private int diff;
	private int data1;
	private int data2;
	private static String myStri= "the Ti%d%d";
  public void newOne() throws Exception{
	 Scanner p = new Scanner(System.in);
	 System.out.printf(myStri, data1, data2);
	 myAns = p.nextInt();
	 if (ifRight(myAns)) {
		 System.out.println("Yes! You got it!");
		 return;
	 }
	 System.out.println("Ohh... That's not right. Please try another one");
	 Ti1 mt = new Ti1();
	 mt.newOne();
  }
  public boolean ifRight(int a) {
	  if((a < diff + ans )&& (a > ans - diff)) {
		  return true;
	  }
	  return false;
  }
  public Ti1() throws Exception {
	  warning ++;
	  if (warning > 10 ) {
		  System.out.println("Go back and read your books!");
		  throw new Exception("Got wrong for 10 times! Really?");
	  }
	  ans = mylist[count][0];
	  diff = mylist[count][1];
	  data1 = mylist[count][2];
	  data2 = mylist[count][3];
	  count ++;
	  if (count == mylist.length) {
		  count = 0;
	  }
	int  a = 1;
  }
  private static int[][] mylist = {
		  {1,2,3,5},
		  {2,3,4,6},
		  {3,4,5,7}
  }; 
}

