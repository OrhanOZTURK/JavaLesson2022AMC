/*-----------------------------------------------------
  	FILE		: Circle.java
  	AUTHOR		: Orhan OZTURK
  	LAST UPDATE : 28.05.2023

  	Circle class that represents a circle


  	Copyleft(c) 1992 by Orhan ÖZTÜRK All Rights Free

 -----------------------------------------------------*/
package com.orhn.math.geometry;

public class Circle {
    private  double m_r;
    //private double m_area, m_circumference;

    public Circle()
    {}

    public Circle(double r)
    {
        setRadius(r);
    }

    public double getRadius()
    {
        return m_r;
    }

    public void setRadius(double r)
    {
        m_r = Math.abs(r);
       // calculateArea();
       // calculateCircumference();
    }

    /*private void calculateArea()
    {
        m_area = Math.PI * m_r * m_r;
    }*/

    /*private  void calculateCircumference()
    {
        m_circumference = 2 * Math.PI * m_r;
    }*/

    public  double getArea()
    {
        return  Math.PI * m_r * m_r;
    }

    public double getCircumference()
    {
        return  2 * Math.PI * m_r;
    }
}
