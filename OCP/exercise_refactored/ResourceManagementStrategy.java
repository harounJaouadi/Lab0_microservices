package com.directi.training.ocp.exercise;

public interface ResourceManagementStrategy {
    int allocateResource();
    void freeResource(int resourceId);
    void markSlotFree(int resourceId);
    void markSlotBusy(int resourceId);
    int findFreeSlot();
}