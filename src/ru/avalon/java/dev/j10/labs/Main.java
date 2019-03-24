package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = (Shape) new Circle();
        shapes[1] = (Shape) new Circle();
        shapes[2] = (Shape) new Circle();
        shapes[3] = (Shape) new Rectangle();
        shapes[4] = (Shape) new Rectangle();
        shapes[5] = (Shape) new Rectangle();
        shapes[6] = (Shape) new Rectangle();
        shapes[7] = (Shape) new Triangle();
        shapes[8] = (Shape) new Triangle();
        shapes[9] = (Shape) new Triangle();

        Shape max = null;
        
        for(int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i] + "|Area " + shapes[i].getArea() + " m2|"); 
            if(max != null){          
                if(shapes[i].getArea() > max.getArea()){
                    max = shapes[i];
                }
            }
                else {
                    max = shapes[i];
                }
        }
            
        System.out.println("\n" + "Max area for figure " + max + "is " + max.getArea() + " m2"); 

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */ 
    }
}
