public class Patient {
    private String fullName;
    private int age;
    private MRI mri;
    private BP bp;
    public Patient(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }


    public int getAge() {
        return age;
    }
    public String addMRI(){
        return mri.toString();
    }

    public String addBP(){
        return bp.toString();
    }

}
