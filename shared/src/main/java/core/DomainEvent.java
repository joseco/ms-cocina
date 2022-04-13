package core;

import java.util.Date;
import java.util.UUID;

public record DomainEvent(Date occuredOn, UUID id) {


}
