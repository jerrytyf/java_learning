public class Point2D{
    private int x;
    private int y;
    public Point2D(int x,int y)
    {
        this.x = x;
        this.y = y;

    }
    public int Getx(){
        return this.x;
    }
    public int Gety(){
        return this.y;
    }
    public static void main(String[] args)
    {
        Point2D pointone = new Point2D(100,100);
        System.out.println(pointone.x);
    }
}