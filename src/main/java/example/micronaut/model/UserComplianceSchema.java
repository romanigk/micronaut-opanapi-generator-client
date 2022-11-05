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
import example.micronaut.model.UserComplianceSchemaUser;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * UserComplianceSchema
 */
@JsonPropertyOrder({
  UserComplianceSchema.JSON_PROPERTY_EVENT_AT,
  UserComplianceSchema.JSON_PROPERTY_USER
})
@JsonTypeName("UserComplianceSchema")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class UserComplianceSchema {
    public static final String JSON_PROPERTY_EVENT_AT = "event_at";
    private OffsetDateTime eventAt;

    public static final String JSON_PROPERTY_USER = "user";
    private UserComplianceSchemaUser user;

    public UserComplianceSchema(OffsetDateTime eventAt, UserComplianceSchemaUser user) {
        this.eventAt = eventAt;
        this.user = user;
    }

    public UserComplianceSchema eventAt(OffsetDateTime eventAt) {
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

    public UserComplianceSchema user(UserComplianceSchemaUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UserComplianceSchemaUser getUser() {
        return user;
    }

    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUser(UserComplianceSchemaUser user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserComplianceSchema userComplianceSchema = (UserComplianceSchema) o;
        return Objects.equals(this.eventAt, userComplianceSchema.eventAt) &&
            Objects.equals(this.user, userComplianceSchema.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventAt, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserComplianceSchema {\n");
        sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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