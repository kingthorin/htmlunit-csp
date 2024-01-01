/*
 * Copyright (c) 2023-2024 Ronald Brill.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.htmlunit.csp;

import java.util.List;

public class PolicyList {
    private final List<Policy> policies_;

    public PolicyList(final List<Policy> policies) {
        policies_ = policies;
    }

    @Override
    public String toString() {
        final StringBuilder out = new StringBuilder();
        boolean first = true;
        for (final Policy policy : policies_) {
            if (!first) {
                out.append(", "); // The whitespace is not strictly necessary but is probably valuable
            }
            first = false;
            out.append(policy.toString());
        }
        return out.toString();
    }
}
