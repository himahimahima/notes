package abstract_factory;

public class ColourFactory extends AbstractFactory{

	@Override
	Colour getColour(String colour) {
		if(colour == null){
			return null;
		}
		if(colour.equalsIgnoreCase("RED")){
			return new Red();
		}else if(colour.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if(colour.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		return null;
	}
	

}
