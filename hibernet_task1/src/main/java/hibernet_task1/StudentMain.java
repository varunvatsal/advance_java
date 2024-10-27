package hibernet_task1;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Student student = new Student();
		
		StudentCrud studentCrud = new StudentCrud();
		boolean check = true;
		
		do {
			System.out.println("1. save student \n 2. update student \n 3.delete student \n 4. get student by id");
			int choice = myScanner.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("enter the id: ");
					int id = myScanner.nextInt();
					System.out.println("enter the name");
					String name = myScanner.next();
					System.out.println("enter the address");
					String address = myScanner.next();
					
					student.setId(id);
					student.setName(name);
					student.setAddress(address);
					
					studentCrud.saveStudent(student);
					break;
				}
				case 2: {
					System.out.println("enter the id: ");
					int id = myScanner.nextInt();
					System.out.println("enter the name");
					String name = myScanner.next();
					System.out.println("enter the address");
					String address = myScanner.next();
					
					studentCrud.updateStudent(id, name, address);
					break;
				}
				case 3: {
					System.out.println("enter the id: ");
					int id = myScanner.nextInt();
					
					studentCrud.deleteStudent(id);
					break;
				}
				case 4: {
					System.out.println("enter the id: ");
					int id = myScanner.nextInt();
					
					studentCrud.getStudentById(id);
					break;
				}	
				case 5: {
					studentCrud.getAllStudent();
					break;
				}
				default : {
					break;
				}
			}
		} while (check);
		
	}
}


//package hibernate_task1;
//
//import java.util.Scanner;
//
//public class Studentmain {
//
//	public static void main(String[] args) {
//		 Scanner scanner=new Scanner(System.in);
//		 Student student=new Student();
//		 Studentcrud studentcrud=new Studentcrud();
//		 boolean check=true;
//		 
//		 do {
//			System.out.println("1.save student \n 2.update student \n 3.delete student \n 4.get student by id"
//					+ "\n 5.get all student");
//			int choice=scanner.nextInt();
//			switch (choice) {
//			case 1:{
//				System.out.println("enter the id");
//				int id=scanner.nextInt();
//				System.out.println("enter the name");
//				String name=scanner.next();
//				System.out.println("enter the address");
//				String address=scanner.next();
//				
//				student.setId(id);
//				student.setName(name);
//				student.setAddress(address);
//				
//				studentcrud.savestudent(student);
//			}
//			break;
//			case 2:{
//				System.out.println("enter the id");
//				int id=scanner.nextInt();
//				System.out.println("enter the name");
//				String name=scanner.next();
//				System.out.println("enter the address");
//				String address=scanner.next();
//				
//				student.setId(id);
//				student.setName(name);
//				student.setAddress(address);
//				
//				studentcrud.updatestudent(id, name, address);
//			}
//			break;
//			case 3:{
//				System.out.println("enter the id");
//				int id=scanner.nextInt();
//				
//				studentcrud.deletestudent(id);
//				
//			}
//			break;
//			case 4:{
//				System.out.println("enter the id");
//				int id=scanner.nextInt();
//				
//				studentcrud.getstudentbyid(id);
//			}
//			break;
//			case 5:{
//				studentcrud.getallstudent();
//			}
//			
//				
//				break;
//
//			default:
//				break;
//			}
//		} while (check);
//	}
//}












