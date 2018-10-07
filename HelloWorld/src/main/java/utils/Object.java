package utils;

public class Object {
	public static void main(String args[]) {
		class Student {
			private String defaultName = "5";
			private String name = "5";
			public Student (String name) {
				if (name == null) {
					this.name = this.defaultName;
				} else {
					this.name = name;
				}
			}
			public String getName () {
				return this.name;
			}
			public void setName (String name) {
				this.name = name;
			}
		}
		Student studentOne = new Student(null);
		Student studentTwo = new Student("student one");
		System.out.println(studentOne.getName());
		System.out.println(studentTwo.getName());
		studentOne.setName("student on changed to student one");
		System.out.println(studentOne.getName());
	}

}
