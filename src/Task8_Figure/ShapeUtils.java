package Task8_Figure;

 class   ShapeUtils {

     static void validateFigure(Object f) {
        if(f instanceof Triangle){
            System.out.println("это треугольник \n");
        }
        if(f instanceof Rectangle){
            System.out.println("это прямоугольник \n");
        }
        if(f instanceof Square){
            System.out.println("это квадрат \n");
        }
        if(f instanceof Circle){
            System.out.println("это окружность \n");
        }

         if( f instanceof Figure.InCircle){
            System.out.println();
        }
    }
   // public static void validateFigure(Figure f) {};



}