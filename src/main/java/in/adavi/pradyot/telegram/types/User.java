package in.adavi.pradyot.telegram.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class User {

	private String id;

	private Boolean isBot;

	private String firstName;

	private String lastName;

	private String username;

	private String languageCode;

	private Boolean canJoinGroups;

	private Boolean canReadAllGroupMessages;

	private Boolean supportsInlineQueries;
}
