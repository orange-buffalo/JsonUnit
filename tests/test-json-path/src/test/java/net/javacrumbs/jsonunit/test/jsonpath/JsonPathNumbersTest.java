package net.javacrumbs.jsonunit.test.jsonpath;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;

public class JsonPathNumbersTest {

    @Test
    public void shouldCompareNumberInPath() {
        assertThatJson("{\"root\": [{\"target\": 450} ]}")
                .inPath("$.root")
                .isArray()
                .containsExactly("{target: 450 }");
    }

}
