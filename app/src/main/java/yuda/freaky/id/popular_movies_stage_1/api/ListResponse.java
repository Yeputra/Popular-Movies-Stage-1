package yuda.freaky.id.popular_movies_stage_1.api;

import java.util.List;

/**
 * Created by yuda on 15/05/2017.
 */

public class ListResponse {

    List<MovieModel> results;
    int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MovieModel> getResults() {
        return results;
    }

    public void setResults(List<MovieModel> results) {
        this.results = results;
    }
}