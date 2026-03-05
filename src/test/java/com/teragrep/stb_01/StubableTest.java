/*
 * Teragrep Stub Library for Java
 * Copyright (C) 2026 Suomen Kanuuna Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.teragrep.stb_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

final class StubableTest {

    @Test
    void testNonStubable() {
        final StubableObject s = new NotStubableFake();
        Assertions.assertFalse(s.isStub());
        Assertions.assertDoesNotThrow(s::doSomething);
    }

    @Test
    void testStubable() {
        final StubableObject s = new StubableFake();
        Assertions.assertTrue(s.isStub());
        final UnsupportedOperationException exception = Assertions
                .assertThrows(UnsupportedOperationException.class, s::doSomething);
        Assertions.assertEquals("Stub object does not provide this function", exception.getMessage());
    }
}
