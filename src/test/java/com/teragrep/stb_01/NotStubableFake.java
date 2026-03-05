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

import java.util.Objects;

public final class NotStubableFake implements StubableObject {

    private final boolean isStub;

    public NotStubableFake() {
        this(false);
    }

    private NotStubableFake(final boolean isStub) {
        this.isStub = isStub;
    }

    @Override
    public void doSomething() {
        // no-op
    }

    @Override
    public boolean isStub() {
        return isStub;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final NotStubableFake that = (NotStubableFake) o;
        return isStub == that.isStub;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isStub);
    }
}
