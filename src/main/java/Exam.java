import java.time.LocalDate;

public abstract class Exam {
    int year;
    int month;
    int dayofMonth;
    LocalDate ld;

    public void examDate(int year, int month, int dayofMonth){
        this.year = year;
        this.month = month;
        this.dayofMonth = dayofMonth;
        ld = LocalDate.of(year, month, dayofMonth);
        String s = ld.toString();
        System.out.println("s");
    }

    public String getExamDate() {
        return "s";
    }
}
