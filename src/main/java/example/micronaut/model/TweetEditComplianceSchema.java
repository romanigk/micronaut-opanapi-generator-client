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
import example.micronaut.model.TweetEditComplianceObjectSchema;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * TweetEditComplianceSchema
 */
@JsonPropertyOrder({
  TweetEditComplianceSchema.JSON_PROPERTY_TWEET_EDIT
})
@JsonTypeName("TweetEditComplianceSchema")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetEditComplianceSchema {
    public static final String JSON_PROPERTY_TWEET_EDIT = "tweet_edit";
    private TweetEditComplianceObjectSchema tweetEdit;

    public TweetEditComplianceSchema(TweetEditComplianceObjectSchema tweetEdit) {
        this.tweetEdit = tweetEdit;
    }

    public TweetEditComplianceSchema tweetEdit(TweetEditComplianceObjectSchema tweetEdit) {
        this.tweetEdit = tweetEdit;
        return this;
    }

    /**
     * Get tweetEdit
     * @return tweetEdit
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_TWEET_EDIT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TweetEditComplianceObjectSchema getTweetEdit() {
        return tweetEdit;
    }

    @JsonProperty(JSON_PROPERTY_TWEET_EDIT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTweetEdit(TweetEditComplianceObjectSchema tweetEdit) {
        this.tweetEdit = tweetEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetEditComplianceSchema tweetEditComplianceSchema = (TweetEditComplianceSchema) o;
        return Objects.equals(this.tweetEdit, tweetEditComplianceSchema.tweetEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tweetEdit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetEditComplianceSchema {\n");
        sb.append("    tweetEdit: ").append(toIndentedString(tweetEdit)).append("\n");
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