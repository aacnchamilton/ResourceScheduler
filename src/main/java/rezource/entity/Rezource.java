package rezource.entity;

import java.time.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rezource {
  private long rezourceId;
  private String rezourceName;
  private String rezourceDescription;
  private RezourceType rezourceType;
  private long rezourcerId;
  private ScheduleType scheduleType;
  private Status status;
  private String keywords;
  private LocalTime startTime;
  private LocalTime endTime;
  private double regularRate;
  private double weekendRate;
  private double deposit;
  
}
