package Com.mobilePhone;

import java.time.LocalDateTime;

public class Connection {
    private int destinationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Connection(int destinationId) {
        this.destinationId = destinationId;
    }

    public Connection(int destinationId, LocalDateTime startTime) {
        this.destinationId = destinationId;
        this.startTime = startTime;
    }

    public Connection(int destinationId, LocalDateTime startTime, LocalDateTime endTime) {
        this.destinationId = destinationId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
