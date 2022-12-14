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
import example.micronaut.model.CashtagEntity;
import example.micronaut.model.FullTextEntitiesAnnotationsInner;
import example.micronaut.model.HashtagEntity;
import example.micronaut.model.MentionEntity;
import example.micronaut.model.UrlEntity;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * FullTextEntities
 */
@JsonPropertyOrder({
  FullTextEntities.JSON_PROPERTY_ANNOTATIONS,
  FullTextEntities.JSON_PROPERTY_CASHTAGS,
  FullTextEntities.JSON_PROPERTY_HASHTAGS,
  FullTextEntities.JSON_PROPERTY_MENTIONS,
  FullTextEntities.JSON_PROPERTY_URLS
})
@JsonTypeName("FullTextEntities")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class FullTextEntities {
    public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
    private List<FullTextEntitiesAnnotationsInner> annotations = null;

    public static final String JSON_PROPERTY_CASHTAGS = "cashtags";
    private List<CashtagEntity> cashtags = null;

    public static final String JSON_PROPERTY_HASHTAGS = "hashtags";
    private List<HashtagEntity> hashtags = null;

    public static final String JSON_PROPERTY_MENTIONS = "mentions";
    private List<MentionEntity> mentions = null;

    public static final String JSON_PROPERTY_URLS = "urls";
    private List<UrlEntity> urls = null;

    public FullTextEntities() {
    }

    public FullTextEntities annotations(List<FullTextEntitiesAnnotationsInner> annotations) {
        this.annotations = annotations;
        return this;
    }

    public FullTextEntities addAnnotationsItem(FullTextEntitiesAnnotationsInner annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new ArrayList<>();
        }
        this.annotations.add(annotationsItem);
        return this;
    }

    /**
     * Get annotations
     * @return annotations
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<FullTextEntitiesAnnotationsInner> getAnnotations() {
        return annotations;
    }

    @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAnnotations(List<FullTextEntitiesAnnotationsInner> annotations) {
        this.annotations = annotations;
    }

    public FullTextEntities cashtags(List<CashtagEntity> cashtags) {
        this.cashtags = cashtags;
        return this;
    }

    public FullTextEntities addCashtagsItem(CashtagEntity cashtagsItem) {
        if (this.cashtags == null) {
            this.cashtags = new ArrayList<>();
        }
        this.cashtags.add(cashtagsItem);
        return this;
    }

    /**
     * Get cashtags
     * @return cashtags
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_CASHTAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<CashtagEntity> getCashtags() {
        return cashtags;
    }

    @JsonProperty(JSON_PROPERTY_CASHTAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCashtags(List<CashtagEntity> cashtags) {
        this.cashtags = cashtags;
    }

    public FullTextEntities hashtags(List<HashtagEntity> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    public FullTextEntities addHashtagsItem(HashtagEntity hashtagsItem) {
        if (this.hashtags == null) {
            this.hashtags = new ArrayList<>();
        }
        this.hashtags.add(hashtagsItem);
        return this;
    }

    /**
     * Get hashtags
     * @return hashtags
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_HASHTAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<HashtagEntity> getHashtags() {
        return hashtags;
    }

    @JsonProperty(JSON_PROPERTY_HASHTAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHashtags(List<HashtagEntity> hashtags) {
        this.hashtags = hashtags;
    }

    public FullTextEntities mentions(List<MentionEntity> mentions) {
        this.mentions = mentions;
        return this;
    }

    public FullTextEntities addMentionsItem(MentionEntity mentionsItem) {
        if (this.mentions == null) {
            this.mentions = new ArrayList<>();
        }
        this.mentions.add(mentionsItem);
        return this;
    }

    /**
     * Get mentions
     * @return mentions
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_MENTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<MentionEntity> getMentions() {
        return mentions;
    }

    @JsonProperty(JSON_PROPERTY_MENTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMentions(List<MentionEntity> mentions) {
        this.mentions = mentions;
    }

    public FullTextEntities urls(List<UrlEntity> urls) {
        this.urls = urls;
        return this;
    }

    public FullTextEntities addUrlsItem(UrlEntity urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    /**
     * Get urls
     * @return urls
     **/
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<UrlEntity> getUrls() {
        return urls;
    }

    @JsonProperty(JSON_PROPERTY_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrls(List<UrlEntity> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FullTextEntities fullTextEntities = (FullTextEntities) o;
        return Objects.equals(this.annotations, fullTextEntities.annotations) &&
            Objects.equals(this.cashtags, fullTextEntities.cashtags) &&
            Objects.equals(this.hashtags, fullTextEntities.hashtags) &&
            Objects.equals(this.mentions, fullTextEntities.mentions) &&
            Objects.equals(this.urls, fullTextEntities.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotations, cashtags, hashtags, mentions, urls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullTextEntities {\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    cashtags: ").append(toIndentedString(cashtags)).append("\n");
        sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
        sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
