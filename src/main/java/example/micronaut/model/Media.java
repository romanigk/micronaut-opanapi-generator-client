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
 * Media
 */
@JsonPropertyOrder({
  Media.JSON_PROPERTY_HEIGHT,
  Media.JSON_PROPERTY_MEDIA_KEY,
  Media.JSON_PROPERTY_TYPE,
  Media.JSON_PROPERTY_WIDTH
})
@JsonTypeName("Media")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AnimatedGif.class, name = "animated_gif"),
  @JsonSubTypes.Type(value = Photo.class, name = "photo"),
  @JsonSubTypes.Type(value = Video.class, name = "video"),
})

@Introspected
public class Media {
    public static final String JSON_PROPERTY_HEIGHT = "height";
    private Integer height;

    public static final String JSON_PROPERTY_MEDIA_KEY = "media_key";
    private String mediaKey;

    public static final String JSON_PROPERTY_TYPE = "type";
    protected String type;

    public static final String JSON_PROPERTY_WIDTH = "width";
    private Integer width;

    public Media(String type) {
        this.type = type;
    }

    public Media height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * The height of the media in pixels.
     * minimum: 0
     * @return height
     **/
    @Nullable
    @Min(0)
    @JsonProperty(JSON_PROPERTY_HEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getHeight() {
        return height;
    }

    @JsonProperty(JSON_PROPERTY_HEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Media mediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    /**
     * The Media Key identifier for this attachment.
     * @return mediaKey
     **/
    @Nullable
    @Pattern(regexp="^([0-9]+)_([0-9]+)$")
    @JsonProperty(JSON_PROPERTY_MEDIA_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMediaKey() {
        return mediaKey;
    }

    @JsonProperty(JSON_PROPERTY_MEDIA_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }

    public Media type(String type) {
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

    public Media width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * The width of the media in pixels.
     * minimum: 0
     * @return width
     **/
    @Nullable
    @Min(0)
    @JsonProperty(JSON_PROPERTY_WIDTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getWidth() {
        return width;
    }

    @JsonProperty(JSON_PROPERTY_WIDTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Media media = (Media) o;
        return Objects.equals(this.height, media.height) &&
            Objects.equals(this.mediaKey, media.mediaKey) &&
            Objects.equals(this.type, media.type) &&
            Objects.equals(this.width, media.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, mediaKey, type, width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Media {\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    mediaKey: ").append(toIndentedString(mediaKey)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
