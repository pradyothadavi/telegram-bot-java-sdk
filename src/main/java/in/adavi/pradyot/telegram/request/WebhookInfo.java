package in.adavi.pradyot.telegram.request;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * https://core.telegram.org/bots/api#webhookinfo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class WebhookInfo {

  private String url;

  private Boolean hasCustomCertificate;

  private Integer pendingUpdateCount;

  private Integer lastErrorDate;

  private String lastErrorMessage;

  private Integer maxConnections;

  private List<String> allowedUpdates;
}
