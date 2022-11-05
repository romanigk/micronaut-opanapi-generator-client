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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ListMutateResponseData
 */
@JsonPropertyOrder({
  ListMutateResponseData.JSON_PROPERTY_IS_MEMBER
})
@JsonTypeName("ListMutateResponse_data")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class ListMutateResponseData {
    public static final String JSON_PROPERTY_IS_MEMBER = "is_member";
    private Boolean isMember;

    public ListMutateResponseData() {
    }

    public ListMutateResponseData isMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }

    /**
     * Get isMember
     * @return isMember
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_IS_MEMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsMember() {
        return isMember;
    }

    @JsonProperty(JSON_PROPERTY_IS_MEMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMutateResponseData listMutateResponseData = (ListMutateResponseData) o;
        return Objects.equals(this.isMember, listMutateResponseData.isMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isMember);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMutateResponseData {\n");
        sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
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