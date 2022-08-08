package behavior_coR_pattern.code.filter.filter;

import behavior_coR_pattern.code.filter.Request;

import java.util.ArrayList;
import java.util.List;

public class FilterContext {

    private List<Filter> filters = new ArrayList<>();

    public FilterContext() {
    }

    public void addFilters(Filter filter) {
        if (!filters.contains(filter)) {
            filters.add(filter);
        }
    }

    public void doPreFilter(Request request) {
        // doPre
        for (Filter filter : filters) {
            filter.doPre();
        }
        // doPost
    }

    public void doHandle(Request request) {
        // handle
        filters.forEach(Filter::handle);

    }

    public void doPostFilter(Request request) {
        // doPost 倒着来
        for (int i = filters.size() - 1; i >= 0; i--) {
            filters.get(i).doPost();
        }

    }
}
