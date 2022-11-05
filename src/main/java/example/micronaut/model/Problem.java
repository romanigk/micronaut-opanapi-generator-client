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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * An HTTP Problem Details object, as defined in IETF RFC 7807 (https://tools.ietf.org/html/rfc7807).
 */
@JsonPropertyOrder({
  Problem.JSON_PROPERTY_DETAIL,
  Problem.JSON_PROPERTY_STATUS,
  Problem.JSON_PROPERTY_TITLE,
  Problem.JSON_PROPERTY_TYPE
})
@JsonTypeName("Problem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = GenericProblem.class, name = "about:blank"),
  @JsonSubTypes.Type(value = ClientDisconnectedProblem.class, name = "https://api.twitter.com/2/problems/client-disconnected"),
  @JsonSubTypes.Type(value = ClientForbiddenProblem.class, name = "https://api.twitter.com/2/problems/client-forbidden"),
  @JsonSubTypes.Type(value = ConflictProblem.class, name = "https://api.twitter.com/2/problems/conflict"),
  @JsonSubTypes.Type(value = DisallowedResourceProblem.class, name = "https://api.twitter.com/2/problems/disallowed-resource"),
  @JsonSubTypes.Type(value = DuplicateRuleProblem.class, name = "https://api.twitter.com/2/problems/duplicate-rules"),
  @JsonSubTypes.Type(value = InvalidRequestProblem.class, name = "https://api.twitter.com/2/problems/invalid-request"),
  @JsonSubTypes.Type(value = InvalidRuleProblem.class, name = "https://api.twitter.com/2/problems/invalid-rules"),
  @JsonSubTypes.Type(value = NonCompliantRulesProblem.class, name = "https://api.twitter.com/2/problems/noncompliant-rules"),
  @JsonSubTypes.Type(value = FieldUnauthorizedProblem.class, name = "https://api.twitter.com/2/problems/not-authorized-for-field"),
  @JsonSubTypes.Type(value = ResourceUnauthorizedProblem.class, name = "https://api.twitter.com/2/problems/not-authorized-for-resource"),
  @JsonSubTypes.Type(value = OperationalDisconnectProblem.class, name = "https://api.twitter.com/2/problems/operational-disconnect"),
  @JsonSubTypes.Type(value = ResourceNotFoundProblem.class, name = "https://api.twitter.com/2/problems/resource-not-found"),
  @JsonSubTypes.Type(value = ResourceUnavailableProblem.class, name = "https://api.twitter.com/2/problems/resource-unavailable"),
  @JsonSubTypes.Type(value = RulesCapProblem.class, name = "https://api.twitter.com/2/problems/rule-cap"),
  @JsonSubTypes.Type(value = ConnectionExceptionProblem.class, name = "https://api.twitter.com/2/problems/streaming-connection"),
  @JsonSubTypes.Type(value = UnsupportedAuthenticationProblem.class, name = "https://api.twitter.com/2/problems/unsupported-authentication"),
  @JsonSubTypes.Type(value = UsageCapExceededProblem.class, name = "https://api.twitter.com/2/problems/usage-capped"),
})

@Introspected
public class Problem {
    public static final String JSON_PROPERTY_DETAIL = "detail";
    private String detail;

    public static final String JSON_PROPERTY_STATUS = "status";
    private Integer status;

    public static final String JSON_PROPERTY_TITLE = "title";
    private String title;

    public static final String JSON_PROPERTY_TYPE = "type";
    protected String type;

    public Problem(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public Problem detail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get detail
     * @return detail
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDetail() {
        return detail;
    }

    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Problem status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Problem title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTitle() {
        return title;
    }

    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTitle(String title) {
        this.title = title;
    }

    public Problem type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Problem problem = (Problem) o;
        return Objects.equals(this.detail, problem.detail) &&
            Objects.equals(this.status, problem.status) &&
            Objects.equals(this.title, problem.title) &&
            Objects.equals(this.type, problem.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, status, title, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Problem {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
