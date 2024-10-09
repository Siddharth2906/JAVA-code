class Draw{  
    void draw(){System.out.println("drawing...");}  
    }  
    class Rectangle extends Draw{  
    void draw(){System.out.println("drawing rectangle...");}  
    }  
    class Circle extends Draw{  
    void draw(){System.out.println("drawing circle...");}  
    }  
    class Triangle extends Draw{  
    void draw(){System.out.println("drawing triangle...");}  
    }  
    class lab4{  
    public static void main(String args[]){  
    Draw s;  
    s=new Rectangle();  
    s.draw();  
    s=new Circle();  
    s.draw();  
    s=new Triangle();  
    s.draw();  
    }  
    }  
    