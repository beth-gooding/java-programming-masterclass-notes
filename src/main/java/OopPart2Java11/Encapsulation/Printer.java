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
            this.tonerLevel = 100;
        }
    }

    public void printPage(int numberOfPages) {
        this.numberPagesPrinted += numberOfPages;
        System.out.println("Just printed " + numberOfPages + " pages. Printed " + numberPagesPrinted + " in total.");
    }

    public void isDuplex() {
        if (isDuplex) {
            System.out.println("This printer is a duplex");
        } else {
            System.out.println("This printer is not a duplex");
        }
    }
}
