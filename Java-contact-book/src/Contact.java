public class Contact {
    private String name;
    private String phone;
    private int age;
    private String adress;
    private String ocupation;
    private String notes;

    public Contact(String name, String phone, int age, String adress, String ocupation, String notes){
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.adress = adress;
        this.ocupation = ocupation;
        this.notes = notes;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAdress(){
        return adress;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getOcupation(){
        return ocupation;
    }

    public void setOcupation(String ocupation){
        this.ocupation = ocupation;
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }
}