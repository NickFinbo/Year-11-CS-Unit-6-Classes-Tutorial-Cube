public class Cube {
    private int side;

    public Cube(int side) {
        if(side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = side;
        }
    }

    public Cube() {
        this.side = 1;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = side;
        }
    }

    public int getSurfaceArea() {
        return side * side * 6;
    }

    public int getVolume() {
        return (int) Math.pow(side,3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}