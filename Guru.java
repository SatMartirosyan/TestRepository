package Homework25;

public class Guru {
    private Logic logic;
    Guru(Logic logic){
        this.logic=logic;
    }
    public int g(int num1, int num2){
        return logic.doSmthing(num1,num2);
    }
}
