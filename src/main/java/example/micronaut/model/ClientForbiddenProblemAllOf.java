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
import java.net.URI;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ClientForbiddenProblemAllOf
 */
@JsonPropertyOrder({
  ClientForbiddenProblemAllOf.JSON_PROPERTY_REASON,
  ClientForbiddenProblemAllOf.JSON_PROPERTY_REGISTRATION_URL
})
@JsonTypeName("ClientForbiddenProblem_allOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class ClientForbiddenProblemAllOf {
    /**
     * Gets or Sets reason
     */
    public enum ReasonEnum {
        OFFICIAL_CLIENT_FORBIDDEN("official-client-forbidden"),
        CLIENT_NOT_ENROLLED("client-not-enrolled");

        private String value;

        ReasonEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReasonEnum fromValue(String value) {
            for (ReasonEnum b : ReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_REASON = "reason";
    private ReasonEnum reason;

    public static final String JSON_PROPERTY_REGISTRATION_URL = "registration_url";
    private URI registrationUrl;

    public ClientForbiddenProblemAllOf() {
    }

    public ClientForbiddenProblemAllOf reason(ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ReasonEnum getReason() {
        return reason;
    }

    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    public ClientForbiddenProblemAllOf registrationUrl(URI registrationUrl) {
        this.registrationUrl = registrationUrl;
        return this;
    }

    /**
     * Get registrationUrl
     * @return registrationUrl
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REGISTRATION_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public URI getRegistrationUrl() {
        return registrationUrl;
    }

    @JsonProperty(JSON_PROPERTY_REGISTRATION_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegistrationUrl(URI registrationUrl) {
        this.registrationUrl = registrationUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientForbiddenProblemAllOf clientForbiddenProblemAllOf = (ClientForbiddenProblemAllOf) o;
        return Objects.equals(this.reason, clientForbiddenProblemAllOf.reason) &&
            Objects.equals(this.registrationUrl, clientForbiddenProblemAllOf.registrationUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, registrationUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientForbiddenProblemAllOf {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    registrationUrl: ").append(toIndentedString(registrationUrl)).append("\n");
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
