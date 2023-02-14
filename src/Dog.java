public class Dog {
    private int age; private String name; private String color;

    public Dog(){
        age = 0; name = ""; color = "";
    }
    public Dog(int newage, String newname, String newcolor){
        age = newage; name = newname; color = newcolor;
    }
    public int getAge(){
        return age;}
    public String getName(){
        return name;}
    public String getColor(){
        return color;}
    public void setAge(int newAge){
        age = newAge;}
    public void setName(String newName){
        name = newName;}
    public void setColor(String newColor){
        color = newColor;}

    private void addOneAge(){
        age++;}

    public int birthday(){
        addOneAge();
        return age;
    }
    public String toString(){
        return "The dog is named "+ name + " and is " + age + " years old. This dog is " + color + ".";
    }


}
