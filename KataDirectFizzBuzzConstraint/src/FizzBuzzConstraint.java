
public class FizzBuzzConstraint {
    public String getPosition(Position position) {

        if(position.getPosition() % 3 == 0){
            return "Fizz";
        }

        return String.valueOf(position);
    }
}
