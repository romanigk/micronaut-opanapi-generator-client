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
import example.micronaut.model.ComplianceJobStatus;
import example.micronaut.model.ComplianceJobType;
import java.net.URI;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ComplianceJob
 */
@JsonPropertyOrder({
  ComplianceJob.JSON_PROPERTY_CREATED_AT,
  ComplianceJob.JSON_PROPERTY_DOWNLOAD_EXPIRES_AT,
  ComplianceJob.JSON_PROPERTY_DOWNLOAD_URL,
  ComplianceJob.JSON_PROPERTY_ID,
  ComplianceJob.JSON_PROPERTY_NAME,
  ComplianceJob.JSON_PROPERTY_STATUS,
  ComplianceJob.JSON_PROPERTY_TYPE,
  ComplianceJob.JSON_PROPERTY_UPLOAD_EXPIRES_AT,
  ComplianceJob.JSON_PROPERTY_UPLOAD_URL
})
@JsonTypeName("ComplianceJob")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-11-05T03:44:30.749524299+01:00[Europe/Berlin]")
@Introspected
public class ComplianceJob {
    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_DOWNLOAD_EXPIRES_AT = "download_expires_at";
    private OffsetDateTime downloadExpiresAt;

    public static final String JSON_PROPERTY_DOWNLOAD_URL = "download_url";
    private URI downloadUrl;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_STATUS = "status";
    private ComplianceJobStatus status;

    public static final String JSON_PROPERTY_TYPE = "type";
    private ComplianceJobType type;

    public static final String JSON_PROPERTY_UPLOAD_EXPIRES_AT = "upload_expires_at";
    private OffsetDateTime uploadExpiresAt;

    public static final String JSON_PROPERTY_UPLOAD_URL = "upload_url";
    private URI uploadUrl;

    public ComplianceJob(OffsetDateTime createdAt, OffsetDateTime downloadExpiresAt, URI downloadUrl, String id, ComplianceJobStatus status, ComplianceJobType type, OffsetDateTime uploadExpiresAt, URI uploadUrl) {
        this.createdAt = createdAt;
        this.downloadExpiresAt = downloadExpiresAt;
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.status = status;
        this.type = type;
        this.uploadExpiresAt = uploadExpiresAt;
        this.uploadUrl = uploadUrl;
    }

    public ComplianceJob createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Creation time of the compliance job.
     * @return createdAt
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ComplianceJob downloadExpiresAt(OffsetDateTime downloadExpiresAt) {
        this.downloadExpiresAt = downloadExpiresAt;
        return this;
    }

    /**
     * Expiration time of the download URL.
     * @return downloadExpiresAt
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_DOWNLOAD_EXPIRES_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDownloadExpiresAt() {
        return downloadExpiresAt;
    }

    @JsonProperty(JSON_PROPERTY_DOWNLOAD_EXPIRES_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDownloadExpiresAt(OffsetDateTime downloadExpiresAt) {
        this.downloadExpiresAt = downloadExpiresAt;
    }

    public ComplianceJob downloadUrl(URI downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * URL from which the user will retrieve their compliance results.
     * @return downloadUrl
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public URI getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDownloadUrl(URI downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public ComplianceJob id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Compliance Job ID.
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

    public ComplianceJob name(String name) {
        this.name = name;
        return this;
    }

    /**
     * User-provided name for a compliance job.
     * @return name
     **/
    @Nullable
    @Size(max=64)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public ComplianceJob status(ComplianceJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ComplianceJobStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(ComplianceJobStatus status) {
        this.status = status;
    }

    public ComplianceJob type(ComplianceJobType type) {
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
    public ComplianceJobType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(ComplianceJobType type) {
        this.type = type;
    }

    public ComplianceJob uploadExpiresAt(OffsetDateTime uploadExpiresAt) {
        this.uploadExpiresAt = uploadExpiresAt;
        return this;
    }

    /**
     * Expiration time of the upload URL.
     * @return uploadExpiresAt
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_UPLOAD_EXPIRES_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getUploadExpiresAt() {
        return uploadExpiresAt;
    }

    @JsonProperty(JSON_PROPERTY_UPLOAD_EXPIRES_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setUploadExpiresAt(OffsetDateTime uploadExpiresAt) {
        this.uploadExpiresAt = uploadExpiresAt;
    }

    public ComplianceJob uploadUrl(URI uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * URL to which the user will upload their Tweet or user IDs.
     * @return uploadUrl
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_UPLOAD_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public URI getUploadUrl() {
        return uploadUrl;
    }

    @JsonProperty(JSON_PROPERTY_UPLOAD_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUploadUrl(URI uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplianceJob complianceJob = (ComplianceJob) o;
        return Objects.equals(this.createdAt, complianceJob.createdAt) &&
            Objects.equals(this.downloadExpiresAt, complianceJob.downloadExpiresAt) &&
            Objects.equals(this.downloadUrl, complianceJob.downloadUrl) &&
            Objects.equals(this.id, complianceJob.id) &&
            Objects.equals(this.name, complianceJob.name) &&
            Objects.equals(this.status, complianceJob.status) &&
            Objects.equals(this.type, complianceJob.type) &&
            Objects.equals(this.uploadExpiresAt, complianceJob.uploadExpiresAt) &&
            Objects.equals(this.uploadUrl, complianceJob.uploadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, downloadExpiresAt, downloadUrl, id, name, status, type, uploadExpiresAt, uploadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComplianceJob {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    downloadExpiresAt: ").append(toIndentedString(downloadExpiresAt)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uploadExpiresAt: ").append(toIndentedString(uploadExpiresAt)).append("\n");
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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