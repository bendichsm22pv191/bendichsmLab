package src.main.java.tech.reliab.course.toropchinda.bank.entity;

public class Data {
    private Integer day;
    private Integer month;
    private Integer year;
    public Data(Integer month, Integer day, Integer year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(Integer dd) {
        this.day = day;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }


    public String Data(){
        return Integer.toString(day) + ' ' + Integer.toString(month)+ ' ' + Integer.toString(year);
    }
}
