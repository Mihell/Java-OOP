import java.util.ArrayList;

public class Lines {
    private ArrayList<Line> lines = new ArrayList<>();

    public Lines() {
        super();
    }

    public void addLine(Line line){
        lines.add(line);
    }

    public double getTotalLength(){
        double total = 0;
        for(Line line : lines){
            total += line.getLength();
        }
        return total;
    }

    public Line getLongestLine(){
        if(lines.size() == 0){
            return null;
        } else{
            Line longest = lines.get(0);
            for(Line line : lines){
                longest = (line.getLength() > longest.getLength()) ? line : longest;
            }
            return longest;
        }
    }

    @Override
    public String toString() {
        return "Lines{" +
                "lines=" + lines +
                '}';
    }

}
