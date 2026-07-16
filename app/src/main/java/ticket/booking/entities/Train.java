package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId;
    private String trainNo;
    private List<List<Integer>> trainSeats;
    private Map<String, String> stationTimes;
    private List<String> stationsNames;

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public List<List<Integer>> getTrainSeats() {
        return trainSeats;
    }

    public void setTrainSeats(List<List<Integer>> trainSeats) {
        this.trainSeats = trainSeats;
    }

    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public void setStationTimes(Map<String, String> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public List<String> getStationsNames() {
        return stationsNames;
    }

    public void setStationsNames(List<String> stationsNames) {
        this.stationsNames = stationsNames;
    }

    public void getTrainInfo(){
        System.out.println("Train no is" + trainNo + "Train id is " + trainId);
    }
}
