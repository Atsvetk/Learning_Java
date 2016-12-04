public class Circle {
    double x;
    double y;
    double r;

    public Circle(double r) {
        if(r <= 0) {
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        if(r <= 0) {
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void zoom(double rx) {
        this.r += rx;
        if (this.r + rx <= 0) {
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.r += rx;
    }

    public void zoomX(double rX) {
        if (rX <= 0) {
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.r *= rX;
    }

    public boolean isInCircle(double x0, double y0){
        if (Math.pow(this.x - x0, 2) + Math.pow(this.y - y0, 2) <= Math.pow(this.r, 2)){
            return true;
        } else {
            return false;
        }
    }

    public double length(){
        return 2 * Math.PI * this.r;
    }

    public double square(){
        return Math.PI * this.r * this.r;
    }

    public double diameter(){
        return this.r * 2;
    }

    @Override
    public String toString(){
        return "x = " + this.x + "; y = " + this.y + "; r = " + this.r;
    }

}
