public class BPduration {
    private String bpduration;
    private String VT;
    private String ST;
    public BPduration(String bpduration){

        // ST or VST only
        if (bpduration == VT){
            System.out.println("VT");
        }
        else if (bpduration == ST){
            System.out.println("ST");
        }
        else{
            throw new RuntimeException("Error");
        }
    }

    public String getBpduration() {
        return bpduration;
    }
}
