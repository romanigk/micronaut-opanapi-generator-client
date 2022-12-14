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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ListUpdateRequest
 */
@JsonPropertyOrder({
  ListUpdateRequest.JSON_PROPERTY_DESCRIPTION,
  ListUpdateRequest.JSON_PROPERTY_NAME,
  ListUpdateRequest.JSON_PROPERTY_PRIVATE
})
@JsonTypeName("ListUpdateRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class ListUpdateRequest {
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_PRIVATE = "private";
    private Boolean _private;

    public ListUpdateRequest() {
    }

    public ListUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @Nullable
    @Size(min=0, max=100)
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public ListUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @Nullable
    @Size(min=1, max=25)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public ListUpdateRequest _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Get _private
     * @return _private
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PRIVATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty(JSON_PROPERTY_PRIVATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUpdateRequest listUpdateRequest = (ListUpdateRequest) o;
        return Objects.equals(this.description, listUpdateRequest.description) &&
            Objects.equals(this.name, listUpdateRequest.name) &&
            Objects.equals(this._private, listUpdateRequest._private);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, _private);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpdateRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
