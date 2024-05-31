public class StudyProgramme {
    private String nameOfStudiesMajor, TypeOfGrades;
    private int numberOfSemesters, numberOfPossibleITNs;
    public StudyProgramme(String nameOfStudiesMajor, String TypeOfGrades, int numberOfSemesters, int numberOfPossibleITNs){
        this.nameOfStudiesMajor = nameOfStudiesMajor;
        this.TypeOfGrades = TypeOfGrades;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfPossibleITNs = numberOfPossibleITNs;
    }
    public  int getNrOfPossibleITN(){
        return this.numberOfPossibleITNs;
    }
    public int getNumberOfSemesters(){
        return this.numberOfSemesters;
    }
}
