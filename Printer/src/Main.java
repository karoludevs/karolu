/**
 * Created by sam on 2/05/16.
 */
public class Main {

    public static void main(String[] args){

        Printer hp = new Printer(80, 115, true);
        hp.print(120);
        hp.getNumPagePrinted();
        hp.getTonerLevel();
		
    }
}
