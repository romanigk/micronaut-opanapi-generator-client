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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Place ID being attached to the Tweet for geo location.
 */
@JsonPropertyOrder({
  TweetCreateRequestGeo.JSON_PROPERTY_PLACE_ID
})
@JsonTypeName("TweetCreateRequest_geo")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class TweetCreateRequestGeo {
    public static final String JSON_PROPERTY_PLACE_ID = "place_id";
    private String placeId;

    public TweetCreateRequestGeo() {
    }

    public TweetCreateRequestGeo placeId(String placeId) {
        this.placeId = placeId;
        return this;
    }

    /**
     * Get placeId
     * @return placeId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLACE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPlaceId() {
        return placeId;
    }

    @JsonProperty(JSON_PROPERTY_PLACE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TweetCreateRequestGeo tweetCreateRequestGeo = (TweetCreateRequestGeo) o;
        return Objects.equals(this.placeId, tweetCreateRequestGeo.placeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TweetCreateRequestGeo {\n");
        sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
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