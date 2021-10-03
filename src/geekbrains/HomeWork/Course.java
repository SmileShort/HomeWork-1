package geekbrains.HomeWork;

import java.util.Arrays;

public class Course {

    private String []course;


    public Course (String []course) {
        this.course = course;
    }

    public void courseId() {
        System.out.println(Arrays.toString(course));
    }

    public String[] getCourse() {
        return course;
    }

    public void doIt (String []teamPersonalName){
        for (int i = 0; i < teamPersonalName.length; i++){
            for (int j = 0; j < course.length; j++){
                System.out.println("Поздравляем! Участник по имени " + teamPersonalName[i] + " приодалел(а) припятствие: " + course[j]);
            }
            System.out.println();
        }
    }



}
