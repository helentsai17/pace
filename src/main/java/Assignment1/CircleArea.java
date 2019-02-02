package Assignment1;

public class CircleArea {
    public static void main(String[] args) {
        float r;
        float pi;
        float area;

        r = 4;
        pi = 3.1425f;

        area = (float) (pi * Math.pow(r, 2));

        System.out.println("the area is: "+area);

    }
}
