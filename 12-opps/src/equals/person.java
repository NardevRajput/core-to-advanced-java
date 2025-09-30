package equals;

public class person {
    private String name;
    private int age;
    private String id;

    public person(String name,int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof person)){
            return false;
        }
        person per = (person) obj;
        return per.name.equals(name) &&
                per.age == age &&
                per.id.equals(id);
    }

    public String getName(){
        return name;
    }
    public void setName(){

    }
    public int getAge(){
        return age;
    }
    public void setAge() {

    }
    public String setId() {
        return id;
    }


    public String toString() {
    final StringBuilder sb = new StringBuilder("person:- ");
    sb.append("name = ").append(name);
    sb.append("age = ").append(age);
    sb.append("id = ").append(id);
    return sb.toString();
    }
}
