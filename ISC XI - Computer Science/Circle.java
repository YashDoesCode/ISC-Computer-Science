import java.util.Scanner;

public class Circle extends Plane {
    int x2,y2;
    double radius=0.00D,area=0.00D;
    
    Circle(int nx1,int ny1,int nx2,int ny2,double rad,double ar){
        super(nx1,ny1);
        x2=nx2;
        y2=ny2;
        radius=rad;
        area=ar;
    }
    void Radius(){
        radius = Math.sqrt((Math.pow((x2-x1),2)-Math.pow((y2-y1),2)));
    }
    void findArea(){
        area = Math.PI*Math.pow(radius,2);
    }
    void show(){
        System.out.println("X2-Coordinate : "+x2+"\nY2-Coordinate : "+y2);
    }
}