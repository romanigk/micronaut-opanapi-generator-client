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
 * Specifies the type of attachments (if any) present in this Tweet.
 */
@JsonPropertyOrder({
  TweetAttachments.JSON_PROPERTY_MEDIA_KEYS,
  TweetAttachments.JSON_PROPERTY_POLL_IDS
})
@JsonTypeName("Tweet_attachments")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetAttachments {
    public static final String JSON_PROPERTY_MEDIA_KEYS = "media_keys";
    private List<String> mediaKeys = null;

    public static final String JSON_PROPERTY_POLL_IDS = "poll_ids";
    private List<String> pollIds = null;

    public TweetAttachments() {
    }

    public TweetAttachments mediaKeys(List<String> mediaKeys) {
        this.mediaKeys = mediaKeys;
        return this;
    }

    public TweetAttachments addMediaKeysItem(String mediaKeysItem) {
        if (this.mediaKeys == null) {
            this.mediaKeys = new ArrayList<>();
        }
        this.mediaKeys.add(mediaKeysItem);
        return this;
    }

    /**
     * A list of Media Keys for each one of the media attachments (if media are attached).
     * @return mediaKeys
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_MEDIA_KEYS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getMediaKeys() {
        return mediaKeys;
    }

    @JsonProperty(JSON_PROPERTY_MEDIA_KEYS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMediaKeys(List<String> mediaKeys) {
        this.mediaKeys = mediaKeys;
    }

    public TweetAttachments pollIds(List<String> pollIds) {
        this.pollIds = pollIds;
        return this;
    }

    public TweetAttachments addPollIdsItem(String pollIdsItem) {
        if (this.pollIds == null) {
            this.pollIds = new ArrayList<>();
        }
        this.pollIds.add(pollIdsItem);
        return this;
    }

    /**
     * A list of poll IDs (if polls are attached).
     * @return pollIds
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_POLL_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getPollIds() {
        return pollIds;
    }

    @JsonProperty(JSON_PROPERTY_POLL_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPollIds(List<String> pollIds) {
        this.pollIds = pollIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetAttachments tweetAttachments = (TweetAttachments) o;
        return Objects.equals(this.mediaKeys, tweetAttachments.mediaKeys) &&
            Objects.equals(this.pollIds, tweetAttachments.pollIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaKeys, pollIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetAttachments {\n");
        sb.append("    mediaKeys: ").append(toIndentedString(mediaKeys)).append("\n");
        sb.append("    pollIds: ").append(toIndentedString(pollIds)).append("\n");
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
