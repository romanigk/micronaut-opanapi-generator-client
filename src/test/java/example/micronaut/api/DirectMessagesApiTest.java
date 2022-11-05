package example.micronaut.api;

import example.micronaut.model.CreateDmConversationRequest;
import example.micronaut.model.CreateDmEventResponse;
import example.micronaut.model.CreateMessageRequest;
import example.micronaut.model.Error;
import example.micronaut.model.Get2DmConversationsIdDmEventsResponse;
import example.micronaut.model.Get2DmConversationsWithParticipantIdDmEventsResponse;
import example.micronaut.model.Get2DmEventsResponse;
import example.micronaut.model.Problem;
import java.util.Set;
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
 * API tests for DirectMessagesApi
 */
@MicronautTest
public class DirectMessagesApiTest {

    @Inject
    DirectMessagesApi api;

    
    /**
     * Send a new message to a DM Conversation
     *
     * Creates a new message for a DM Conversation specified by DM Conversation ID
     */
    @Test
    @Disabled("Not Implemented")
    public void dmConversationByIdEventIdCreateTest() {
        // given
        String dmConversationId = "example";
        CreateMessageRequest createMessageRequest = new CreateMessageRequest();

        // when
        CreateDmEventResponse body = api.dmConversationByIdEventIdCreate(dmConversationId, createMessageRequest).block();

        // then
        // TODO implement the dmConversationByIdEventIdCreateTest()
    }

    
    /**
     * Create a new DM Conversation
     *
     * Creates a new DM Conversation.
     */
    @Test
    @Disabled("Not Implemented")
    public void dmConversationIdCreateTest() {
        // given
        CreateDmConversationRequest createDmConversationRequest = new CreateDmConversationRequest("example", null, Arrays.asList("example"));

        // when
        CreateDmEventResponse body = api.dmConversationIdCreate(createDmConversationRequest).block();

        // then
        // TODO implement the dmConversationIdCreateTest()
    }

    
    /**
     * Send a new message to a user
     *
     * Creates a new message for a DM Conversation with a participant user by ID
     */
    @Test
    @Disabled("Not Implemented")
    public void dmConversationWithUserEventIdCreateTest() {
        // given
        String participantId = "example";
        CreateMessageRequest createMessageRequest = new CreateMessageRequest();

        // when
        CreateDmEventResponse body = api.dmConversationWithUserEventIdCreate(participantId, createMessageRequest).block();

        // then
        // TODO implement the dmConversationWithUserEventIdCreateTest()
    }

    
    /**
     * Get DM Events for a DM Conversation
     *
     * Returns DM Events for a DM Conversation
     */
    @Test
    @Disabled("Not Implemented")
    public void getDmConversationsIdDmEventsTest() {
        // given
        String id = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> eventTypes = new HashSet<>();
        Set<String> dmEventFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2DmConversationsIdDmEventsResponse body = api.getDmConversationsIdDmEvents(id, maxResults, paginationToken, eventTypes, dmEventFields, expansions, mediaFields, userFields, tweetFields).block();

        // then
        // TODO implement the getDmConversationsIdDmEventsTest()
    }

    
    /**
     * Get DM Events for a DM Conversation
     *
     * Returns DM Events for a DM Conversation
     */
    @Test
    @Disabled("Not Implemented")
    public void getDmConversationsWithParticipantIdDmEventsTest() {
        // given
        String participantId = "example";
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> eventTypes = new HashSet<>();
        Set<String> dmEventFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2DmConversationsWithParticipantIdDmEventsResponse body = api.getDmConversationsWithParticipantIdDmEvents(participantId, maxResults, paginationToken, eventTypes, dmEventFields, expansions, mediaFields, userFields, tweetFields).block();

        // then
        // TODO implement the getDmConversationsWithParticipantIdDmEventsTest()
    }

    
    /**
     * Get recent DM Events
     *
     * Returns recent DM Events across DM conversations
     */
    @Test
    @Disabled("Not Implemented")
    public void getDmEventsTest() {
        // given
        Integer maxResults = 100;
        String paginationToken = "example";
        Set<String> eventTypes = new HashSet<>();
        Set<String> dmEventFields = new HashSet<>();
        Set<String> expansions = new HashSet<>();
        Set<String> mediaFields = new HashSet<>();
        Set<String> userFields = new HashSet<>();
        Set<String> tweetFields = new HashSet<>();

        // when
        Get2DmEventsResponse body = api.getDmEvents(maxResults, paginationToken, eventTypes, dmEventFields, expansions, mediaFields, userFields, tweetFields).block();

        // then
        // TODO implement the getDmEventsTest()
    }

    
}
