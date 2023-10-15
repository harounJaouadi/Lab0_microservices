package com.directi.training.ocp.exercise;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;
    private ResourceManagementStrategy strategy;

    public ResourceAllocator(ResourceManagementStrategy strategy) {
        this.strategy = strategy;
    }

    public int allocate(ResourceType resourceType) {
        return strategy.allocateResource();
    }

    public void free(ResourceType resourceType, int resourceId) {
        strategy.freeResource(resourceId);
    }
}
