class student_ToString {
    String FirstName;
    String LastName;
    int rollNumber;
    String section;
    int MobileNumber;
    String gmail;
    String UserName;

    public student_ToString(String FirstName, String LastName, int rollNumber, String section, int MobileNumber, String gmail, String userName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.rollNumber = rollNumber;
        this.section = section;
        this.MobileNumber = MobileNumber;
        this.gmail = gmail;
        this.UserName = userName;

    }
    @Override
    public String toString() {
        return "student details:{FirstName: " + FirstName
                + ", LastName: "+ LastName
                +", rollNumber:" + 2200645
                + ", section: " + section
                + ", MobileNumber: " + MobileNumber
                + ", gmail: , UserName: " + UserName + " }";
    }

    public static void main(String[] args) {
        student_ToString stu = new student_ToString("xyz", "abc", 2200, "B", 9027, "xyz@gmail.com", "xyz");
        System.out.println(stu);
    }
}
