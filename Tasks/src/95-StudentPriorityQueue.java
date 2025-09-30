import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                return s1.getGrade() - s2.getGrade();
            }
        });
        queue.offer(new student("Nardev", 'B'));

        queue.offer(new student("Ram", 'A'));

        queue.offer(new student("Mohan", 'c'));

        queue.offer(new student("Shyam", 'D'));

        System.out.printf("Queue is: %s", queue);
    }

    private static class student {
        private final String name;
        private final char grade;

        public student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {

            return name + ": " + grade;
        }
    }
}
