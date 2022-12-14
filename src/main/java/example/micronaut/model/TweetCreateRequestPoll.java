/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.55
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package example.micronaut.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Poll options for a Tweet with a poll. This is mutually exclusive from Media, Quote Tweet Id, and Card URI.
 */
@JsonPropertyOrder({
  TweetCreateRequestPoll.JSON_PROPERTY_DURATION_MINUTES,
  TweetCreateRequestPoll.JSON_PROPERTY_OPTIONS,
  TweetCreateRequestPoll.JSON_PROPERTY_REPLY_SETTINGS
})
@JsonTypeName("TweetCreateRequest_poll")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetCreateRequestPoll {
    public static final String JSON_PROPERTY_DURATION_MINUTES = "duration_minutes";
    private Integer durationMinutes;

    public static final String JSON_PROPERTY_OPTIONS = "options";
    private List<String> options = new ArrayList<>();

    /**
     * Settings to indicate who can reply to the Tweet.
     */
    public enum ReplySettingsEnum {
        FOLLOWING("following"),
        MENTIONEDUSERS("mentionedUsers");

        private String value;

        ReplySettingsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReplySettingsEnum fromValue(String value) {
            for (ReplySettingsEnum b : ReplySettingsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_REPLY_SETTINGS = "reply_settings";
    private ReplySettingsEnum replySettings;

    public TweetCreateRequestPoll(Integer durationMinutes, List<String> options) {
        this.durationMinutes = durationMinutes;
        this.options = options;
    }

    public TweetCreateRequestPoll durationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
        return this;
    }

    /**
     * Duration of the poll in minutes.
     * minimum: 5
     * maximum: 10080
     * @return durationMinutes
     **/
    @NotNull
    @Min(5)
    @Max(10080)
    @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public TweetCreateRequestPoll options(List<String> options) {
        this.options = options;
        return this;
    }

    public TweetCreateRequestPoll addOptionsItem(String optionsItem) {
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Get options
     * @return options
     **/
    @NotNull
    @Size(min=2, max=4)
    @JsonProperty(JSON_PROPERTY_OPTIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getOptions() {
        return options;
    }

    @JsonProperty(JSON_PROPERTY_OPTIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOptions(List<String> options) {
        this.options = options;
    }

    public TweetCreateRequestPoll replySettings(ReplySettingsEnum replySettings) {
        this.replySettings = replySettings;
        return this;
    }

    /**
     * Settings to indicate who can reply to the Tweet.
     * @return replySettings
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REPLY_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ReplySettingsEnum getReplySettings() {
        return replySettings;
    }

    @JsonProperty(JSON_PROPERTY_REPLY_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReplySettings(ReplySettingsEnum replySettings) {
        this.replySettings = replySettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetCreateRequestPoll tweetCreateRequestPoll = (TweetCreateRequestPoll) o;
        return Objects.equals(this.durationMinutes, tweetCreateRequestPoll.durationMinutes) &&
            Objects.equals(this.options, tweetCreateRequestPoll.options) &&
            Objects.equals(this.replySettings, tweetCreateRequestPoll.replySettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durationMinutes, options, replySettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetCreateRequestPoll {\n");
        sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    replySettings: ").append(toIndentedString(replySettings)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
