
class Student {
	
	String name;
	String usn;
	String college;
	String cgpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public Student(String name, String usn, String college, String cgpa) {
		super();
		this.name = name;
		this.usn = usn;
		this.college = college;
		this.cgpa = cgpa;
	}
	

}

class StudentService{
	
	public Student getStudent(String str) {
		String name = "";
		String usn = "";
		String college = "";
		String cgpa = "";
		int x = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '@') {
				name = str.substring(0, str.indexOf('@'));
				x = i;
			}
			if(str.charAt(i) == '-') {
				usn = str.substring(x+1, str.indexOf('-'));
				x = i;
			}
			if(str.charAt(i) == '#') {
				college = str.substring(x+1, str.indexOf('#'));
			}
			cgpa = String.valueOf(str.charAt(str.length()-1));
		
	}
		Student s = new Student(name, usn, college, cgpa);
	return s;
	}
	
	public String getStudent(Student s) {
		String usn = s.getUsn();
		String sec = "";
		String section = usn.substring(7,9);
		int section1 = Integer.valueOf(section);
		if(section1 >= 001 && section1 <= 060) {
			sec =  "A";
		}
		if(section1 >= 061 && section1 <= 120) {
			sec =  "B";
		}
		if(section1 >= 121 && section1 <= 180) {
			sec =  "C";
		}
		if(section1 > 180) {
			sec = "Z";
		}
		return sec;
	}
	
}
public class Main {
	public static void main(String args[]) {
		String name = "suhana";
		String usn = "1PC16C5046";
		String college = "ALU";
		String cgpa = "8";
		Student s = new Student(name, usn, college, cgpa);
		StudentService s1 = new StudentService();
		Student r = s1.getStudent("suhana@1PC16C5046-ALU#8");
		String r1 = s1.getStudent(s);
		System.out.println(r.getName()+" - Name\n"+r.getCollege()+" - College \n"+r.getUsn()+" - USN\n"+r.getCgpa()+" - CGPA \n");
		System.out.println("Section - "+ r1);
		
	}
}

	

