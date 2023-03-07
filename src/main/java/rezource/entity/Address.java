package rezource.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
  private long addressId;
  private String addr1;
  private String addr2;
  private String city;
  private String state;
  private String province;
  private String postalCode;
  private String country;
  private char billing;
  private char delivery;
  private long rezourceId;
  private long personId;
}
