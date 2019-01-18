package codingpractice;

class Circle extends Shape {

	@Override
	public float getArea(float radius) {
		
		return (float) (3.14*radius*radius);
	}

}
