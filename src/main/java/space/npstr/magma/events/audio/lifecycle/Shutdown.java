/*
 * Copyright 2018 Dennis Neufeld
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package space.npstr.magma.events.audio.lifecycle;

/**
 * Created by napster on 24.04.18.
 * <p>
 * This is a lifecycle event for the whole Magma API
 */
public class Shutdown implements LifecycleEvent {

    public static final Shutdown INSTANCE = new Shutdown();

    private Shutdown() {
    }

    @Override
    public String getUserId() {
        return "";
    }

    @Override
    public String getGuildId() {
        return "";
    }

}
