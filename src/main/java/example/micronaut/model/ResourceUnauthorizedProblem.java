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
 * A problem that indicates you are not allowed to see a particular Tweet, User, etc.
 */
@JsonPropertyOrder({
  ResourceUnauthorizedProblem.JSON_PROPERTY_PARAMETER,
  ResourceUnauthorizedProblem.JSON_PROPERTY_RESOURCE_ID,
  ResourceUnauthorizedProblem.JSON_PROPERTY_RESOURCE_TYPE,
  ResourceUnauthorizedProblem.JSON_PROPERTY_SECTION,
  ResourceUnauthorizedProblem.JSON_PROPERTY_VALUE
})
@JsonTypeName("ResourceUnauthorizedProblem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class ResourceUnauthorizedProblem extends Problem {
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

    /**
     * Gets or Sets section
     */
    public enum SectionEnum {
        DATA("data"),
        INCLUDES("includes");

        private String value;

        SectionEnum(String value) {
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
        public static SectionEnum fromValue(String value) {
            for (SectionEnum b : SectionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_SECTION = "section";
    private SectionEnum section;

    public static final String JSON_PROPERTY_VALUE = "value";
    private String value;

    public ResourceUnauthorizedProblem(String parameter, String resourceId, ResourceTypeEnum resourceType, SectionEnum section, String value, String title, String type) {
        super(title, type);
        this.parameter = parameter;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.section = section;
        this.value = value;
    }

    public ResourceUnauthorizedProblem parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * Get parameter
     * @return parameter
     **/
    @NotNull
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

    public ResourceUnauthorizedProblem resourceId(String resourceId) {
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

    public ResourceUnauthorizedProblem resourceType(ResourceTypeEnum resourceType) {
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

    public ResourceUnauthorizedProblem section(SectionEnum section) {
        this.section = section;
        return this;
    }

    /**
     * Get section
     * @return section
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_SECTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public SectionEnum getSection() {
        return section;
    }

    @JsonProperty(JSON_PROPERTY_SECTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSection(SectionEnum section) {
        this.section = section;
    }

    public ResourceUnauthorizedProblem value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
        ResourceUnauthorizedProblem resourceUnauthorizedProblem = (ResourceUnauthorizedProblem) o;
        return Objects.equals(this.parameter, resourceUnauthorizedProblem.parameter) &&
            Objects.equals(this.resourceId, resourceUnauthorizedProblem.resourceId) &&
            Objects.equals(this.resourceType, resourceUnauthorizedProblem.resourceType) &&
            Objects.equals(this.section, resourceUnauthorizedProblem.section) &&
            Objects.equals(this.value, resourceUnauthorizedProblem.value) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter, resourceId, resourceType, section, value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceUnauthorizedProblem {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    section: ").append(toIndentedString(section)).append("\n");
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
