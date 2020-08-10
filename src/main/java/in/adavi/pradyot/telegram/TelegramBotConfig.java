package in.adavi.pradyot.telegram;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TelegramBotConfig {
  
  private final String botToken;
  
}
