package OopPart1Java11.Inheritance;

public class FormulaOne extends Car {
    private String teamName;

    public FormulaOne(String currentDirection, double currentSpeed, String currentGear, String teamName) {
        super(currentDirection, currentSpeed, currentGear);
        this.teamName = teamName;
    }

}
