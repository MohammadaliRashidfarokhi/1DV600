public class Player {
    private String name;
    private int age;
    private String date;
    private String survey;

    public Player(String name, int userAge,String feedBack,String date){
        this.age = userAge;
        this.name =name;
        this.survey =feedBack;

        this.date =date;
    }
    public Player(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(int year,int month,int day) throws Exception {
        if(year>0 && year<=2020 && month>0 && month<=12 && day>0 && day<=31) {
            this.date = day+"/"+month+"/"+ year;
        } else {
            throw new Exception("Date is invalid");
        }
    }

    public String getSurvey() {
        return survey;
    }

    public void setSurvey(String survey) {
        this.survey = survey;
    }
    public boolean isAli(String s) {
        if (s.equals("Ali")) {//
        return true;//
        } else//
        return false;
    }
    public void exit (){
        System.out.print("\t4. Exit");
    }
    public  void helpMe (){
        System.out.print(" 3.Hint");
    }


}
