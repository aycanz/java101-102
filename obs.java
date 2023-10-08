public class obs {
    public static void main(String[] args) {

            Teacher t1= new Teacher( "mahmut","mat","555");
            Teacher t2= new Teacher("ali","fzk","1111");
            Teacher t3= new Teacher("veli","bio","0000");
            Course matematik=new Course("matematik","101","mat");
        matematik.addTeacher(t1);
            Course fizik= new Course("fizik","102","fzk");
           fizik.addTeacher(t2);
            Course biyoloji= new Course("biyoloji","101","bio");
         biyoloji.addTeacher(t3);



        Student s1=new Student("Emre Bilir","23547","4",matematik,fizik,biyoloji);
        s1.addBulkExamNote(100,73,56,56,31,89);
        s1.isPass();

        Student s2=new Student("Ömer Atiç","35631","3",matematik,fizik,biyoloji);
        s1.addBulkExamNote(56,79,21,67,75,13);
        s2.isPass();


    }
}
