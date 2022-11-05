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
 * RulesRequestSummaryOneOf1
 */
@JsonPropertyOrder({
  RulesRequestSummaryOneOf1.JSON_PROPERTY_DELETED,
  RulesRequestSummaryOneOf1.JSON_PROPERTY_NOT_DELETED
})
@JsonTypeName("RulesRequestSummary_oneOf_1")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class RulesRequestSummaryOneOf1 {
    public static final String JSON_PROPERTY_DELETED = "deleted";
    private Integer deleted;

    public static final String JSON_PROPERTY_NOT_DELETED = "not_deleted";
    private Integer notDeleted;

    public RulesRequestSummaryOneOf1(Integer deleted, Integer notDeleted) {
        this.deleted = deleted;
        this.notDeleted = notDeleted;
    }

    public RulesRequestSummaryOneOf1 deleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Number of user-specified stream filtering rules that were deleted.
     * @return deleted
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getDeleted() {
        return deleted;
    }

    @JsonProperty(JSON_PROPERTY_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public RulesRequestSummaryOneOf1 notDeleted(Integer notDeleted) {
        this.notDeleted = notDeleted;
        return this;
    }

    /**
     * Number of user-specified stream filtering rules that were not deleted.
     * @return notDeleted
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_NOT_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getNotDeleted() {
        return notDeleted;
    }

    @JsonProperty(JSON_PROPERTY_NOT_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNotDeleted(Integer notDeleted) {
        this.notDeleted = notDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RulesRequestSummaryOneOf1 rulesRequestSummaryOneOf1 = (RulesRequestSummaryOneOf1) o;
        return Objects.equals(this.deleted, rulesRequestSummaryOneOf1.deleted) &&
            Objects.equals(this.notDeleted, rulesRequestSummaryOneOf1.notDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleted, notDeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RulesRequestSummaryOneOf1 {\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    notDeleted: ").append(toIndentedString(notDeleted)).append("\n");
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
