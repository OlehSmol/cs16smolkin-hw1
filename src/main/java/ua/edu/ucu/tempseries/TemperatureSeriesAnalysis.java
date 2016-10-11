package ua.edu.ucu.tempseries;

import java.util.Map;

public class TemperatureSeriesAnalysis {

    double[] temperatures;

    public TemperatureSeriesAnalysis() {

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        temperatures = temperatureSeries;
    }

    public double average() {
        if(temperatures.length == 0){
            throw new IllegalArgumentException();
        }

        double sum = 0;

        for(int i = 0; i < temperatures.length; i++){
            sum += temperatures[i];
        }

        return sum/temperatures.length;
    }

    public double deviation() {
        double sum = 0;
        double averageVal = average();

        for(int i = 0; i < temperatures.length; i++){
            sum += Math.pow(temperatures[i] - averageVal, 2);
        }

        return Math.sqrt(sum/temperatures.length);
    }

    public double min() {
        if(temperatures.length == 0){
            throw new IllegalArgumentException();
        }
        double minimum = temperatures[0];

        for(int i = 1; i < temperatures.length; i++){
            if(temperatures[i] < minimum){
                minimum = temperatures[i];
            }
        }
        return minimum;
    }

    public double max() {
        if(temperatures.length == 0){
            throw new IllegalArgumentException();
        }
        double maximum = temperatures[0];

        for(int i = 1; i < temperatures.length; i++){
            if(temperatures[i] > maximum){
                maximum = temperatures[i];
            }
        }
        return maximum;
    }

    public double findTempClosestToZero() {
        if(temperatures.length == 0){
            throw new IllegalArgumentException();
        }
        double closest = temperatures[0];

        for(int i = 1; i < temperatures.length; i++){
            if(Math.abs(closest) < Math.abs(temperatures[i]) ||
                    (Math.abs(closest) == Math.abs(temperatures[i]) && temperatures[i] > 0)){
                closest = temperatures[i];
            }
        }
        return closest;
    }

    public double findTempClosestToValue(double tempValue) {
        if(temperatures.length == 0){
            throw new IllegalArgumentException();
        }
        double closest = temperatures[0];

        for(int i = 1; i < temperatures.length; i++){
            if(Math.abs(closest - tempValue) < Math.abs(temperatures[i] - tempValue) ||
                    (Math.abs(closest - tempValue) == Math.abs(temperatures[i] - tempValue)
                            && temperatures[i] >  tempValue)){
                closest = temperatures[i];
            }
        }
        return closest;
    }

    public double[] findTempsLessThen(double tempValue) {
        return null;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        return null;
    }

    public TempSummaryStatistics summaryStatistics() {
        double avg = average();
        double dev = deviation();
        double minimum = min();
        double maximum = max();

        return new TempSummaryStatistics(avg, dev, minimum, maximum);
    }

    public int addTemps(double... temps) {
        return 0;
    }
}
