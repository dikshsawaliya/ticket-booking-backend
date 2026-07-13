package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId;
    private String trainNo;
    private List<List<Integer>> trainSeats;
    private Map<String, Time> stationTimes;
    private List<String> stationsNames;
}
