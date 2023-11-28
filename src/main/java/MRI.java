import java.time.LocalDate;

public class MRI {
    private final int fieldStrength;
    public MRI(int fieldStrength){
        this.fieldStrength = fieldStrength;
    }

    public int getFieldStrength() {
        return fieldStrength;
    }

    //    public String displayMRI(){
//        return "MRI examination: <br> Image:"+ image+" Field Strength:" + fieldStrength + "Scan date"
//    }

}
