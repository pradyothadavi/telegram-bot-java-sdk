package in.adavi.pradyot.telegram.inlinemode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import in.adavi.pradyot.telegram.types.Location;
import in.adavi.pradyot.telegram.types.User;
import lombok.Data;

/**
 * https://core.telegram.org/bots/api#choseninlineresult
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ChosenInlineResult {

  private String resultId;

  private User from;

  private Location location;

  private String inlineMessageId;

  private String query;
}
