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
import example.micronaut.model.Problem;
import example.micronaut.model.Tweet;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Get2TweetsSampleStreamResponse
 */
@JsonPropertyOrder({
  Get2TweetsSampleStreamResponse.JSON_PROPERTY_DATA,
  Get2TweetsSampleStreamResponse.JSON_PROPERTY_ERRORS,
  Get2TweetsSampleStreamResponse.JSON_PROPERTY_INCLUDES
})
@JsonTypeName("Get2TweetsSampleStreamResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class Get2TweetsSampleStreamResponse {
    public static final String JSON_PROPERTY_DATA = "data";
    private Tweet data;

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<Problem> errors = null;

    public static final String JSON_PROPERTY_INCLUDES = "includes";
    private Expansions includes;

    public Get2TweetsSampleStreamResponse() {
    }

    public Get2TweetsSampleStreamResponse data(Tweet data) {
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
    public Tweet getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(Tweet data) {
        this.data = data;
    }

    public Get2TweetsSampleStreamResponse errors(List<Problem> errors) {
        this.errors = errors;
        return this;
    }

    public Get2TweetsSampleStreamResponse addErrorsItem(Problem errorsItem) {
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

    public Get2TweetsSampleStreamResponse includes(Expansions includes) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Get2TweetsSampleStreamResponse get2TweetsSampleStreamResponse = (Get2TweetsSampleStreamResponse) o;
        return Objects.equals(this.data, get2TweetsSampleStreamResponse.data) &&
            Objects.equals(this.errors, get2TweetsSampleStreamResponse.errors) &&
            Objects.equals(this.includes, get2TweetsSampleStreamResponse.includes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errors, includes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Get2TweetsSampleStreamResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
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
