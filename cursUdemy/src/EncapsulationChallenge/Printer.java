package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public int fillTonerLevel(int toner){
        if(toner > 0 && toner <= 100){
            if(toner + this.tonerLevel > 100){
                return -1;
            }
            this.tonerLevel += toner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing on both sides");
        }
        this.numberOfPages += pagesToPrint;
        return pagesToPrint;
    }
}
