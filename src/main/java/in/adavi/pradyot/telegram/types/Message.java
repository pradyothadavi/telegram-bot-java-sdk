package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Message {

	private Integer messageId;

	private User from;

	private Integer date;

	private Chat chat;

	private User forwardFrom;

	private Chat forwardFromChat;

	private Integer forwardFromMessageId;

	private String forwardSignature;

	private String forwardSenderName;

	private Integer forwardDate;

	private Message replyToMessage;

	private User viaBot;

	private Integer editDate;

	private String mediaGroupId;

	private String authorSignature;

	private String text;

	private List<MessageEntity> entities;

	private Animation animation;

	private Audio audio;

	private Document document;

	private List<PhotoSize> photo;

	private Sticker sticker;

	private Video video;

	private VideoNote videoNote;

	private Voice voice;

	private String caption;

	private List<MessageEntity> captionEntities;

	private Contact contact;

	private Dice dice;

	private Game game;

	private Poll poll;

	private Venue venue;

	private Location location;

	private List<User> newChatMembers;

	private User leftChatMember;

	private String newChatTitle;

	private List<PhotoSize> newChatPhoto;

	private Boolean deleteChatPhoto;

	private Boolean groupChatCreated;

	private Boolean supergroupChatCreated;

	private Boolean channelChatCreated;

	private Integer migrateToChatId;

	private Integer migrateFromChatId;

	private Message pinnedMessage;

	private Invoice invoice;

	private SuccessfulPayment successfulPayment;

	private String connectedWebsite;

	private PassportData passportData;

	private InlineKeyboardMarkup replyMarkup;
}
