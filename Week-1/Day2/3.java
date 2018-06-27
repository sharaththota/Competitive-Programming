public class TempTracker {

    
    int[] occurrences = new int[111]; 
    int maxOccurrences = 0;
    Integer mode;

    
    int totalNumbers = 0;
    double totalSum = 0.0; 
    Double mean;

    
    Integer minTemp;
    Integer maxTemp;

    public boolean insert(int temperature) {

        
        occurrences[temperature]++;
        if (occurrences[temperature] > maxOccurrences) {
            mode = temperature;
            maxOccurrences = occurrences[temperature];
        }

        
        totalNumbers++;
        totalSum += temperature;
        mean = totalSum / totalNumbers;

        
        if (maxTemp == null || temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (minTemp == null || temperature < minTemp) {
            minTemp = temperature;
        }

        return true;
    }

    public Integer getMax() {
        return maxTemp;
    }

    public Integer getMin() {
        return minTemp;
    }

    public Double getMean() {
        return mean;
    }

    public Integer getMode() {
        return mode;
    }
}
