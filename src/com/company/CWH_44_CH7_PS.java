package com.company;
class Cylinder{
    private float radius;
    private float height;
//    Cylinder(float radius, float height){
//        this.radius = radius;
//        this.height = height;
//    }

    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return this.radius;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getHeight(){
        return this.height;
    }
    public float surfaceOfCylinder(){
        return 2*3.14f*(this.radius)*(this.height);
    }
    public float volumeOfCylinder(){
        return 3.14f*this.radius*this.radius*this.height;
    }
}
public class CWH_44_CH7_PS {
    //https://www.codewithharry.com/videos/java-tutorials-for-beginners-44
//    create a class cylinder and use getter and setters to set its radius and height
//            use ➊ to calculate surface and volume of the cylinder
//    Use a constructor and repeat ➊
//    Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
//    Repeat ➊ for a sphere
    //video 45 :
    //create a class animal and derive another class dog from it

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(12.5f);
        c.setRadius(3.0f);
        System.out.println(c.surfaceOfCylinder());
        System.out.println(c.volumeOfCylinder());
    }

}
