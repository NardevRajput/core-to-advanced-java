class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollment;

    String[]  enrolledStu;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStu = new String[maxCapacity];
    }
    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void setEnrolledStu(String studentName) {
        enrolledStu[enrollment] = studentName;
        enrollment++;
    }

    void unenrollment(String studentName) {
        System.out.println("Student remove");
        enrollment--;
    }
}
