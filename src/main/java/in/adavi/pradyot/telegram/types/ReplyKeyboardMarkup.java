package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.sql.Array;
import java.util.List;

/**
 * https://core.telegram.org/bots/api#replykeyboardmarkup
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ReplyKeyboardMarkup {

  private List<List<KeyboardButton>> keyboard;

  private Boolean resizeKeyboard;

  private Boolean oneTimeKeyboard;

  private Boolean selective;
}
