package in.adavi.pradyot.telegram.payments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import in.adavi.pradyot.telegram.types.User;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ShippingQuery {

  private String id;

  private User from;

  private String invoicePayload;

  private ShippingAddress shippingAddress;
}
