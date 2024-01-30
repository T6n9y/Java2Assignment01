package GroupAssignment;

public abstract class GeometricObject {
	
	private String color;
	private Boolean filled;

	public GeometricObject() {
		this.color = "white";
	}
	
	protected GeometricObject(String color,Boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public Boolean getFilled() {
		return filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();

	
	
	
	
}