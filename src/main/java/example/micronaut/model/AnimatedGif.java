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
import example.micronaut.model.Media;
import example.micronaut.model.Variant;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * AnimatedGif
 */
@JsonPropertyOrder({
  AnimatedGif.JSON_PROPERTY_PREVIEW_IMAGE_URL,
  AnimatedGif.JSON_PROPERTY_VARIANTS
})
@JsonTypeName("AnimatedGif")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class AnimatedGif extends Media {
    public static final String JSON_PROPERTY_PREVIEW_IMAGE_URL = "preview_image_url";
    private URI previewImageUrl;

    public static final String JSON_PROPERTY_VARIANTS = "variants";
    private List<Variant> variants = null;

    public AnimatedGif(String type) {
        super(type);
    }

    public AnimatedGif previewImageUrl(URI previewImageUrl) {
        this.previewImageUrl = previewImageUrl;
        return this;
    }

    /**
     * Get previewImageUrl
     * @return previewImageUrl
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PREVIEW_IMAGE_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public URI getPreviewImageUrl() {
        return previewImageUrl;
    }

    @JsonProperty(JSON_PROPERTY_PREVIEW_IMAGE_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPreviewImageUrl(URI previewImageUrl) {
        this.previewImageUrl = previewImageUrl;
    }

    public AnimatedGif variants(List<Variant> variants) {
        this.variants = variants;
        return this;
    }

    public AnimatedGif addVariantsItem(Variant variantsItem) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(variantsItem);
        return this;
    }

    /**
     * An array of all available variants of the media.
     * @return variants
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VARIANTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Variant> getVariants() {
        return variants;
    }

    @JsonProperty(JSON_PROPERTY_VARIANTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimatedGif animatedGif = (AnimatedGif) o;
        return Objects.equals(this.previewImageUrl, animatedGif.previewImageUrl) &&
            Objects.equals(this.variants, animatedGif.variants) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previewImageUrl, variants, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimatedGif {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    previewImageUrl: ").append(toIndentedString(previewImageUrl)).append("\n");
        sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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