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
import example.micronaut.model.UserComplianceData;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * User compliance event.
 */
@JsonPropertyOrder({
  UserComplianceStreamResponseOneOf.JSON_PROPERTY_DATA
})
@JsonTypeName("UserComplianceStreamResponse_oneOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class UserComplianceStreamResponseOneOf {
    public static final String JSON_PROPERTY_DATA = "data";
    private UserComplianceData data;

    public UserComplianceStreamResponseOneOf(UserComplianceData data) {
        this.data = data;
    }

    public UserComplianceStreamResponseOneOf data(UserComplianceData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UserComplianceData getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(UserComplianceData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserComplianceStreamResponseOneOf userComplianceStreamResponseOneOf = (UserComplianceStreamResponseOneOf) o;
        return Objects.equals(this.data, userComplianceStreamResponseOneOf.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserComplianceStreamResponseOneOf {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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