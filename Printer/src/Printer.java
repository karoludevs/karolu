/**
 * Created by sam on 2/05/16.
 */
public class Printer {

    private int tonerLevel;
    private int numPagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numPagePrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.numPagePrinted = numPagePrinted;
        this.duplex = duplex;
    }

    public void print(int pageToPrint) {
        this.numPagePrinted += pageToPrint;
        System.out.println("Has been printed in total " + numPagePrinted);
        for (int i = 100; i <= 1000; i+=100)
        if (this.numPagePrinted >= i && this.numPagePrinted <= 100+i) {
            int porciento = 100 - (this.numPagePrinted/10);
            System.out.println("Toner al " + porciento + "%");
            setTonerLevel(porciento);
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumPagePrinted() {
        return numPagePrinted;
    }

    public void setNumPagePrinted(int numPagePrinted) {
        this.numPagePrinted = numPagePrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
