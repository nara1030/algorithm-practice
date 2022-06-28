package datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ex_10828Test {
    private CustomStack stack = new CustomStack();

    @Test
    void push_테스트() {
        stack.push("1");
        stack.push("3");
        assertThat(stack.size()).isEqualTo(2);
    }

    @Test
    void pop_테스트() {
        stack.push("1");
        stack.push("3");
        assertThat(stack.pop()).isEqualTo("3");
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    void top_테스트() {
        stack.push("1");
        stack.push("3");
        assertThat(stack.top()).isEqualTo("3");
        assertThat(stack.size()).isEqualTo(2);
    }

    @Test
    void empty_테스트() {
        assertThat(stack.empty()).isEqualTo(1);
        stack.push("1");
        stack.push("3");
        assertThat(stack.empty()).isEqualTo(0);
    }
}