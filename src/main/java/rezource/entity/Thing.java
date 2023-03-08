package rezource.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Thing extends Rezource {
  private double cleaningFee;
  private int sizeInFeet;
  private int people;
  private String style;
  private int year;
  private String manufacturer;
  private String model;
}
