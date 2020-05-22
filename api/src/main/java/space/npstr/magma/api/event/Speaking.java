package space.npstr.magma.api.event;

import org.immutables.value.Value;
import space.npstr.magma.api.Member;

@SuppressWarnings("unused")
@Value.Immutable
@ImmutableApiEvent
public abstract class Speaking implements MagmaEvent {

    public abstract Member getMember();

    public abstract String getUserId();

    public abstract Boolean getSpeaking();
}
