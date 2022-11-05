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
import example.micronaut.model.Expansions;
import example.micronaut.model.Get2DmConversationsIdDmEventsResponseMeta;
import example.micronaut.model.ModelList;
import example.micronaut.model.Problem;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Get2UsersIdListMembershipsResponse
 */
@JsonPropertyOrder({
  Get2UsersIdListMembershipsResponse.JSON_PROPERTY_DATA,
  Get2UsersIdListMembershipsResponse.JSON_PROPERTY_ERRORS,
  Get2UsersIdListMembershipsResponse.JSON_PROPERTY_INCLUDES,
  Get2UsersIdListMembershipsResponse.JSON_PROPERTY_META
})
@JsonTypeName("Get2UsersIdListMembershipsResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class Get2UsersIdListMembershipsResponse {
    public static final String JSON_PROPERTY_DATA = "data";
    private List<ModelList> data = null;

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<Problem> errors = null;

    public static final String JSON_PROPERTY_INCLUDES = "includes";
    private Expansions includes;

    public static final String JSON_PROPERTY_META = "meta";
    private Get2DmConversationsIdDmEventsResponseMeta meta;

    public Get2UsersIdListMembershipsResponse() {
    }

    public Get2UsersIdListMembershipsResponse data(List<ModelList> data) {
        this.data = data;
        return this;
    }

    public Get2UsersIdListMembershipsResponse addDataItem(ModelList dataItem) {
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
    public List<ModelList> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<ModelList> data) {
        this.data = data;
    }

    public Get2UsersIdListMembershipsResponse errors(List<Problem> errors) {
        this.errors = errors;
        return this;
    }

    public Get2UsersIdListMembershipsResponse addErrorsItem(Problem errorsItem) {
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

    public Get2UsersIdListMembershipsResponse includes(Expansions includes) {
        this.includes = includes;
        return this;
    }

    /**
     * Get includes
     * @return includes
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_INCLUDES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Expansions getIncludes() {
        return includes;
    }

    @JsonProperty(JSON_PROPERTY_INCLUDES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIncludes(Expansions includes) {
        this.includes = includes;
    }

    public Get2UsersIdListMembershipsResponse meta(Get2DmConversationsIdDmEventsResponseMeta meta) {
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
    public Get2DmConversationsIdDmEventsResponseMeta getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMeta(Get2DmConversationsIdDmEventsResponseMeta meta) {
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
        Get2UsersIdListMembershipsResponse get2UsersIdListMembershipsResponse = (Get2UsersIdListMembershipsResponse) o;
        return Objects.equals(this.data, get2UsersIdListMembershipsResponse.data) &&
            Objects.equals(this.errors, get2UsersIdListMembershipsResponse.errors) &&
            Objects.equals(this.includes, get2UsersIdListMembershipsResponse.includes) &&
            Objects.equals(this.meta, get2UsersIdListMembershipsResponse.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errors, includes, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Get2UsersIdListMembershipsResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
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
