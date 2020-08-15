package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Chat {

	private String id;

	private String type;

	private String title;

	private String username;

	private String firstName;

	private String lastName;

	private ChatPhoto photo;

	private String description;

	private String inviteLink;

	private Message pinnedMessage;

	private ChatPermissions permissions;

	private Integer slowModeDelay;

	private String stickerSetName;

	private Boolean canSetStickerSet;
}
