package design.patterns.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//获取Circle的对象，并调用它的draw方法
		Shape shape1 = shapeFactory.getShape("circle");
		
		//调用Circle的draw方法
		shape1.draw();
		
		//获取Rectangle的对象，并调用它的draw方法
		Shape shape2=shapeFactory.getShape("rectangle");
		
		//调用Rectangle的draw方法
		shape2.draw();
		
		//获取Square的对象，并调用它的draw方法
		Shape shape3=shapeFactory.getShape("square");
		
		//调用square的draw方法
		shape3.draw();
	}

}
