package Homework25;

public class Main {
    public static void main(String[] args) {
        Guru guru=new Guru(new Add());
        System.out.println("3+2= "+guru.g(3,2));

        guru=new Guru(new Substract());
        System.out.println("6-4= "+guru.g(6,4));

        guru=new Guru(new Multiple());
        System.out.println("4*3= "+guru.g(4,3));
    }
}
