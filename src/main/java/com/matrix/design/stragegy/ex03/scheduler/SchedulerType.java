package com.matrix.design.stragegy.ex03.scheduler;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.Supplier;
import lombok.Getter;

@Getter
public enum SchedulerType {
    AGENT_GET_CALL("A", AgentGetCall::new),
    LEAST_JOB("L", LeastJob::new),
    PRIORITY_ALLOCATION("P", PriorityAllocation::new),
    ROUND_ROBI8N("R", RoundRobin::new);

    final String initial;
    final Supplier<Scheduler> createScheduler;

    SchedulerType(String initial, Supplier<Scheduler> createScheduler) {
        this.initial = initial;
        this.createScheduler = createScheduler;
    }

    public static SchedulerType findByName(final String name) {
        return Arrays.stream(SchedulerType.values())
            .filter(o -> o.getInitial().equals(name))
            .findFirst()
            .orElseThrow(NoSuchElementException::new);
    }
}
