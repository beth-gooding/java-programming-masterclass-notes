package OopPart2Java11.Encapsulation;

public class Printer {
    private int tonerLevel;
    private int numberPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberPagesPrinted, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        } else if (tonerLevel >= 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = 0;
        }

        this.numberPagesPrinted = numberPagesPrinted;
        this.isDuplex = isDuplex;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public void fillToner(int fillAmount) {
        int newTonerLevel = this.tonerLevel + fillAmount;
        if (newTonerLevel >= 0 && newTonerLevel < 100) {
            this.tonerLevel = newTonerLevel;
        } else {
            System.out.println("This is too much toner. It will overflow, toner has not been added");
        }
    }

    public void printPage(int numberOfPages) {
        int pagesToPrint = numberOfPages;
        if (this.isDuplex) {
            pagesToPrint = ((numberOfPages / 2) + (numberOfPages % 2));
            System.out.println("This printer is a duplex");
        }
        this.numberPagesPrinted += pagesToPrint;
        System.out.println("Just printed " + pagesToPrint + " pages. Printed " + numberPagesPrinted + " in total.");
    }
}
