public class StudyProgramme {
    private String nameOfStudiesMajor, prosperityOfStudy;
    private int numberOfSemesters, numberOfPossibleITNs;
    public StudyProgramme(String nameOfStudiesMajor, String prosperityOfStudy, int numberOfSemesters, int numberOfPossibleITNs){
        this.nameOfStudiesMajor = nameOfStudiesMajor;
        this.prosperityOfStudy = prosperityOfStudy;
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
