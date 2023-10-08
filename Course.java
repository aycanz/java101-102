public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int noteS;

    Course(String name, String code, String prefix) {
        this.code = code;
        this.name = name;
        this.prefix = prefix;
        int note = 0;
        int noteS=0;
    }

    void addTeacher(Teacher teacher) {

        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

       //     printTeacherInfo();
        } else
            System.out.println("Öğretmen ve branş uyuşmuyor.");

    }
        void printTeacherInfo(){

            this.teacher.print();
        }
    }

