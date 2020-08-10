package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class PreCheckoutQuery {

  private String id;

  private User from;

  private String currency;

  private Integer totalAmount;

  private String invoicePayload;

  private String shippingOptionId;

  private OrderInfo orderInfo;
}
