public class ReportCard {

    // variable for chemistry grade (ex. A, B, C, D, F)
    private String mChemistryGrade;

    // variable for biology grade
    private String mBiologyGrade;

    // variable for english grade
    private String mEnglishGrade;

    // variable for math grade
    private String mMathGrade;

    // constructor method instantiates variables upon the creation of a new ReportCard object
    public ReportCard(String chemistryGrade, String biologyGrade, String englishGrade, String mathGrade) {
        mChemistryGrade = chemistryGrade;
        mBiologyGrade = biologyGrade;
        mEnglishGrade = englishGrade;
        mMathGrade = mathGrade;
    }

    // gets chemistry grade
    public String getmChemistryGrade() {
        return mChemistryGrade;
    }

    // sets chemistry grade
    public void setmChemistryGrade(String mChemistryGrade) {
        this.mChemistryGrade = mChemistryGrade;
    }

    // gets biology grade
    public String getmBiologyGrade() {
        return mBiologyGrade;
    }

    // sets biology grade
    public void setmBiologyGrade(String mBiologyGrade) {
        this.mBiologyGrade = mBiologyGrade;
    }

    // gets english grade
    public String getmEnglishGrade() {
        return mEnglishGrade;
    }

    // sets english grade
    public void setmEnglishGrade(String mEnglishGrade) {
        this.mEnglishGrade = mEnglishGrade;
    }

    // gets math grade
    public String getmMathGrade() {
        return mMathGrade;
    }

    // sets math grade
    public void setmMathGrade(String mMathGrade) {
        this.mMathGrade = mMathGrade;
    }

    @Override
    public String toString() {
        return "Your Report Card" + "\nChemistry Grade: " + mChemistryGrade + "\nBiology Grade: "
                + mBiologyGrade + "\nEnglish Grade: " + mEnglishGrade + "\nMath Grade: " +
                mMathGrade + "\nSee you next semester!";
    }

}

