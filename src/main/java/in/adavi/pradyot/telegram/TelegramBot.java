package in.adavi.pradyot.telegram;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.adavi.pradyot.telegram.request.Update;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelegramBot {
  
  private TelegramBotConfig telegramBotConfig;
  
  public Update getUpdate(String updateStr) throws IOException {
    Update update = new ObjectMapper().readValue(updateStr,Update.class);
    return update;
  }
}
