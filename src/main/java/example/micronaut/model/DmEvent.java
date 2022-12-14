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
import example.micronaut.model.DmEventAttachments;
import example.micronaut.model.DmEventReferencedTweetsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * DmEvent
 */
@JsonPropertyOrder({
  DmEvent.JSON_PROPERTY_ATTACHMENTS,
  DmEvent.JSON_PROPERTY_CREATED_AT,
  DmEvent.JSON_PROPERTY_DM_CONVERSATION_ID,
  DmEvent.JSON_PROPERTY_EVENT_TYPE,
  DmEvent.JSON_PROPERTY_ID,
  DmEvent.JSON_PROPERTY_PARTICIPANT_IDS,
  DmEvent.JSON_PROPERTY_REFERENCED_TWEETS,
  DmEvent.JSON_PROPERTY_SENDER_ID,
  DmEvent.JSON_PROPERTY_TEXT
})
@JsonTypeName("DmEvent")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class DmEvent {
    public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
    private DmEventAttachments attachments;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_DM_CONVERSATION_ID = "dm_conversation_id";
    private String dmConversationId;

    public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
    private String eventType;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_PARTICIPANT_IDS = "participant_ids";
    private List<String> participantIds = null;

    public static final String JSON_PROPERTY_REFERENCED_TWEETS = "referenced_tweets";
    private List<DmEventReferencedTweetsInner> referencedTweets = null;

    public static final String JSON_PROPERTY_SENDER_ID = "sender_id";
    private String senderId;

    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public DmEvent(String eventType, String id) {
        this.eventType = eventType;
        this.id = id;
    }

    public DmEvent attachments(DmEventAttachments attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Get attachments
     * @return attachments
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DmEventAttachments getAttachments() {
        return attachments;
    }

    @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAttachments(DmEventAttachments attachments) {
        this.attachments = attachments;
    }

    public DmEvent createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DmEvent dmConversationId(String dmConversationId) {
        this.dmConversationId = dmConversationId;
        return this;
    }

    /**
     * Unique identifier of a DM conversation. This can either be a numeric string, or a pair of numeric strings separated by a &#39;-&#39; character in the case of one-on-one DM Conversations.
     * @return dmConversationId
     **/
    @Nullable
    @Pattern(regexp="^([0-9]{1,19}-[0-9]{1,19}|[0-9]{15,19})$")
    @JsonProperty(JSON_PROPERTY_DM_CONVERSATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDmConversationId() {
        return dmConversationId;
    }

    @JsonProperty(JSON_PROPERTY_DM_CONVERSATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDmConversationId(String dmConversationId) {
        this.dmConversationId = dmConversationId;
    }

    public DmEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get eventType
     * @return eventType
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getEventType() {
        return eventType;
    }

    @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public DmEvent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of a DM Event.
     * @return id
     **/
    @NotNull
    @Pattern(regexp="^[0-9]{1,19}$")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public DmEvent participantIds(List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }

    public DmEvent addParticipantIdsItem(String participantIdsItem) {
        if (this.participantIds == null) {
            this.participantIds = new ArrayList<>();
        }
        this.participantIds.add(participantIdsItem);
        return this;
    }

    /**
     * A list of participants for a ParticipantsJoin or ParticipantsLeave event_type.
     * @return participantIds
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getParticipantIds() {
        return participantIds;
    }

    @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParticipantIds(List<String> participantIds) {
        this.participantIds = participantIds;
    }

    public DmEvent referencedTweets(List<DmEventReferencedTweetsInner> referencedTweets) {
        this.referencedTweets = referencedTweets;
        return this;
    }

    public DmEvent addReferencedTweetsItem(DmEventReferencedTweetsInner referencedTweetsItem) {
        if (this.referencedTweets == null) {
            this.referencedTweets = new ArrayList<>();
        }
        this.referencedTweets.add(referencedTweetsItem);
        return this;
    }

    /**
     * A list of Tweets this DM refers to.
     * @return referencedTweets
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_REFERENCED_TWEETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<DmEventReferencedTweetsInner> getReferencedTweets() {
        return referencedTweets;
    }

    @JsonProperty(JSON_PROPERTY_REFERENCED_TWEETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReferencedTweets(List<DmEventReferencedTweetsInner> referencedTweets) {
        this.referencedTweets = referencedTweets;
    }

    public DmEvent senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
     * @return senderId
     **/
    @Nullable
    @Pattern(regexp="^[0-9]{1,19}$")
    @JsonProperty(JSON_PROPERTY_SENDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSenderId() {
        return senderId;
    }

    @JsonProperty(JSON_PROPERTY_SENDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public DmEvent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     * @return text
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DmEvent dmEvent = (DmEvent) o;
        return Objects.equals(this.attachments, dmEvent.attachments) &&
            Objects.equals(this.createdAt, dmEvent.createdAt) &&
            Objects.equals(this.dmConversationId, dmEvent.dmConversationId) &&
            Objects.equals(this.eventType, dmEvent.eventType) &&
            Objects.equals(this.id, dmEvent.id) &&
            Objects.equals(this.participantIds, dmEvent.participantIds) &&
            Objects.equals(this.referencedTweets, dmEvent.referencedTweets) &&
            Objects.equals(this.senderId, dmEvent.senderId) &&
            Objects.equals(this.text, dmEvent.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments, createdAt, dmConversationId, eventType, id, participantIds, referencedTweets, senderId, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DmEvent {\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    dmConversationId: ").append(toIndentedString(dmConversationId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    participantIds: ").append(toIndentedString(participantIds)).append("\n");
        sb.append("    referencedTweets: ").append(toIndentedString(referencedTweets)).append("\n");
        sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
