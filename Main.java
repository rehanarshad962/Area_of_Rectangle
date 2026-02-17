package Area;
class Rectangle
{
	private int length;
    private int width;
    Rectangle()
    {
    	length = 0;
        width = 0;
        }
    Rectangle(int length, int width)
    { 
    	this.length = length;
    	this.width = width;
    	}
    public int getLength()
    {
    	return length;
    	}
    public int getWidth()
    {
    	return width;
    	}
    public void setLength(int length)
    {
    	this.length = length;
    	}
    public void setWidth(int width)
    {
    	this.width = width;
    	}
    public void Displayarea()
    {
    	System.out.println("Area of Rectangle is : " + (length*width) );
    	}
    }
public class Main {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle();
		R1.setLength(4);
		R1.setWidth(8);
		System.out.println("Length : " + R1.getLength());
		System.out.println("Width : " + R1.getWidth());
		R1.Displayarea();
		
		Rectangle R2 = new Rectangle();
		R2.setLength(12);
		R2.setWidth(25);
		System.out.println("Length : " + R2.getLength());
		System.out.println("Width : " + R2.getWidth());
		R2.Displayarea();
		
		Rectangle R3 = new Rectangle();
		R3.setLength(9);
		R3.setWidth(3);
		System.out.println("Length : " + R3.getLength());
		System.out.println("Width : " + R3.getWidth());
		R3.Displayarea();
		
	}

}
