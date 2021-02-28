package Lesson9.Task1;

import java.util.Iterator;
import java.util.List;

class StudentService {

    public static int maxRating(List<Student> list) {
        int maxRate = 0;
        Iterator<Student> iter = list.iterator();
        while (iter.hasNext()) {
            Student stud = iter.next();
            for (int i = 0; i < stud.getRatings().length; i++) {
                if (maxRate <= stud.getRatings()[i]) {
                    maxRate = stud.getRatings()[i];
                }
            }
        }
        return maxRate;
    }
}
