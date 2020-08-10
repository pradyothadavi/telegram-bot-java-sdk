package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Audio {

  private String fileId;

  private String fileUniqueId;

  private Integer duration;

  private String performer;

  private String title;

  private String mimeType;

  private Integer fileSize;

  private PhotoSize thumb;
}
