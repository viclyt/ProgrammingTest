import jdk.vm.ci.meta.Local;

import java.time.LocalDate;

public class BP {
    private int systolic;
    private int diastolic;
    private LocalDate bpdate;
    private BPduration bpduration;


    public BP (int systolic, int diastolic, LocalDate bpdate, BPduration bpduration){
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.bpdate = bpdate;
        this.bpduration = bpduration;
    }

//    public String displayBP(){
//        return "Systolic: "+ systolic + "<br>"+ "Diastolic: " + diastolic + "Measurement date:" + bpdate + "Duration:" + bpduration;
//    }
    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setBpdate(LocalDate bpdate) {
        this.bpdate = bpdate;
    }
    public BPduration getBpduration(){
        return bpduration;
    }


}
