package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ChatPermissions {

  private Boolean canSendMessages;

  private Boolean canSendMediaMessages;

  private Boolean canSendPolls;

  private Boolean canSendOtherMessages;

  private Boolean canAddWebPagePreviews;

  private Boolean canChangeInfo;

  private Boolean canInviteUsers;

  private Boolean canPinMessages;
}
