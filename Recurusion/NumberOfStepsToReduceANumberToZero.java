public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
    return numberHelper(num,0);
    }
    public int numberHelper(int num, int step){
        if(num == 0){
            return step;
        }
        if(num % 2 == 0){
           return numberHelper(num / 2,step + 1);
        }
        return numberHelper(num-1,step+1);
    }
}
