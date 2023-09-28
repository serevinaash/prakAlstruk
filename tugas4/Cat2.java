public class Cat2 extends Animal{
    @Override
    public void sound(){
        System.out.println("Meong");
    }
    public static void main(String args[]){
    	Animal obj = new Cat();
    	obj.sound();
    }
}
