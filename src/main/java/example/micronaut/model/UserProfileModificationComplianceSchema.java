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
import example.micronaut.model.UserProfileModificationObjectSchema;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * UserProfileModificationComplianceSchema
 */
@JsonPropertyOrder({
  UserProfileModificationComplianceSchema.JSON_PROPERTY_USER_PROFILE_MODIFICATION
})
@JsonTypeName("UserProfileModificationComplianceSchema")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class UserProfileModificationComplianceSchema {
    public static final String JSON_PROPERTY_USER_PROFILE_MODIFICATION = "user_profile_modification";
    private UserProfileModificationObjectSchema userProfileModification;

    public UserProfileModificationComplianceSchema(UserProfileModificationObjectSchema userProfileModification) {
        this.userProfileModification = userProfileModification;
    }

    public UserProfileModificationComplianceSchema userProfileModification(UserProfileModificationObjectSchema userProfileModification) {
        this.userProfileModification = userProfileModification;
        return this;
    }

    /**
     * Get userProfileModification
     * @return userProfileModification
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_USER_PROFILE_MODIFICATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UserProfileModificationObjectSchema getUserProfileModification() {
        return userProfileModification;
    }

    @JsonProperty(JSON_PROPERTY_USER_PROFILE_MODIFICATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUserProfileModification(UserProfileModificationObjectSchema userProfileModification) {
        this.userProfileModification = userProfileModification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserProfileModificationComplianceSchema userProfileModificationComplianceSchema = (UserProfileModificationComplianceSchema) o;
        return Objects.equals(this.userProfileModification, userProfileModificationComplianceSchema.userProfileModification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileModification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserProfileModificationComplianceSchema {\n");
        sb.append("    userProfileModification: ").append(toIndentedString(userProfileModification)).append("\n");
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