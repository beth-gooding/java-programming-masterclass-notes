package OopPart1Java11.Inheritance;

public class FormulaOne extends Car {
    private String teamName;

    public FormulaOne(String steering, double moving, String gear, String teamName) {
        super(steering, moving, gear);
        this.teamName = teamName;
    }

}
