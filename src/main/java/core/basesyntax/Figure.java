package core.basesyntax;

public class Figure implements AreaCalculator, FigureInformation {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String draw() {
        return null;
    }

    @Override
    public String drawDefault() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}