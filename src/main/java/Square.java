public class Square extends Rectangle{
    protected double side = 1.0;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        super.color = color;
        super.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side){

    }

    @Override
    public void setLength(double side){

    }

    @Override
    public String toString(String color, boolean filled) {
        return "Square[Rectangle[Shape[color=?, filled=?], width=?, length=?]]";
    }
}
