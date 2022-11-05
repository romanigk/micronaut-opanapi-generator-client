package example.micronaut.api;

import example.micronaut.model.CreateComplianceJobRequest;
import example.micronaut.model.CreateComplianceJobResponse;
import example.micronaut.model.Error;
import example.micronaut.model.Get2ComplianceJobsIdResponse;
import example.micronaut.model.Get2ComplianceJobsResponse;
import java.time.OffsetDateTime;
import example.micronaut.model.Problem;
import java.util.Set;
import example.micronaut.model.TweetComplianceStreamResponse;
import example.micronaut.model.TweetLabelStreamResponse;
import example.micronaut.model.UserComplianceStreamResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for ComplianceApi
 */
@MicronautTest
public class ComplianceApiTest {

    @Inject
    ComplianceApi api;

    
    /**
     * Create compliance job
     *
     * Creates a compliance for the given job type
     */
    @Test
    @Disabled("Not Implemented")
    public void createBatchComplianceJobTest() {
        // given
        CreateComplianceJobRequest createComplianceJobRequest = new CreateComplianceJobRequest("example");

        // when
        CreateComplianceJobResponse body = api.createBatchComplianceJob(createComplianceJobRequest).block();

        // then
        // TODO implement the createBatchComplianceJobTest()
    }

    
    /**
     * Get Compliance Job
     *
     * Returns a single Compliance Job by ID
     */
    @Test
    @Disabled("Not Implemented")
    public void getBatchComplianceJobTest() {
        // given
        String id = "example";
        Set<String> complianceJobFields = new HashSet<>();

        // when
        Get2ComplianceJobsIdResponse body = api.getBatchComplianceJob(id, complianceJobFields).block();

        // then
        // TODO implement the getBatchComplianceJobTest()
    }

    
    /**
     * Tweets Compliance stream
     *
     * Streams 100% of compliance data for Tweets
     */
    @Test
    @Disabled("Not Implemented")
    public void getTweetsComplianceStreamTest() {
        // given
        Integer partition = 56;
        Integer backfillMinutes = 56;
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));

        // when
        TweetComplianceStreamResponse body = api.getTweetsComplianceStream(partition, backfillMinutes, startTime, endTime).block();

        // then
        // TODO implement the getTweetsComplianceStreamTest()
    }

    
    /**
     * Tweets Label stream
     *
     * Streams 100% of labeling events applied to Tweets
     */
    @Test
    @Disabled("Not Implemented")
    public void getTweetsLabelStreamTest() {
        // given
        Integer backfillMinutes = 56;
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));

        // when
        TweetLabelStreamResponse body = api.getTweetsLabelStream(backfillMinutes, startTime, endTime).block();

        // then
        // TODO implement the getTweetsLabelStreamTest()
    }

    
    /**
     * Users Compliance stream
     *
     * Streams 100% of compliance data for Users
     */
    @Test
    @Disabled("Not Implemented")
    public void getUsersComplianceStreamTest() {
        // given
        Integer partition = 56;
        Integer backfillMinutes = 56;
        OffsetDateTime startTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime endTime = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));

        // when
        UserComplianceStreamResponse body = api.getUsersComplianceStream(partition, backfillMinutes, startTime, endTime).block();

        // then
        // TODO implement the getUsersComplianceStreamTest()
    }

    
    /**
     * List Compliance Jobs
     *
     * Returns recent Compliance Jobs for a given job type and optional job status
     */
    @Test
    @Disabled("Not Implemented")
    public void listBatchComplianceJobsTest() {
        // given
        String type = "example";
        String status = "example";
        Set<String> complianceJobFields = new HashSet<>();

        // when
        Get2ComplianceJobsResponse body = api.listBatchComplianceJobs(type, status, complianceJobFields).block();

        // then
        // TODO implement the listBatchComplianceJobsTest()
    }

    
}
