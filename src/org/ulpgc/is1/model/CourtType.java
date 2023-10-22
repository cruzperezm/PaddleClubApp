package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum CourtType {
    SLOWCOURT, FASTCOURT;

    private Map<CourtType, List<Court>> courtsByType = new HashMap<>();

    public List<Court> getCourts() {
        return courtsByType.get(this);
    }

    public void addCourt(Court court) {
        if (!courtsByType.containsKey(this)) {
            courtsByType.put(this, new ArrayList<>());
        }
        courtsByType.get(this).add(court);
    }

    public void removeCourt(Court court) {
        if (courtsByType.containsKey(this)) {
            courtsByType.get(this).remove(court);
        }
    }

    public Court getCourt(int index) {
        if (courtsByType.containsKey(this) && index >= 0 && index < courtsByType.get(this).size()) {
            return courtsByType.get(this).get(index);
        } else {
            return null;
        }
    }
}
