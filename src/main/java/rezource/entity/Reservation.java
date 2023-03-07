package rezource.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
  private long reservationId;
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private LocalTime startTime;
  private LocalTime endTime;
  private int travelTime;
  private long rezourceId;
  private long schedulerId;
  private long addressId;
  private int numOfPeople;
  private String specialRequests;
  private ReservationStatus status;
}
