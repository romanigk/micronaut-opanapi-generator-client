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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Represent a boundary range (start and end index) for a recognized entity (for example a hashtag or a mention). &#x60;start&#x60; must be smaller than &#x60;end&#x60;.  The start index is inclusive, the end index is exclusive.
 */
@JsonPropertyOrder({
  EntityIndicesInclusiveExclusive.JSON_PROPERTY_END,
  EntityIndicesInclusiveExclusive.JSON_PROPERTY_START
})
@JsonTypeName("EntityIndicesInclusiveExclusive")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class EntityIndicesInclusiveExclusive {
    public static final String JSON_PROPERTY_END = "end";
    private Integer end;

    public static final String JSON_PROPERTY_START = "start";
    private Integer start;

    public EntityIndicesInclusiveExclusive(Integer end, Integer start) {
        this.end = end;
        this.start = start;
    }

    public EntityIndicesInclusiveExclusive end(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * Index (zero-based) at which position this entity ends.  The index is exclusive.
     * minimum: 0
     * @return end
     **/
    @NotNull
    @Min(0)
    @JsonProperty(JSON_PROPERTY_END)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getEnd() {
        return end;
    }

    @JsonProperty(JSON_PROPERTY_END)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEnd(Integer end) {
        this.end = end;
    }

    public EntityIndicesInclusiveExclusive start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * Index (zero-based) at which position this entity starts.  The index is inclusive.
     * minimum: 0
     * @return start
     **/
    @NotNull
    @Min(0)
    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getStart() {
        return start;
    }

    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStart(Integer start) {
        this.start = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityIndicesInclusiveExclusive entityIndicesInclusiveExclusive = (EntityIndicesInclusiveExclusive) o;
        return Objects.equals(this.end, entityIndicesInclusiveExclusive.end) &&
            Objects.equals(this.start, entityIndicesInclusiveExclusive.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(end, start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityIndicesInclusiveExclusive {\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
