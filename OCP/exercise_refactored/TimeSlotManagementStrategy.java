package com.directi.training.ocp.exercise;

public class TimeSlotManagementStrategy implements ResourceManagementStrategy {
    @Override
    public int allocateResource() {
        int resourceId;
        resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
        }

    @Override
    public void freeResource(int resourceId) {
        markSlotFree(resourceId);
    }

    @Override
    public void markSlotFree(int resourceId)
    {
    }

    @Override
    public void markSlotBusy(int resourceId)
    {
    }

    @Override
    public int findFreeSlot()
    {
        return 0;
    }
}
