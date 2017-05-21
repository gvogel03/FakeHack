import java.util.concurrent.TimeUnit;

public class LegitHack{
    public static void main(String[]args){
        for(int i = 0; i < 40; i ++){
            for(int j = 0; j < 70; j ++){
		int r = (int)(Math.random() * 2) + 1;
                if(r == 1){
		    System.out.print("| /");
		}
                else{
		    System.out.print("   ");
                }
	    }
	    System.out.println("");
	    try {
		TimeUnit.MILLISECONDS.sleep(100);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
        }
        for(int q = 0; q < 10; q++){
	    System.out.println("Loading...");
	    try {
		TimeUnit.MILLISECONDS.sleep(100);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
        }
        System.out.println();
        System.out.println();
        System.out.println("Yuore In The Mainframe");
    }
}








