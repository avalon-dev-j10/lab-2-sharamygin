package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.PI;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    private final float x;
    private final float y ;
    private final float r;
    private final int rotation;
    
    
    public Circle(){
        x = (float) (0.5*Math.random()); // ввел коэффициент 0,5, потому что без него 
        y = (float) (0.5*Math.random()); // почти всегда площадь круга была больше
        r = (float) (0.5*Math.random()); // остальных фигур, что мне не понравилось
        rotation = (int) (360*Math.random());
    }
    
    @Override
    public float getX(){
        return x;
    }
    
    @Override
    public float getY(){
        return y;
    }
    
    
    @Override
    public float getLength(){
        return (float) (2*PI*r);
    }
    
    
    @Override
    public float getArea(){
        return (float) (PI*r*r);
    }
    
    @Override
    public int getRotation(){
        return rotation;
    }
    
    @Override
    public String toString(){
        return "|Circle (length " + getLength() + " m)| ";
}
    
}
