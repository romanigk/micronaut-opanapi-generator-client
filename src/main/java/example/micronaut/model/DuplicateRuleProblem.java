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
import example.micronaut.model.Problem;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * The rule you have submitted is a duplicate.
 */
@JsonPropertyOrder({
  DuplicateRuleProblem.JSON_PROPERTY_ID,
  DuplicateRuleProblem.JSON_PROPERTY_VALUE
})
@JsonTypeName("DuplicateRuleProblem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class DuplicateRuleProblem extends Problem {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_VALUE = "value";
    private String value;

    public DuplicateRuleProblem(String title, String type) {
        super(title, type);
    }

    public DuplicateRuleProblem id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public DuplicateRuleProblem value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DuplicateRuleProblem duplicateRuleProblem = (DuplicateRuleProblem) o;
        return Objects.equals(this.id, duplicateRuleProblem.id) &&
            Objects.equals(this.value, duplicateRuleProblem.value) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DuplicateRuleProblem {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
