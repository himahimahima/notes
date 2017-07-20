package mvc;
/**
 * 
 * Model: Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.
 * View: View is the visualisation of the data
 * Controller: Conroller acts on both the view and model, controlling the data flow and updates the view.
 *
 */
public class MVCPatternDemo {
	public static void main(String args[]){
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		controller.setStudentName("hima");
		controller.updateView();
	}
	
	private static Student retrieveStudentFromDatabase(){
		Student student = new Student();
		student.setName("Rob");
		student.setRollNo("10");
		return student;
	}
}
