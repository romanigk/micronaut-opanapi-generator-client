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
import example.micronaut.model.Problem;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * You have been disconnected for operational reasons.
 */
@JsonPropertyOrder({
  OperationalDisconnectProblem.JSON_PROPERTY_DISCONNECT_TYPE
})
@JsonTypeName("OperationalDisconnectProblem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class OperationalDisconnectProblem extends Problem {
    /**
     * Gets or Sets disconnectType
     */
    public enum DisconnectTypeEnum {
        OPERATIONALDISCONNECT("OperationalDisconnect"),
        UPSTREAMOPERATIONALDISCONNECT("UpstreamOperationalDisconnect"),
        FORCEDISCONNECT("ForceDisconnect"),
        UPSTREAMUNCLEANDISCONNECT("UpstreamUncleanDisconnect"),
        SLOWREADER("SlowReader"),
        INTERNALERROR("InternalError"),
        CLIENTAPPLICATIONSTATEDEGRADED("ClientApplicationStateDegraded"),
        INVALIDRULES("InvalidRules");

        private String value;

        DisconnectTypeEnum(String value) {
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
        public static DisconnectTypeEnum fromValue(String value) {
            for (DisconnectTypeEnum b : DisconnectTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_DISCONNECT_TYPE = "disconnect_type";
    private DisconnectTypeEnum disconnectType;

    public OperationalDisconnectProblem(String title, String type) {
        super(title, type);
    }

    public OperationalDisconnectProblem disconnectType(DisconnectTypeEnum disconnectType) {
        this.disconnectType = disconnectType;
        return this;
    }

    /**
     * Get disconnectType
     * @return disconnectType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DISCONNECT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DisconnectTypeEnum getDisconnectType() {
        return disconnectType;
    }

    @JsonProperty(JSON_PROPERTY_DISCONNECT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisconnectType(DisconnectTypeEnum disconnectType) {
        this.disconnectType = disconnectType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperationalDisconnectProblem operationalDisconnectProblem = (OperationalDisconnectProblem) o;
        return Objects.equals(this.disconnectType, operationalDisconnectProblem.disconnectType) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disconnectType, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationalDisconnectProblem {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
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
