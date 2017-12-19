public class LineCalc {

    public double lineLength(Line2D line){
        double powX = Math.pow((line.getPointX2() - line.getPointX1()),2);
        double powY = Math.pow((line.getPointY2() - line.getPointY1()),2);
        double score = Math.sqrt(powX + powY);
        return score;
    }
}
