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
import example.micronaut.model.TweetComplianceSchemaTweet;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * TweetComplianceSchema
 */
@JsonPropertyOrder({
  TweetComplianceSchema.JSON_PROPERTY_EVENT_AT,
  TweetComplianceSchema.JSON_PROPERTY_QUOTE_TWEET_ID,
  TweetComplianceSchema.JSON_PROPERTY_TWEET
})
@JsonTypeName("TweetComplianceSchema")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetComplianceSchema {
    public static final String JSON_PROPERTY_EVENT_AT = "event_at";
    private OffsetDateTime eventAt;

    public static final String JSON_PROPERTY_QUOTE_TWEET_ID = "quote_tweet_id";
    private String quoteTweetId;

    public static final String JSON_PROPERTY_TWEET = "tweet";
    private TweetComplianceSchemaTweet tweet;

    public TweetComplianceSchema(OffsetDateTime eventAt, TweetComplianceSchemaTweet tweet) {
        this.eventAt = eventAt;
        this.tweet = tweet;
    }

    public TweetComplianceSchema eventAt(OffsetDateTime eventAt) {
        this.eventAt = eventAt;
        return this;
    }

    /**
     * Event time.
     * @return eventAt
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_EVENT_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getEventAt() {
        return eventAt;
    }

    @JsonProperty(JSON_PROPERTY_EVENT_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setEventAt(OffsetDateTime eventAt) {
        this.eventAt = eventAt;
    }

    public TweetComplianceSchema quoteTweetId(String quoteTweetId) {
        this.quoteTweetId = quoteTweetId;
        return this;
    }

    /**
     * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
     * @return quoteTweetId
     **/
    @Nullable
    @Pattern(regexp="^[0-9]{1,19}$")
    @JsonProperty(JSON_PROPERTY_QUOTE_TWEET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getQuoteTweetId() {
        return quoteTweetId;
    }

    @JsonProperty(JSON_PROPERTY_QUOTE_TWEET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuoteTweetId(String quoteTweetId) {
        this.quoteTweetId = quoteTweetId;
    }

    public TweetComplianceSchema tweet(TweetComplianceSchemaTweet tweet) {
        this.tweet = tweet;
        return this;
    }

    /**
     * Get tweet
     * @return tweet
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_TWEET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TweetComplianceSchemaTweet getTweet() {
        return tweet;
    }

    @JsonProperty(JSON_PROPERTY_TWEET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTweet(TweetComplianceSchemaTweet tweet) {
        this.tweet = tweet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetComplianceSchema tweetComplianceSchema = (TweetComplianceSchema) o;
        return Objects.equals(this.eventAt, tweetComplianceSchema.eventAt) &&
            Objects.equals(this.quoteTweetId, tweetComplianceSchema.quoteTweetId) &&
            Objects.equals(this.tweet, tweetComplianceSchema.tweet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventAt, quoteTweetId, tweet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetComplianceSchema {\n");
        sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
        sb.append("    quoteTweetId: ").append(toIndentedString(quoteTweetId)).append("\n");
        sb.append("    tweet: ").append(toIndentedString(tweet)).append("\n");
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
