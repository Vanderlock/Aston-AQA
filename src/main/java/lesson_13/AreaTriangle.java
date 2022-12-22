package lesson_13;

public class AreaTriangle {

    public double areaOfTheTriangle(double firstSideTriangle, double secondSideTriangle, double thirdSideTriangle){
        if(firstSideTriangle <= 0 || secondSideTriangle <= 0 || thirdSideTriangle <= 0){
            throw new IllegalArgumentException("Incorrect side error");
        }
        if(firstSideTriangle + secondSideTriangle <= thirdSideTriangle || firstSideTriangle + thirdSideTriangle <= secondSideTriangle ||
        thirdSideTriangle + secondSideTriangle <= firstSideTriangle){
            throw new IllegalArgumentException("A triangle exists if and only if the sum of any two of its sides is greater than the third side");
        }
        double areaTriangle;
        double triangle;
        triangle = (firstSideTriangle + secondSideTriangle + thirdSideTriangle) / 2;
        areaTriangle = Math.sqrt(triangle*(triangle - firstSideTriangle)*(triangle - secondSideTriangle) * (triangle - thirdSideTriangle));
        return (double) Math.round(areaTriangle * 100) / 100;
    }
}