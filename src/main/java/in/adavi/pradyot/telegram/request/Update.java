package in.adavi.pradyot.telegram.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import in.adavi.pradyot.telegram.inlinemode.ChosenInlineResult;
import in.adavi.pradyot.telegram.inlinemode.InlineQuery;
import in.adavi.pradyot.telegram.payments.ShippingQuery;
import in.adavi.pradyot.telegram.types.*;
import lombok.Data;

/**
 * https://core.telegram.org/bots/api#getting-updates
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class Update {

  private Integer updateId;

  private Message message;

  private Message editedMessage;

  private Message channelPost;

  private Message editedChannelPost;

  private InlineQuery inlineQuery;

  private ChosenInlineResult chosenInlineResult;

  private CallbackQuery callbackQuery;

  private ShippingQuery shippingQuery;

  private PreCheckoutQuery preCheckoutQuery;

  private Poll poll;

  private PollAnswer pollAnswer;
}
