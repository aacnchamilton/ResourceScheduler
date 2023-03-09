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
  private Long addressId;
  private Long rezourceId;
  private Long personId;
  private String addr1;
  private String addr2;
  private String city;
  private String state;
  private String province;
  private String postalCode;
  private String country;
  private char billing;
  private char delivery;
}
