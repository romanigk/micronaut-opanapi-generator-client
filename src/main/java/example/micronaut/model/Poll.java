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
import example.micronaut.model.PollOption;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Represent a Poll attached to a Tweet.
 */
@JsonPropertyOrder({
  Poll.JSON_PROPERTY_DURATION_MINUTES,
  Poll.JSON_PROPERTY_END_DATETIME,
  Poll.JSON_PROPERTY_ID,
  Poll.JSON_PROPERTY_OPTIONS,
  Poll.JSON_PROPERTY_VOTING_STATUS
})
@JsonTypeName("Poll")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class Poll {
    public static final String JSON_PROPERTY_DURATION_MINUTES = "duration_minutes";
    private Integer durationMinutes;

    public static final String JSON_PROPERTY_END_DATETIME = "end_datetime";
    private OffsetDateTime endDatetime;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_OPTIONS = "options";
    private List<PollOption> options = new ArrayList<>();

    /**
     * Gets or Sets votingStatus
     */
    public enum VotingStatusEnum {
        OPEN("open"),
        CLOSED("closed");

        private String value;

        VotingStatusEnum(String value) {
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
        public static VotingStatusEnum fromValue(String value) {
            for (VotingStatusEnum b : VotingStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_VOTING_STATUS = "voting_status";
    private VotingStatusEnum votingStatus;

    public Poll(String id, List<PollOption> options) {
        this.id = id;
        this.options = options;
    }

    public Poll durationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
        return this;
    }

    /**
     * Get durationMinutes
     * minimum: 5
     * maximum: 10080
     * @return durationMinutes
     **/
    @Nullable
    @Min(5)
    @Max(10080)
    @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Poll endDatetime(OffsetDateTime endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    /**
     * Get endDatetime
     * @return endDatetime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_END_DATETIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getEndDatetime() {
        return endDatetime;
    }

    @JsonProperty(JSON_PROPERTY_END_DATETIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setEndDatetime(OffsetDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    public Poll id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of this poll.
     * @return id
     **/
    @NotNull
    @Pattern(regexp="^[0-9]{1,19}$")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public Poll options(List<PollOption> options) {
        this.options = options;
        return this;
    }

    public Poll addOptionsItem(PollOption optionsItem) {
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Get options
     * @return options
     **/
    @NotNull
    @Size(min=2, max=4)
    @JsonProperty(JSON_PROPERTY_OPTIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<PollOption> getOptions() {
        return options;
    }

    @JsonProperty(JSON_PROPERTY_OPTIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOptions(List<PollOption> options) {
        this.options = options;
    }

    public Poll votingStatus(VotingStatusEnum votingStatus) {
        this.votingStatus = votingStatus;
        return this;
    }

    /**
     * Get votingStatus
     * @return votingStatus
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_VOTING_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public VotingStatusEnum getVotingStatus() {
        return votingStatus;
    }

    @JsonProperty(JSON_PROPERTY_VOTING_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVotingStatus(VotingStatusEnum votingStatus) {
        this.votingStatus = votingStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Poll poll = (Poll) o;
        return Objects.equals(this.durationMinutes, poll.durationMinutes) &&
            Objects.equals(this.endDatetime, poll.endDatetime) &&
            Objects.equals(this.id, poll.id) &&
            Objects.equals(this.options, poll.options) &&
            Objects.equals(this.votingStatus, poll.votingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durationMinutes, endDatetime, id, options, votingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Poll {\n");
        sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
        sb.append("    endDatetime: ").append(toIndentedString(endDatetime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    votingStatus: ").append(toIndentedString(votingStatus)).append("\n");
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
