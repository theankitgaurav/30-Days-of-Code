class Student extends Person{
	private int[] testScores;
    public char calculate(){
        int sum=0;
        char grade;
        for(int i=0; i<testScores.length; i++){
            sum += testScores[i];
        }
        int avg = sum/(testScores.length);
        if (avg>=90 && avg<=100)
            grade = ('O');
        else if (avg>=80 && avg<90)
            grade = ('E');
        else if (avg>=70 && avg<80)
            grade = ('A');
        else if (avg>=55 && avg<70)
            grade = ('P');
        else if (avg>=40 && avg<55)
            grade = ('D');
        else
            grade = ('T');
        return grade;
    }
    Student(String fn, String ln, int id, int[] testScores){
        super(fn , ln, id);
        this.testScores = testScores;
    }
}