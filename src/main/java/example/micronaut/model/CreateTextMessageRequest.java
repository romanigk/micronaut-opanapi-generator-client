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
import example.micronaut.model.DmMediaAttachment;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CreateTextMessageRequest
 */
@JsonPropertyOrder({
  CreateTextMessageRequest.JSON_PROPERTY_ATTACHMENTS,
  CreateTextMessageRequest.JSON_PROPERTY_TEXT
})
@JsonTypeName("CreateTextMessageRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class CreateTextMessageRequest {
    public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
    private List<DmMediaAttachment> attachments = null;

    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public CreateTextMessageRequest(String text) {
        this.text = text;
    }

    public CreateTextMessageRequest attachments(List<DmMediaAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public CreateTextMessageRequest addAttachmentsItem(DmMediaAttachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * Attachments to a DM Event.
     * @return attachments
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<DmMediaAttachment> getAttachments() {
        return attachments;
    }

    @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAttachments(List<DmMediaAttachment> attachments) {
        this.attachments = attachments;
    }

    public CreateTextMessageRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Text of the message.
     * @return text
     **/
    @NotNull
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
        CreateTextMessageRequest createTextMessageRequest = (CreateTextMessageRequest) o;
        return Objects.equals(this.attachments, createTextMessageRequest.attachments) &&
            Objects.equals(this.text, createTextMessageRequest.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTextMessageRequest {\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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