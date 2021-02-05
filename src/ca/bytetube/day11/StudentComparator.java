package ca.bytetube.day11;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        //如果用 参数1的值 - 参数2的值 < 0 (1 2 3 4 5) 升序排
        //如果用 参数1的值 - 参数2的值 > 0  降序排
        return  s2.getAge() - s1.getAge() ;
    }
}
