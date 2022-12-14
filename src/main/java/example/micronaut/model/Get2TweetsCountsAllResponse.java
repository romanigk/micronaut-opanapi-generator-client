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
import example.micronaut.model.Get2TweetsCountsAllResponseMeta;
import example.micronaut.model.Problem;
import example.micronaut.model.SearchCount;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Get2TweetsCountsAllResponse
 */
@JsonPropertyOrder({
  Get2TweetsCountsAllResponse.JSON_PROPERTY_DATA,
  Get2TweetsCountsAllResponse.JSON_PROPERTY_ERRORS,
  Get2TweetsCountsAllResponse.JSON_PROPERTY_META
})
@JsonTypeName("Get2TweetsCountsAllResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class Get2TweetsCountsAllResponse {
    public static final String JSON_PROPERTY_DATA = "data";
    private List<SearchCount> data = null;

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<Problem> errors = null;

    public static final String JSON_PROPERTY_META = "meta";
    private Get2TweetsCountsAllResponseMeta meta;

    public Get2TweetsCountsAllResponse() {
    }

    public Get2TweetsCountsAllResponse data(List<SearchCount> data) {
        this.data = data;
        return this;
    }

    public Get2TweetsCountsAllResponse addDataItem(SearchCount dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<SearchCount> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<SearchCount> data) {
        this.data = data;
    }

    public Get2TweetsCountsAllResponse errors(List<Problem> errors) {
        this.errors = errors;
        return this;
    }

    public Get2TweetsCountsAllResponse addErrorsItem(Problem errorsItem) {
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

    public Get2TweetsCountsAllResponse meta(Get2TweetsCountsAllResponseMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     * @return meta
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Get2TweetsCountsAllResponseMeta getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMeta(Get2TweetsCountsAllResponseMeta meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Get2TweetsCountsAllResponse get2TweetsCountsAllResponse = (Get2TweetsCountsAllResponse) o;
        return Objects.equals(this.data, get2TweetsCountsAllResponse.data) &&
            Objects.equals(this.errors, get2TweetsCountsAllResponse.errors) &&
            Objects.equals(this.meta, get2TweetsCountsAllResponse.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errors, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Get2TweetsCountsAllResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
