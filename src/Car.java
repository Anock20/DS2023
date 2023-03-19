public class Car implements Vehicle {
    public String type = null;
    public String color = null;
    public String name = null;

    public Car (String name, String color) {
        setColor(color);
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return getColor() + "" + getType();
    }
}

