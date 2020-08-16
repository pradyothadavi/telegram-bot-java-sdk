package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * https://core.telegram.org/bots/api#video
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Video {

  private String fileId;

  private String fileUniqueId;

  private Integer width;

  private Integer height;

  private Integer duration;

  private PhotoSize thumb;

  private String mimeType;

  private Integer fileSize;
}
