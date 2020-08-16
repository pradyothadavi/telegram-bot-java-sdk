package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * https://core.telegram.org/bots/api#contact
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Contact {

  private String phoneNumber;

  private String firstName;

  private String lastName;

  private Integer userId;

  private String vcard;
}
