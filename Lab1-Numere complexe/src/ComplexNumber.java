/**
 * Class has the complex number representation
 * Created by cordu on 10/6/2018.
 */
public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    /**
     * The contructor transform a parameter input (String ) into a ComplexNumber format :)
     * 1 -> the complex number has a x + y*i format
     * 2 -> the complex number has a x - y*i format
     * 3 -> the complex number has a x format
     * 4 -> the complex number has a i or y * i format
     * @param parameterArgument
     */
    public ComplexNumber(String parameterArgument){
        try {
                //1
            if(parameterArgument.contains("+")){
                realPart = Integer.parseInt(parameterArgument.substring(0,parameterArgument.lastIndexOf("+")));
                imaginaryPart = Integer.parseInt(parameterArgument.substring(parameterArgument.lastIndexOf("+"),parameterArgument.lastIndexOf("i")));
                //2
            }else if(parameterArgument.contains("-")){
                realPart = Integer.parseInt(parameterArgument.substring(0,parameterArgument.lastIndexOf("-")));
                imaginaryPart = Integer.parseInt(parameterArgument.substring(parameterArgument.lastIndexOf("-"),parameterArgument.lastIndexOf("i")));
                //3
            }else if(!parameterArgument.contains("i")){
                realPart = Integer.parseInt(parameterArgument);
                imaginaryPart = 0;
                //4
            }else{
                if(parameterArgument.equals("i")){
                    realPart = 0;
                    imaginaryPart = 1;
                }else{
                    realPart = 0;
                    imaginaryPart = Integer.parseInt(parameterArgument.substring(0,parameterArgument.lastIndexOf("i")));
                }
            }
        }catch(NumberFormatException e){
            throw new NumberFormatException("Incorect input");
        }
    }

    public int getRealPart() {
        return realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void printComplexNumber(){
        System.out.println(realPart + " " + imaginaryPart + "i");
    }

    public void add(ComplexNumber input) {
        this.realPart+= input.realPart;
        this.imaginaryPart+=input.imaginaryPart;
    }

    public void substract(ComplexNumber input) {
        this.realPart-= input.realPart;
        this.imaginaryPart-= input.imaginaryPart;
    }
}
