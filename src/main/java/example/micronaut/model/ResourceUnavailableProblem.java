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
 * A problem that indicates a particular Tweet, User, etc. is not available to you.
 */
@JsonPropertyOrder({
  ResourceUnavailableProblem.JSON_PROPERTY_PARAMETER,
  ResourceUnavailableProblem.JSON_PROPERTY_RESOURCE_ID,
  ResourceUnavailableProblem.JSON_PROPERTY_RESOURCE_TYPE
})
@JsonTypeName("ResourceUnavailableProblem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class ResourceUnavailableProblem extends Problem {
    public static final String JSON_PROPERTY_PARAMETER = "parameter";
    private String parameter;

    public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
    private String resourceId;

    /**
     * Gets or Sets resourceType
     */
    public enum ResourceTypeEnum {
        USER("user"),
        TWEET("tweet"),
        MEDIA("media"),
        LIST("list"),
        SPACE("space");

        private String value;

        ResourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceTypeEnum fromValue(String value) {
            for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
    private ResourceTypeEnum resourceType;

    public ResourceUnavailableProblem(String parameter, String resourceId, ResourceTypeEnum resourceType, String title, String type) {
        super(title, type);
        this.parameter = parameter;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    public ResourceUnavailableProblem parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * Get parameter
     * @return parameter
     **/
    @NotNull
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_PARAMETER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getParameter() {
        return parameter;
    }

    @JsonProperty(JSON_PROPERTY_PARAMETER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public ResourceUnavailableProblem resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get resourceId
     * @return resourceId
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getResourceId() {
        return resourceId;
    }

    @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceUnavailableProblem resourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceUnavailableProblem resourceUnavailableProblem = (ResourceUnavailableProblem) o;
        return Objects.equals(this.parameter, resourceUnavailableProblem.parameter) &&
            Objects.equals(this.resourceId, resourceUnavailableProblem.resourceId) &&
            Objects.equals(this.resourceType, resourceUnavailableProblem.resourceType) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter, resourceId, resourceType, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceUnavailableProblem {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
