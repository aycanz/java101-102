public class Student {
     Course c1;
     Course c2;
     Course c3;
     String name;
     String stNo;
     String classes;
     double avarage;
     boolean ispass;

     Student (String name,String stNo,String classes,Course c1,Course c2,Course c3){
          this.name=name;
          this.stNo=stNo;
          this.classes=classes;
          this.c1=c1;
          this.c2=c2;
          this.c3=c3;
          this.avarage=0.0;
          this.ispass=false;
     }
     void  addBulkExamNote(int note1,int note2,int note3,int noteS1,int noteS2,int noteS3){
          c1.note = note1;
          c1.noteS = noteS1;
          c2.note = note2;
          c2.noteS = noteS2;
          c3.note = note3;
          c3.noteS = noteS3;

     }

     void isPass(){
          System.out.println("***************");
          this.avarage=((this.c1.note*0.8+this.c1.noteS*0.2)+(this.c2.note*0.8+this.c2.noteS*0.2)+(this.c3.note*0.8+this.c3.noteS*0.2))/3.0;
          if(this.avarage>=50){
               System.out.println("Sınıfı geçtiniz.");
               this.ispass=true;
          }
          else{
               System.out.println("Sınıfı geçemediniz.");
               this.ispass=false;
          }
          printNote();
     }

     void printNote(){
          System.out.println(this.c1.name+" SINAV Notu\t :"+this.c1.note+"\nSÖZLÜ Notu\t :"+this.c1.noteS);
          System.out.println(this.c2.name+" SINAV Notu\t :"+this.c2.note+"\nSÖZLÜ Notu\t :"+this.c2.noteS);
          System.out.println(this.c3.name+" SINAV Notu\t :"+this.c3.note+"\nSÖZLÜ Notu\t :"+this.c3.noteS);
          System.out.println("ORTALAMANIZ: "+this.avarage);

     }

}