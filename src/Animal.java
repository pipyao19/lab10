abstract class Animal implements Animal1{
    String name;
    double runValue;
    double jumpValue;
    double swimValue;
    Animal(String name, double runValue, double jumpValue, double swimValue){
        this.name=name;
        this.runValue=runValue;
        this.jumpValue=jumpValue;
        this.swimValue=swimValue;
    }
    @Override
    public void info(){
        System.out.println(name);
    }
    public boolean run(double interValueRun){
        return (this.runValue>=interValueRun);
    }
    @Override
    public boolean jump(double interValueJump){
        return (this.jumpValue>=interValueJump);
    }
    @Override
    public boolean swim(double interValueSwim){
        return (this.swimValue>=interValueSwim);
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name, 500,0.5, 10);
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name, 200, 2, 0);
    }
}