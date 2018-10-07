package utils;


public class Annotation {
	@Deprecated
//	@Override
	@SuppressWarnings(value = { "unchecked" })
	void testAnnotation  () {
		System.out.println("annotation");
	}
	public static void main(String args[]){
		Annotation annotationInstance = new Annotation();
		annotationInstance.testAnnotation();
	}
}
