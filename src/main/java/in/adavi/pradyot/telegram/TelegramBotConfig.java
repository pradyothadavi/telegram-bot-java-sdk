package in.adavi.pradyot.telegram;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TelegramBotConfig {
  private String botToken;
  private String webHookToken;
}
