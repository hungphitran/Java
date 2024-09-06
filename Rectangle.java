public class Rectangle {
    private double width;
    private double length;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.length* this.width;
    }

    public double getPerimeter(){
        return 2*(this.length+this.width);
    }


}
