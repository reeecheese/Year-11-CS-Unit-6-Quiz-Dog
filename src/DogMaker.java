public class DogMaker {

  public static void main(String[] args) {
    new Dog(2, "jill", "black and tan");
    Dog.setName("Jessie");
    System.out.println(Dog.getAge());
    int age = Dog.birthday();
    System.out.println(age);
    System.out.println(Dog.toString());
    
    
  }
  
}
