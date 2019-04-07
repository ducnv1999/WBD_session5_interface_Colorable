package com.code.gym;

public class colorabletest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(2.3,4.3);
        shapes[2] = new Square(5.0,"orange",true);
        //Colorable and Show Arrays
        System.out.println("Arrays Shape:");
        for (Shape shape:shapes){
            if (shape instanceof Square){
                System.out.print(shape + ", And ");
                ((Square) shape).howtocolor();
            }else {
                System.out.println(shape);
            }
        }
    }
}
