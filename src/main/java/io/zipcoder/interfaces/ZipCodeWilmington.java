package io.zipcoder.interfaces;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

     private Students students= Students.getInstance();
     private Instructors instructors= Instructors.getInstance();


    private static ZipCodeWilmington  Instance = new ZipCodeWilmington();

    public static ZipCodeWilmington Instance() {
       return Instance;
   }

    public ZipCodeWilmington() {
        this.students= Students.getInstance();
        this.instructors= Instructors.getInstance();
    }

   public void hostLecture(Teacher teacher, Double numberOfHours){

        Student[] learners= students.toArray();
        teacher.lecture(learners, numberOfHours);
   }


    public  void hostLecture(Long id, Double numberOfHours){

        Student[] learners= students.toArray();
        Teacher teacher= (Teacher) instructors.findById(id);
         teacher.lecture(learners, numberOfHours);
   }




    public Map<Long, Double> getStudyMap(){

        Map<Long, Double> map = new HashMap();

        for ( Student student: students.toArray()){

            map.put(student.getId(), student.getTotalStudyTime());
        }


        return map;
    }
}
