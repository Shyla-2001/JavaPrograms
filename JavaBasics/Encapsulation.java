class Person{

    private String name;

    public String getName(){

        return name;
    }

    public void setName(String newName){
        this.name=newName;
    }
}

public class Encapsulation{
    public static void main(String[] args){

        Person obj=new Person();
        obj.setName("Shylu");
        System.out.println(obj.getName());
    }
}