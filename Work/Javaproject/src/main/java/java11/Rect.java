package java11;

public class Rect {
	
	public Rect() {
		super();
	}
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	// 필드
	private int width;
	private int height;
	
	// 메서드
	public int area() {
		return width*height;
	}
	public int perimeter() {
		return 2 * (width + height);
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

}
