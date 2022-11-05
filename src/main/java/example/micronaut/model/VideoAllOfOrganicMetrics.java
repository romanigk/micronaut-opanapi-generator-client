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
 * Organic nonpublic engagement metrics for the Media at the time of the request.
 */
@JsonPropertyOrder({
  VideoAllOfOrganicMetrics.JSON_PROPERTY_PLAYBACK0_COUNT,
  VideoAllOfOrganicMetrics.JSON_PROPERTY_PLAYBACK100_COUNT,
  VideoAllOfOrganicMetrics.JSON_PROPERTY_PLAYBACK25_COUNT,
  VideoAllOfOrganicMetrics.JSON_PROPERTY_PLAYBACK50_COUNT,
  VideoAllOfOrganicMetrics.JSON_PROPERTY_PLAYBACK75_COUNT,
  VideoAllOfOrganicMetrics.JSON_PROPERTY_VIEW_COUNT
})
@JsonTypeName("Video_allOf_organic_metrics")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class VideoAllOfOrganicMetrics {
    public static final String JSON_PROPERTY_PLAYBACK0_COUNT = "playback_0_count";
    private Integer playback0Count;

    public static final String JSON_PROPERTY_PLAYBACK100_COUNT = "playback_100_count";
    private Integer playback100Count;

    public static final String JSON_PROPERTY_PLAYBACK25_COUNT = "playback_25_count";
    private Integer playback25Count;

    public static final String JSON_PROPERTY_PLAYBACK50_COUNT = "playback_50_count";
    private Integer playback50Count;

    public static final String JSON_PROPERTY_PLAYBACK75_COUNT = "playback_75_count";
    private Integer playback75Count;

    public static final String JSON_PROPERTY_VIEW_COUNT = "view_count";
    private Integer viewCount;

    public VideoAllOfOrganicMetrics() {
    }

    public VideoAllOfOrganicMetrics playback0Count(Integer playback0Count) {
        this.playback0Count = playback0Count;
        return this;
    }

    /**
     * Number of users who made it through 0% of the video.
     * @return playback0Count
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLAYBACK0_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPlayback0Count() {
        return playback0Count;
    }

    @JsonProperty(JSON_PROPERTY_PLAYBACK0_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlayback0Count(Integer playback0Count) {
        this.playback0Count = playback0Count;
    }

    public VideoAllOfOrganicMetrics playback100Count(Integer playback100Count) {
        this.playback100Count = playback100Count;
        return this;
    }

    /**
     * Number of users who made it through 100% of the video.
     * @return playback100Count
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLAYBACK100_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPlayback100Count() {
        return playback100Count;
    }

    @JsonProperty(JSON_PROPERTY_PLAYBACK100_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlayback100Count(Integer playback100Count) {
        this.playback100Count = playback100Count;
    }

    public VideoAllOfOrganicMetrics playback25Count(Integer playback25Count) {
        this.playback25Count = playback25Count;
        return this;
    }

    /**
     * Number of users who made it through 25% of the video.
     * @return playback25Count
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLAYBACK25_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPlayback25Count() {
        return playback25Count;
    }

    @JsonProperty(JSON_PROPERTY_PLAYBACK25_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlayback25Count(Integer playback25Count) {
        this.playback25Count = playback25Count;
    }

    public VideoAllOfOrganicMetrics playback50Count(Integer playback50Count) {
        this.playback50Count = playback50Count;
        return this;
    }

    /**
     * Number of users who made it through 50% of the video.
     * @return playback50Count
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLAYBACK50_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPlayback50Count() {
        return playback50Count;
    }

    @JsonProperty(JSON_PROPERTY_PLAYBACK50_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlayback50Count(Integer playback50Count) {
        this.playback50Count = playback50Count;
    }

    public VideoAllOfOrganicMetrics playback75Count(Integer playback75Count) {
        this.playback75Count = playback75Count;
        return this;
    }

    /**
     * Number of users who made it through 75% of the video.
     * @return playback75Count
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLAYBACK75_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPlayback75Count() {
        return playback75Count;
    }

    @JsonProperty(JSON_PROPERTY_PLAYBACK75_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlayback75Count(Integer playback75Count) {
        this.playback75Count = playback75Count;
    }

    public VideoAllOfOrganicMetrics viewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }

    /**
     * Number of times this video has been viewed.
     * @return viewCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VIEW_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getViewCount() {
        return viewCount;
    }

    @JsonProperty(JSON_PROPERTY_VIEW_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoAllOfOrganicMetrics videoAllOfOrganicMetrics = (VideoAllOfOrganicMetrics) o;
        return Objects.equals(this.playback0Count, videoAllOfOrganicMetrics.playback0Count) &&
            Objects.equals(this.playback100Count, videoAllOfOrganicMetrics.playback100Count) &&
            Objects.equals(this.playback25Count, videoAllOfOrganicMetrics.playback25Count) &&
            Objects.equals(this.playback50Count, videoAllOfOrganicMetrics.playback50Count) &&
            Objects.equals(this.playback75Count, videoAllOfOrganicMetrics.playback75Count) &&
            Objects.equals(this.viewCount, videoAllOfOrganicMetrics.viewCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playback0Count, playback100Count, playback25Count, playback50Count, playback75Count, viewCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoAllOfOrganicMetrics {\n");
        sb.append("    playback0Count: ").append(toIndentedString(playback0Count)).append("\n");
        sb.append("    playback100Count: ").append(toIndentedString(playback100Count)).append("\n");
        sb.append("    playback25Count: ").append(toIndentedString(playback25Count)).append("\n");
        sb.append("    playback50Count: ").append(toIndentedString(playback50Count)).append("\n");
        sb.append("    playback75Count: ").append(toIndentedString(playback75Count)).append("\n");
        sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
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
