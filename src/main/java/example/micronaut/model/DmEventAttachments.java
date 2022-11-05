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
 * Specifies the type of attachments (if any) present in this DM.
 */
@JsonPropertyOrder({
  DmEventAttachments.JSON_PROPERTY_CARD_IDS,
  DmEventAttachments.JSON_PROPERTY_MEDIA_KEYS
})
@JsonTypeName("DmEvent_attachments")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class DmEventAttachments {
    public static final String JSON_PROPERTY_CARD_IDS = "card_ids";
    private List<String> cardIds = null;

    public static final String JSON_PROPERTY_MEDIA_KEYS = "media_keys";
    private List<String> mediaKeys = null;

    public DmEventAttachments() {
    }

    public DmEventAttachments cardIds(List<String> cardIds) {
        this.cardIds = cardIds;
        return this;
    }

    public DmEventAttachments addCardIdsItem(String cardIdsItem) {
        if (this.cardIds == null) {
            this.cardIds = new ArrayList<>();
        }
        this.cardIds.add(cardIdsItem);
        return this;
    }

    /**
     * A list of card IDs (if cards are attached).
     * @return cardIds
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_CARD_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getCardIds() {
        return cardIds;
    }

    @JsonProperty(JSON_PROPERTY_CARD_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCardIds(List<String> cardIds) {
        this.cardIds = cardIds;
    }

    public DmEventAttachments mediaKeys(List<String> mediaKeys) {
        this.mediaKeys = mediaKeys;
        return this;
    }

    public DmEventAttachments addMediaKeysItem(String mediaKeysItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DmEventAttachments dmEventAttachments = (DmEventAttachments) o;
        return Objects.equals(this.cardIds, dmEventAttachments.cardIds) &&
            Objects.equals(this.mediaKeys, dmEventAttachments.mediaKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardIds, mediaKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DmEventAttachments {\n");
        sb.append("    cardIds: ").append(toIndentedString(cardIds)).append("\n");
        sb.append("    mediaKeys: ").append(toIndentedString(mediaKeys)).append("\n");
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