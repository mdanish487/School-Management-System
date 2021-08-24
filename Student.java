package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    // Constructor
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    /**
     * To set the grade of the student
     * @param grade : sets the grade of the student
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @param fees paid by the student
     */
    public void payFees(int fees){
        feesPaid +=fees;
        School.updateTotalMoneyEarnt(fees);
    }

    /**
     *
     * @return the id of the student
     */
    public int getId(){
        return id;
    }

    /**
     * Returns the name of the student
     * @return the name of the student
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade(){
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the remaining amount of fees to be paid to School
     */
   public int getRemainigFees(){
        return feesTotal-feesPaid;
   }

    @Override
    public String toString() {
        return "Student's name: "+name+", Total fees paid so far: $"+feesPaid;
    }
}
