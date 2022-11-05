package example.micronaut.api;

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
 * API tests for GeneralApi
 */
@MicronautTest
public class GeneralApiTest {

    @Inject
    GeneralApi api;

    
    /**
     * Returns the OpenAPI Specification document.
     *
     * Full OpenAPI Specification in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)
     */
    @Test
    @Disabled("Not Implemented")
    public void getOpenApiSpecTest() {
        // given

        // when
        Object body = api.getOpenApiSpec().block();

        // then
        // TODO implement the getOpenApiSpecTest()
    }

    
}
