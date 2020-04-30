import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double r = 0;
        int operationChoose;
        Shape rectangle = new Rectangle(a,b);
        Shape circle = new Circle(r);
        System.out.println("Co chcesz obliczyc: ");
        System.out.println("1.Pole Prostokata" );
        System.out.println("2.Pole Kola" );
        System.out.println("3.Obwod Prostokata" );
        System.out.println("4.Obwod Kola: " );

        operationChoose=in.nextInt();

        if(operationChoose==1 || operationChoose==3){
            a=in.nextDouble();
            ((Rectangle)rectangle).setA(a);
            b=in.nextDouble();
            ((Rectangle)rectangle).setB(b);
        }else
            r=in.nextDouble();
            ((Circle)circle).setR(r);

        switch (operationChoose){
            case 1:
                System.out.println(rectangle.CalculateArea());
                break;
            case 2:
                System.out.println(  circle.CalculateArea());
                break;
            case 3:
                System.out.println(rectangle.CalculatePerimeter());
                break;
            case 4:
                System.out.println(circle.CalculatePerimeter());
                break;

        }


    }
}
