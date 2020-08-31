package in.adavi.pradyot.telegram;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.adavi.pradyot.telegram.request.Update;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;

@Data
@Builder
public class TelegramBot {

  private TelegramBotConfig telegramBotConfig;

  public Update getWebHookUpdate(String updateStr) throws IOException {
    Update update = new ObjectMapper().readValue(updateStr, Update.class);
    return update;
  }

  public Boolean isValidWebHookRequest(String token) {
    if (null == telegramBotConfig || telegramBotConfig.getWebHookToken().isEmpty())
      return false;
    return telegramBotConfig.getWebHookToken().equals(token);
  }
}
