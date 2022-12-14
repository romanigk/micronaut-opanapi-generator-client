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
 * Tweet information of the Tweet being replied to.
 */
@JsonPropertyOrder({
  TweetCreateRequestReply.JSON_PROPERTY_EXCLUDE_REPLY_USER_IDS,
  TweetCreateRequestReply.JSON_PROPERTY_IN_REPLY_TO_TWEET_ID
})
@JsonTypeName("TweetCreateRequest_reply")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetCreateRequestReply {
    public static final String JSON_PROPERTY_EXCLUDE_REPLY_USER_IDS = "exclude_reply_user_ids";
    private List<String> excludeReplyUserIds = null;

    public static final String JSON_PROPERTY_IN_REPLY_TO_TWEET_ID = "in_reply_to_tweet_id";
    private String inReplyToTweetId;

    public TweetCreateRequestReply(String inReplyToTweetId) {
        this.inReplyToTweetId = inReplyToTweetId;
    }

    public TweetCreateRequestReply excludeReplyUserIds(List<String> excludeReplyUserIds) {
        this.excludeReplyUserIds = excludeReplyUserIds;
        return this;
    }

    public TweetCreateRequestReply addExcludeReplyUserIdsItem(String excludeReplyUserIdsItem) {
        if (this.excludeReplyUserIds == null) {
            this.excludeReplyUserIds = new ArrayList<>();
        }
        this.excludeReplyUserIds.add(excludeReplyUserIdsItem);
        return this;
    }

    /**
     * A list of User Ids to be excluded from the reply Tweet.
     * @return excludeReplyUserIds
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXCLUDE_REPLY_USER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getExcludeReplyUserIds() {
        return excludeReplyUserIds;
    }

    @JsonProperty(JSON_PROPERTY_EXCLUDE_REPLY_USER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExcludeReplyUserIds(List<String> excludeReplyUserIds) {
        this.excludeReplyUserIds = excludeReplyUserIds;
    }

    public TweetCreateRequestReply inReplyToTweetId(String inReplyToTweetId) {
        this.inReplyToTweetId = inReplyToTweetId;
        return this;
    }

    /**
     * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
     * @return inReplyToTweetId
     **/
    @NotNull
    @Pattern(regexp="^[0-9]{1,19}$")
    @JsonProperty(JSON_PROPERTY_IN_REPLY_TO_TWEET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getInReplyToTweetId() {
        return inReplyToTweetId;
    }

    @JsonProperty(JSON_PROPERTY_IN_REPLY_TO_TWEET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInReplyToTweetId(String inReplyToTweetId) {
        this.inReplyToTweetId = inReplyToTweetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetCreateRequestReply tweetCreateRequestReply = (TweetCreateRequestReply) o;
        return Objects.equals(this.excludeReplyUserIds, tweetCreateRequestReply.excludeReplyUserIds) &&
            Objects.equals(this.inReplyToTweetId, tweetCreateRequestReply.inReplyToTweetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeReplyUserIds, inReplyToTweetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetCreateRequestReply {\n");
        sb.append("    excludeReplyUserIds: ").append(toIndentedString(excludeReplyUserIds)).append("\n");
        sb.append("    inReplyToTweetId: ").append(toIndentedString(inReplyToTweetId)).append("\n");
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
