import java.util.LinkedList;
import java.util.List;

/**
 * test class
 * Created by cordu on 10/6/2018.
 */
public class Test {
    private static List<ComplexNumber> inputs = new LinkedList<>();  // list of complex numbers
    private static List<String> operations = new LinkedList<>();  // list of operations that we want to do with those complex numbers

    public static void main(String arg[]){
        getComplexNumbers(arg); // get the complex numbers and operations from the command line input
        ComplexNumber rezultat = doOperations();
        rezultat.printComplexNumber();
        Polygon x = new Polygon(inputs);
        System.out.println(x.getPerimeter());
    }

    /**
     * Takes the command line parameters ( String type ) and transform them into ComplexNumber objects .
     * Saves the operations command line parameters into a different list .
     * @param arg
     */
    private static void getComplexNumbers(String arg[]){
        for(int i = 0 ; i < arg.length ; i++){
            if(i%2==0) {
                ComplexNumber complex = new ComplexNumber(arg[i]);
                inputs.add(complex);
            }else{
                operations.add(arg[i]);
            }
        }
    }

    /**
     * Takes the data from both inputs and get the result of the operations .
     * @return
     */
    private static ComplexNumber doOperations(){
        ComplexNumber rezultat = new ComplexNumber("0");
        int index = 1;
        rezultat.add(inputs.get(0));
        for(String i : operations){
            if(i.equals("+")){
                rezultat.add(inputs.get(index));
            }else{
                rezultat.substract(inputs.get(index));
            }
            index++;
        }
        rezultat.printComplexNumber();
        return rezultat;
    }
}
