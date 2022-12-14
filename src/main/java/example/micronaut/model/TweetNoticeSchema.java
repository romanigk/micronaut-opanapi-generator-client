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
import example.micronaut.model.TweetNotice;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * TweetNoticeSchema
 */
@JsonPropertyOrder({
  TweetNoticeSchema.JSON_PROPERTY_PUBLIC_TWEET_NOTICE
})
@JsonTypeName("TweetNoticeSchema")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetNoticeSchema {
    public static final String JSON_PROPERTY_PUBLIC_TWEET_NOTICE = "public_tweet_notice";
    private TweetNotice publicTweetNotice;

    public TweetNoticeSchema(TweetNotice publicTweetNotice) {
        this.publicTweetNotice = publicTweetNotice;
    }

    public TweetNoticeSchema publicTweetNotice(TweetNotice publicTweetNotice) {
        this.publicTweetNotice = publicTweetNotice;
        return this;
    }

    /**
     * Get publicTweetNotice
     * @return publicTweetNotice
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_PUBLIC_TWEET_NOTICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TweetNotice getPublicTweetNotice() {
        return publicTweetNotice;
    }

    @JsonProperty(JSON_PROPERTY_PUBLIC_TWEET_NOTICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPublicTweetNotice(TweetNotice publicTweetNotice) {
        this.publicTweetNotice = publicTweetNotice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetNoticeSchema tweetNoticeSchema = (TweetNoticeSchema) o;
        return Objects.equals(this.publicTweetNotice, tweetNoticeSchema.publicTweetNotice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicTweetNotice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetNoticeSchema {\n");
        sb.append("    publicTweetNotice: ").append(toIndentedString(publicTweetNotice)).append("\n");
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
