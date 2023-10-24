import java.util.*;
class Circle {
    private double radius;
    private double PI=Math.PI;
    Circle ()   {}
    Circle (double radius)   {
    this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcCircumference(double x) {
        return 2*this.PI*x;
    }
    public double calcArea(double x)    {
        return this.PI*Math.pow(x,2);
    }
    @Override
    public String toString()    {
        return "radius " + this.radius;
    }
}
class MultiCircle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList <Circle> circles = new ArrayList<>();
        boolean exit=false;
        while (!exit)   {
            System.out.println("to Enter radius of a new circle Enter 1");
            if (circles.size()>= 1)  {
                System.out.println("To edit the any of Circles Enter 2");
                System.out.println("To calculate the Circumference of the entered circle Enter 3");
                System.out.println("To calculate the area of the entered circle Enter 4");
                System.out.println("To return the description of a specific circle Enter 5");
                System.out.println("To print the number of circles enter 6");
                System.out.println("To delete a specific circle Enter 7");
            }
            System.out.println("To exit Enter 8");
            int x = in.nextInt();

            switch (x)  {
                case 1-> {
                    System.out.println("Enter the radius");
                    Circle circle = new Circle(in.nextDouble());
                    circles.add(circle);
                    System.out.println("New circle has been added");
                    System.out.println();
                }
                case 2-> {
                    if (circles.size() >=1)  {
                        System.out.println("Enter the number of the circle you want to edit");
                        int index =in.nextInt()-1;
                        if (index >=0 && index < circles.size())    {
                            System.out.println("Enter the new radius");
                            double newRad = in.nextDouble();
                            circles.get(index).setRadius(newRad);
                        }
                        else    {
                            System.err.println("There are no circle to edit");
                            System.out.println();
                        }

                    }
                }
                case 3->    {
                    if (circles.size() >0)  {
                        System.out.println("Enter the number of the circle you want to calculate its Circumference");
                        int index =in.nextInt()-1;
                        if (index >=0 && index < circles.size())    {
                            Circle Circle = circles.get(index);
                            System.out.println(Circle.calcCircumference(Circle.getRadius()));
                            System.out.println();
                        }
                        else    {
                            System.err.println("invalid circle number");
                            System.out.println();
                        }

                    }
                    else    {
                        System.err.println("No circles have been entered");
                        System.out.println();
                    }
                }
                case 4 ->   {
                    if (circles.size() >0)  {
                        System.out.println("Enter the number of the circle you want to calculate its Area");
                        int index =in.nextInt()-1;
                        if (index >=0 && index < circles.size())    {
                            Circle Circle = circles.get(index);
                            System.out.println(Circle.calcArea(Circle.getRadius()));
                        }
                        else    {
                            System.err.println("invalid circle number");
                            System.out.println();
                        }

                    }
                    else    {
                        System.err.println("No circles have been entered");
                        System.out.println();
                    }
                }
                case 5-> {
                    System.out.println("Enter the number of the circle you to print its info");
                    int index =in.nextInt()-1;
                    if (index >=0 && index < circles.size()) {
                        System.out.println(circles.get(index).toString());
                        System.out.println();
                    }
                    else    {
                        System.err.println("No circles have been entered");
                        System.out.println();
                    }
                }
                case 6->    {
                    if (circles.size()>0)   {
                        System.out.println(circles.size() > 1 ? "you have "+circles.size()+" circles":"you have "+circles.size()+" circle" );
                        System.out.println();
                    }
                    else    {
                        System.err.println("No circles have been entered");
                        System.out.println();
                    }
                }
                case  7->   {
                    System.out.println("Enter the number of the circle you to delete");
                    int index =in.nextInt()-1;
                    if (index >=0 && index < circles.size()) {
                        circles.remove(index);
                        System.out.println("Circle number "+(index+1) +"has been deleted" );
                        System.out.println(circles.size() > 1 ? "Now you have "+circles.size()+" circles":"Now you have "+circles.size()+" circle" );
                    }
                    else    {
                        System.err.println("No circles have been entered");
                        System.out.println();
                    }
                }
                case 8->    {
                    System.err.println("Exiting");
                    System.out.println();
                    exit=true;
                }
                default -> {
                    System.err.println("Invalid number");
                    System.out.println();
                }
            }
        }
    }
}