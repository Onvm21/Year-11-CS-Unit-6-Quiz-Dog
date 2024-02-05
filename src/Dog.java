public class Dog {
    private int age;
    private String name;
    private String colour;
    private Owner owner;

    public Dog(int age, String name, String colour, Owner owner){
        this.age = age;
        this.name = name;
        this.colour = colour;
        this.owner = owner;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getColour(){
        return colour;
    }

    public Owner getOwner() {
        return owner;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    private void addOneAge(){
        age = age + 1;
    }
    public int birthday(){
        addOneAge();
        return age;
    }
    public String toString(){
        return("The dog is named " + name + " and is " + age + " years old. This dog is " + colour + ".");
    }

}

