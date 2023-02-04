package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("スタックテスト")
public class StackTest {

        @Test
        @DisplayName("スタックが空の状態にisEmpty()を実行するとtrueを返す")
        public void isEmpty() {
        	Stack<Object> stack = new Stack<>();
            assertTrue(stack.isEmpty());
        }

        @Test
        @DisplayName("スタックが空の状態にpop()を実行するとEmptyStackExceptionをスローする")
        public void throwsExceptionWhenPopped() {
        	Stack<Object> stack = new Stack<>();
            assertThrows(EmptyStackException.class, () -> stack.pop());
        }

        @Test
        @DisplayName("スタックに１回pushした状態でisEmpty()を実行するとfalseを返す")
        public void isNotEmpty() {
            Stack<Object> stack = new Stack<>();
            String anElement = "要素1";
            stack.push(anElement);
            assertFalse(stack.isEmpty());
        }

        @Test
        @DisplayName("スタックに１回pushした状態でpop()を実行したものがanElementと等しい")
        public void returnElementWhenPopped() {
            Stack<Object> stack = new Stack<>();
            String anElement = "要素1";
            stack.push(anElement);
            assertEquals(anElement, stack.pop());
        }
}
