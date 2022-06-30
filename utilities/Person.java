package utilities;

public class Person {

    public String name;
    public double height;
    public double Weight;

    public Person(String name, double height, double Weight) {
        this.name = name;
        this.height = height;
        this.Weight = Weight;
    }

    public double IMC (){
        return Weight / (height * height);

    }
    public String toString (){
        return "Resultado: " + String.format("%.2f",IMC()) + " de IMC";
    }
}
