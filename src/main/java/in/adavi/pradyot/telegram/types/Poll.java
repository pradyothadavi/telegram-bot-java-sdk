package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * https://core.telegram.org/bots/api#poll
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Poll {

  private String id;

  private String question;

  private List<PollOption> options;

  private Integer totalVoterCount;

  private Boolean isClosed;

  private Boolean isAnonymous;

  private String type;

  private Boolean allowsMultipleAnswers;

  private Integer correctOptionId;

  private String explanation;

  private List<MessageEntity> explanationEntities;

  private Integer openPeriod;

  private Integer closeDate;
}
