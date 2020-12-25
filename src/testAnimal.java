import java.util.Scanner;


public class testAnimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите значение бега кошки");
        double intValueRun=sc.nextDouble();
        System.out.println("Введите значение прыжка кошки");
        double inValueJump=sc.nextDouble();
        System.out.println("Введите значение плавания кошки");
        double intValueSwim=sc.nextDouble();

        Cat cat=new Cat("Candy");
        System.out.println(" "+" run: " + cat.run(intValueRun));
        System.out.println(" jump: " + cat.jump(inValueJump));
        System.out.println(" swim: " + cat.swim(intValueSwim));
        System.out.println(" ");

        Dog dog=new Dog("Bubble");
        System.out.println("Введите значение бега собаки");
        intValueRun=sc.nextDouble();
        System.out.println("Введите значение прыжка собаки");
        inValueJump=sc.nextDouble();
        System.out.println("Введите значение плавания собаки");
        intValueSwim=sc.nextDouble();
        System.out.println(" "+" run: " + dog.run(intValueRun));
        System.out.println(" jump: " + dog.jump(inValueJump));
        System.out.println(" swim: " + dog.swim(intValueSwim));
        System.out.println(" ");


    }
}