import java.util.List;

/**
 * Created by cordu on 10/6/2018.
 */
public class Polygon {

    private List<ComplexNumber> points; // Polygon vertices (varfurile)

    public Polygon(List<ComplexNumber> points ){
        this.points = points;
    }

    /**
     * Luam cate 2 laturi din polygon si calculam distanta dintre ele -> latura si o adunam la perimetru
     * Cand ajungi la ultimul punct al polygonului trebuie sa il iei cu punctul initial ca sa calculezi latura
     * @return
     */
    public int getPerimeter(){
        int perimeter = 0;
        for(int i = 0 ; i < points.size() ; i++){
            if(i==points.size()-1){
                perimeter+=calculateDistance(points.get(i),points.get(0));
            }else {
                perimeter += calculateDistance(points.get(i), points.get(i + 1));
            }
        }
        return perimeter;
    }

    /**
     * Method calculates the distance between 2 points and returns the result .
     * returns sqrt((b.x-a.x)^2+(b.y-a.y)^2
     * @param a
     * @param b
     * @return
     */
    public double calculateDistance(ComplexNumber a,ComplexNumber b){
        return Math.sqrt((b.getRealPart()-a.getRealPart())*(b.getRealPart()-a.getRealPart())+(b.getImaginaryPart()-a.getImaginaryPart()*(b.getImaginaryPart()-a.getImaginaryPart())));
    }
}
