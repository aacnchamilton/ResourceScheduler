package rezource.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
public class Place extends Rezource {
  private double cleaningFee;
  private int bedrooms;
  private int bathrooms;
  private int sizeInFeet;
  private int people;
  private int beds;
  private int style;
  private int year;
  private String addr1;
  private String addr2;
  private String city;
  private String state;
  private String province;
  private String postalCode;
  private String country;
}
