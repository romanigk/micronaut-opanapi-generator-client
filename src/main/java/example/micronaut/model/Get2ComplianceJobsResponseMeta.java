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
 * Get2ComplianceJobsResponseMeta
 */
@JsonPropertyOrder({
  Get2ComplianceJobsResponseMeta.JSON_PROPERTY_RESULT_COUNT
})
@JsonTypeName("Get2ComplianceJobsResponse_meta")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class Get2ComplianceJobsResponseMeta {
    public static final String JSON_PROPERTY_RESULT_COUNT = "result_count";
    private Integer resultCount;

    public Get2ComplianceJobsResponseMeta() {
    }

    public Get2ComplianceJobsResponseMeta resultCount(Integer resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * The number of results returned in this response.
     * @return resultCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getResultCount() {
        return resultCount;
    }

    @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Get2ComplianceJobsResponseMeta get2ComplianceJobsResponseMeta = (Get2ComplianceJobsResponseMeta) o;
        return Objects.equals(this.resultCount, get2ComplianceJobsResponseMeta.resultCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Get2ComplianceJobsResponseMeta {\n");
        sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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
