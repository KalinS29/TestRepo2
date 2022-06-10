import javax.xml.validation.TypeInfoProvider;

public class Main {
    public static int surfaceAndPerimeter(int a, int b){
        int surface = (a*b)/2;
        int Perimeter = (a+b)*2;
        return surface & Perimeter;

    }
    public static void main(String[] args) {
        int surfaceandP = surfaceAndPerimeter(5,2);
        System.out.println(surfaceandP);

    }
}