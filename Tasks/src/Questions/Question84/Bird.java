package Questions.Question84;

public abstract class Bird implements flyable{
    private final String bread;

    public Bird(String bread){
        this.bread = bread;
    }

    public String getBread(){
        return bread;
    }
}
