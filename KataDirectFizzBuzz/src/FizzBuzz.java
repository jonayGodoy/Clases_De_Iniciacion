
public class FizzBuzz {

    String [] listPosition;

    public FizzBuzz() {
        this.listPosition = new String[100];
        generateArray();
    }

    private void generateArray(){
        for(int i = 0; i < this.listPosition.length; i++){
            this.listPosition[i] = String.valueOf(i);
        }
    }

    public String getPosition(int number) {



        if ((isBuzz(number)) && (isFizz(number))){
            return "FizzBuzz";
        }
        if (isBuzz(number)){
            return "Buzz";
        }
        if(isFizz(number)){
            return "Fizz";
        }


        return this.listPosition[number];
    }

    private boolean isFizz(int number) {
        return number%3==0 || String.valueOf(number).contains("3");
    }

    private boolean isBuzz(int number) {
        return number%5==0 || String.valueOf(number).contains("5");
    }
}
