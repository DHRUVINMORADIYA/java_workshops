import java.util.Scanner;

class Student {
    String name;
    int age;

    public void setData(String n, int a) {
        name = n;
        age = a;
    }
}

class Teacher extends Student {
    double Experience;

    Teacher(double e) {
        Experience = e;
    }
}

class School {
    public static void main(String[] args) {

        int counter = 1, s = 0, t = 0;
        Student studentList[] = new Student[10];
        Teacher teacherList[] = new Teacher[10];
        while (counter == 1) {

            System.out.println("Welcome to School");
            System.out.println("Choose the action...");
            System.out.println("1.Display Teachers");
            System.out.println("2.Display Students");
            System.out.println("3.Add Teacher");
            System.out.println("4.Add Student");
            System.out.println("5.Exit");

            Scanner actionForCase = new Scanner(System.in);
            int action = actionForCase.nextInt();

            switch (action) {

                case 1:
                    System.out.println();
                    for (int i = 0; i < t; i++) {
                        System.out.println();
                        System.out.print("(" + (i + 1) + ") Name: " + teacherList[i].name + "\nAge: "
                                + teacherList[i].age + "\nWork Experience in Years: " + teacherList[i].Experience);
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    for (int i = 0; i < s; i++) {
                        System.out.println();
                        System.out.print(
                                "(" + (i + 1) + ") Name: " + studentList[i].name + "\nAge: " + studentList[i].age);
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    Scanner scanTeacher = new Scanner(System.in);

                    System.out.print("Enter name...");
                    String nameOfTeacher = scanTeacher.nextLine();

                    System.out.print("Enter age...");
                    int ageOfTeacher = scanTeacher.nextInt();

                    System.out.print("Enter Work Experience in Years...");
                    double workExperience = scanTeacher.nextDouble();

                    teacherList[t] = new Teacher(workExperience);
                    teacherList[t].setData(nameOfTeacher, ageOfTeacher);
                    t++;
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    Scanner nameage = new Scanner(System.in);

                    System.out.print("Enter name...");
                    String name = nameage.nextLine();

                    System.out.print("Enter age...");
                    int age = nameage.nextInt();

                    studentList[s] = new Student();
                    studentList[s].setData(name, age);
                    s++;
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Good bye...");
                    System.out.println();
                    counter = 0;
                    break;

                default:
                    System.out.println("thik se dabaa...");

            }
        }

    }

}
