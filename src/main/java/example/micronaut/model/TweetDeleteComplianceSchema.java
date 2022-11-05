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
import example.micronaut.model.TweetComplianceSchema;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * TweetDeleteComplianceSchema
 */
@JsonPropertyOrder({
  TweetDeleteComplianceSchema.JSON_PROPERTY_DELETE
})
@JsonTypeName("TweetDeleteComplianceSchema")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetDeleteComplianceSchema {
    public static final String JSON_PROPERTY_DELETE = "delete";
    private TweetComplianceSchema delete;

    public TweetDeleteComplianceSchema(TweetComplianceSchema delete) {
        this.delete = delete;
    }

    public TweetDeleteComplianceSchema delete(TweetComplianceSchema delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Get delete
     * @return delete
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_DELETE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TweetComplianceSchema getDelete() {
        return delete;
    }

    @JsonProperty(JSON_PROPERTY_DELETE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDelete(TweetComplianceSchema delete) {
        this.delete = delete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetDeleteComplianceSchema tweetDeleteComplianceSchema = (TweetDeleteComplianceSchema) o;
        return Objects.equals(this.delete, tweetDeleteComplianceSchema.delete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetDeleteComplianceSchema {\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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