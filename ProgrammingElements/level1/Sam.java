public class Sam {
    public static void main(String[] args) {
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;

        int numberOfSubjects = 3;

        double averagePercentage = (double) totalMarks / numberOfSubjects;

        System.out.println("Sam's average percentage in PCM: " + averagePercentage + "%");
    }

    }

