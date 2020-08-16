package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * https://core.telegram.org/bots/api#chatmember
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ChatMember {

  private User user;

  private String status;

  private String customTitle;

  private Integer untilDate;

  private Boolean canBeEdited;

  private Boolean canPostMessages;

  private Boolean canEditMessages;

  private Boolean canDeleteMessages;

  private Boolean canRestrictMembers;

  private Boolean canPromoteMembers;

  private Boolean canChangeInfo;

  private Boolean canInviteUsers;

  private Boolean canPinMessages;

  private Boolean isMember;

  private Boolean canSendMessages;

  private Boolean canSendMediaMessages;

  private Boolean canSendPolls;

  private Boolean canSendOtherMessages;

  private Boolean canAddWebPagePreviews;

}
