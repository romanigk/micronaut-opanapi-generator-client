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
import example.micronaut.model.ListUpdateResponseData;
import example.micronaut.model.Problem;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ListUpdateResponse
 */
@JsonPropertyOrder({
  ListUpdateResponse.JSON_PROPERTY_DATA,
  ListUpdateResponse.JSON_PROPERTY_ERRORS
})
@JsonTypeName("ListUpdateResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class ListUpdateResponse {
    public static final String JSON_PROPERTY_DATA = "data";
    private ListUpdateResponseData data;

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<Problem> errors = null;

    public ListUpdateResponse() {
    }

    public ListUpdateResponse data(ListUpdateResponseData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ListUpdateResponseData getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(ListUpdateResponseData data) {
        this.data = data;
    }

    public ListUpdateResponse errors(List<Problem> errors) {
        this.errors = errors;
        return this;
    }

    public ListUpdateResponse addErrorsItem(Problem errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     * @return errors
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Problem> getErrors() {
        return errors;
    }

    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrors(List<Problem> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUpdateResponse listUpdateResponse = (ListUpdateResponse) o;
        return Objects.equals(this.data, listUpdateResponse.data) &&
            Objects.equals(this.errors, listUpdateResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpdateResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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