public class Animal{
   public void sound(){
      System.out.println("Binatang Bersuara");   
   }
}

class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Meringkik");
    }
    public static void main(String args[]){
    	Animal obj = new Horse();
    	obj.sound();
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meong");
    }
    public static void main(String args[]){
    	Animal obj = new Cat();
    	obj.sound();
    }
}