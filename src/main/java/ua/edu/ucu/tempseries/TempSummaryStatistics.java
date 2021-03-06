package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    final private double avgTemp;
    final private double devTemp;
    final private double minTemp;
    final private double  maxTemp;

    public TempSummaryStatistics(double avg, double dev, double min, double max) {
        avgTemp = avg;
        devTemp = dev;
        minTemp = min;
        maxTemp = max;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public double getDevTemp() {
        return devTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

}
