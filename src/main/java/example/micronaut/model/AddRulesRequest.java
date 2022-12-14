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
import example.micronaut.model.RuleNoId;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * A request to add a user-specified stream filtering rule.
 */
@JsonPropertyOrder({
  AddRulesRequest.JSON_PROPERTY_ADD
})
@JsonTypeName("AddRulesRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class AddRulesRequest {
    public static final String JSON_PROPERTY_ADD = "add";
    private List<RuleNoId> add = new ArrayList<>();

    public AddRulesRequest(List<RuleNoId> add) {
        this.add = add;
    }

    public AddRulesRequest add(List<RuleNoId> add) {
        this.add = add;
        return this;
    }

    public AddRulesRequest addAddItem(RuleNoId addItem) {
        this.add.add(addItem);
        return this;
    }

    /**
     * Get add
     * @return add
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_ADD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<RuleNoId> getAdd() {
        return add;
    }

    @JsonProperty(JSON_PROPERTY_ADD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAdd(List<RuleNoId> add) {
        this.add = add;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddRulesRequest addRulesRequest = (AddRulesRequest) o;
        return Objects.equals(this.add, addRulesRequest.add);
    }

    @Override
    public int hashCode() {
        return Objects.hash(add);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRulesRequest {\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
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
