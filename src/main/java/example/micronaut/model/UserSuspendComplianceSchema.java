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
import example.micronaut.model.UserComplianceSchema;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * UserSuspendComplianceSchema
 */
@JsonPropertyOrder({
  UserSuspendComplianceSchema.JSON_PROPERTY_USER_SUSPEND
})
@JsonTypeName("UserSuspendComplianceSchema")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class UserSuspendComplianceSchema {
    public static final String JSON_PROPERTY_USER_SUSPEND = "user_suspend";
    private UserComplianceSchema userSuspend;

    public UserSuspendComplianceSchema(UserComplianceSchema userSuspend) {
        this.userSuspend = userSuspend;
    }

    public UserSuspendComplianceSchema userSuspend(UserComplianceSchema userSuspend) {
        this.userSuspend = userSuspend;
        return this;
    }

    /**
     * Get userSuspend
     * @return userSuspend
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_USER_SUSPEND)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UserComplianceSchema getUserSuspend() {
        return userSuspend;
    }

    @JsonProperty(JSON_PROPERTY_USER_SUSPEND)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUserSuspend(UserComplianceSchema userSuspend) {
        this.userSuspend = userSuspend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSuspendComplianceSchema userSuspendComplianceSchema = (UserSuspendComplianceSchema) o;
        return Objects.equals(this.userSuspend, userSuspendComplianceSchema.userSuspend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userSuspend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSuspendComplianceSchema {\n");
        sb.append("    userSuspend: ").append(toIndentedString(userSuspend)).append("\n");
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