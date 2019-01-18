package codingpractice;

class Triangle extends Shape{
	
	@Override
	public float getArea(float base, float height) {
		return (float) (0.5*base*height);
	}
}
