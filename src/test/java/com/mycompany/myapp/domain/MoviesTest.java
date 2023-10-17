package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class MoviesTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Movies.class);
        Movies movies1 = new Movies();
        movies1.setId(1L);
        Movies movies2 = new Movies();
        movies2.setId(movies1.getId());
        assertThat(movies1).isEqualTo(movies2);
        movies2.setId(2L);
        assertThat(movies1).isNotEqualTo(movies2);
        movies1.setId(null);
        assertThat(movies1).isNotEqualTo(movies2);
    }
}
