public class OgrNode  {
    String name;
    String surName;
    int number;
    int midterm;
    int fin;
    double gpa;
    String result;
    OgrNode next;



    public OgrNode(String name, String surName, int number, int midterm, int fin) {
        this.name = name;
        this.surName = surName;
        this.number = number;
        this.midterm = midterm;
        this.fin = fin;

        gpa=midterm*0.4+fin*0.6;

        if(gpa>=50){
            result="GEÇTİ";
        }else {
            result="KALDI";
        }


    }
}
