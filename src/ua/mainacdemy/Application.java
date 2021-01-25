package ua.mainacdemy;


import ua.mainacdemy.model.Circle;
import ua.mainacdemy.model.Shape;
import ua.mainacdemy.model.Triangle;
import ua.mainacdemy.model.Square;

import javax.management.Query;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Circle circle1 = new Circle(41);
        Circle circle2 = new Circle(38);

        Square square1 = new Square(23);
        Square square2 = new Square(19);

        Triangle triangle1 = new Triangle(48, 28);
        Triangle triangle2 = new Triangle(34, 11);

      /*  Circle[]circles=new Circle[4];
        circle[0]=circle1;*/

        //List-java utils
        //
        //ArrayList<Circle>circles=new ArrayList<>();
        //circles.add(circle);
        //LinkedList<Circle>circles1=new LinkedList<>();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(square1);
        shapeList.add(triangle1);
        shapeList.add(circle2);
        shapeList.add(square2);
        shapeList.add(triangle2);
        shapeList.add(circle1);
        shapeList.add(circle1);
        shapeList.add(circle1);

        System.out.println("List size is " + shapeList.size());

        TreeSet<Shape> set = new TreeSet(shapeList);
        System.out.println("Maximum value of list is: " + set.last().getArea());
        System.out.println("Minimum value of list is: " + set.first().getArea());


        //System.out.println(Collections.max(shapeList.getClass().getSimpleName());
        // System.out.println(Collections.min(shapeList));




       /* Collections.sort(shapeList);
        System.out.println(shapeList.get(0));
        System.out.println(shapeList.get(shapeList.size() - 1));*/

        for (Shape shape : shapeList) {
            System.out.println("Shape has area  " + shape.getArea() + " is " + shape.getClass().getSimpleName());

            /*Collections.sort(shapeList);
            System.out.println(shapeList.get(0));
            System.out.println(shapeList.get(shapeList.size() - 1));*/

            //int minArray = Collections.min(Arrays.asList(arr));

           /* Comparable minList = Collections.min(shapeList);
             System.out.println("Minimum value of list is: "
                  + set.);*/

        }
    }
}








        //shapes.get(0).getArea();

        //Set
     /*   //   Set<Shape> shapeSet=new HashSet<>();
        Set<Shape> sortedShapeSet = new TreeSet<>();

        sortedShapeSet.add(circle1);
        sortedShapeSet.add(square1);
        sortedShapeSet.add(triangle1);
        sortedShapeSet.add(circle2);
        sortedShapeSet.add(square2);
        sortedShapeSet.add(triangle2);
        sortedShapeSet.add(circle1);
        sortedShapeSet.add(circle1);
        sortedShapeSet.add(circle1);

        System.out.println("Set size is " + sortedShapeSet.size());



        for (Shape shape : sortedShapeSet) {
            System.out.println("Shape has area " + shape.getArea() + " and is " + shape.getClass().getSimpleName());

        }
        // Queue

        Queue<Shape> shapeQueue = new PriorityQueue<>();
        shapeQueue.add(triangle1);
        shapeQueue.add(square1);
        shapeQueue.add(circle1);
        shapeQueue.add(triangle2);
        shapeQueue.add(square2);
        shapeQueue.add(circle2);

        for (Shape shape : shapeQueue) {
            System.out.println("Shape has area " + shape.getArea() + " and is " + shape.getClass().getSimpleName());
        }


        System.out.println("Queue size  is " + shapeQueue.size());
        Shape shapeFromQueue = shapeQueue.peek();//извлекает обект но не
        // убирает его из очереди, считывает обект
        System.out.println("The first shape area  is " + shapeFromQueue.getArea());
        System.out.println("Queue size  is " + shapeQueue.size());

        shapeFromQueue = shapeQueue.poll();//Извлекает обект из коллекции
        // и смещает коллекцию на одну ячейку влево
        System.out.println("The first shape area  is " + shapeFromQueue.getArea());
        System.out.println("Queue size  is " + shapeQueue.size());

        shapeFromQueue = shapeQueue.poll();//Извлекает обект из коллекции
        //shapeFromQueue = shapeQueue.peek();//извлекает обект но не
        // убирает его из очереди, считывает обект
        System.out.println("The first shape area  is " + shapeFromQueue.getArea());
        System.out.println("Queue size  is " + shapeQueue.size());

    }
}
*/
//Нашел причину почему в Set не добавлялся элемент.
// В основе HashSet лежит HashMap и элементы по
// хешкоду попадают в определенную ячейку набора.
// Поскольку хешкоды разные, то и элементы в наборе уникальные.Т
// огда как в TreeSet в основе TreeMap и элементы
// попадают по данным сортировки, в данном случае по
// значению единственного метода в интерфейсе - площадь.
// И увы, это значение не уникальное у меня


