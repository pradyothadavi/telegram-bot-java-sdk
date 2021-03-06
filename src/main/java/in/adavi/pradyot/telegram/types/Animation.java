package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * https://core.telegram.org/bots/api#animation
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Animation {

  private String fileId;

  private String fileUniqueId;

  private Integer width;

  private Integer height;

  private Integer duration;

  private PhotoSize thumb;

  private String fileName;

  private String mimeType;

  private Integer fileSize;

}
