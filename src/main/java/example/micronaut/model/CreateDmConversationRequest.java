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
import example.micronaut.model.CreateMessageRequest;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CreateDmConversationRequest
 */
@JsonPropertyOrder({
  CreateDmConversationRequest.JSON_PROPERTY_CONVERSATION_TYPE,
  CreateDmConversationRequest.JSON_PROPERTY_MESSAGE,
  CreateDmConversationRequest.JSON_PROPERTY_PARTICIPANT_IDS
})
@JsonTypeName("CreateDmConversationRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class CreateDmConversationRequest {
    /**
     * The conversation type that is being created.
     */
    public enum ConversationTypeEnum {
        GROUP("Group");

        private String value;

        ConversationTypeEnum(String value) {
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
        public static ConversationTypeEnum fromValue(String value) {
            for (ConversationTypeEnum b : ConversationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_CONVERSATION_TYPE = "conversation_type";
    private ConversationTypeEnum conversationType;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private CreateMessageRequest message;

    public static final String JSON_PROPERTY_PARTICIPANT_IDS = "participant_ids";
    private List<String> participantIds = new ArrayList<>();

    public CreateDmConversationRequest(ConversationTypeEnum conversationType, CreateMessageRequest message, List<String> participantIds) {
        this.conversationType = conversationType;
        this.message = message;
        this.participantIds = participantIds;
    }

    public CreateDmConversationRequest conversationType(ConversationTypeEnum conversationType) {
        this.conversationType = conversationType;
        return this;
    }

    /**
     * The conversation type that is being created.
     * @return conversationType
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_CONVERSATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ConversationTypeEnum getConversationType() {
        return conversationType;
    }

    @JsonProperty(JSON_PROPERTY_CONVERSATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setConversationType(ConversationTypeEnum conversationType) {
        this.conversationType = conversationType;
    }

    public CreateDmConversationRequest message(CreateMessageRequest message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateMessageRequest getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMessage(CreateMessageRequest message) {
        this.message = message;
    }

    public CreateDmConversationRequest participantIds(List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }

    public CreateDmConversationRequest addParticipantIdsItem(String participantIdsItem) {
        this.participantIds.add(participantIdsItem);
        return this;
    }

    /**
     * Participants for the DM Conversation.
     * @return participantIds
     **/
    @NotNull
    @Size(min=2, max=49)
    @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getParticipantIds() {
        return participantIds;
    }

    @JsonProperty(JSON_PROPERTY_PARTICIPANT_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setParticipantIds(List<String> participantIds) {
        this.participantIds = participantIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDmConversationRequest createDmConversationRequest = (CreateDmConversationRequest) o;
        return Objects.equals(this.conversationType, createDmConversationRequest.conversationType) &&
            Objects.equals(this.message, createDmConversationRequest.message) &&
            Objects.equals(this.participantIds, createDmConversationRequest.participantIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversationType, message, participantIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDmConversationRequest {\n");
        sb.append("    conversationType: ").append(toIndentedString(conversationType)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    participantIds: ").append(toIndentedString(participantIds)).append("\n");
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
