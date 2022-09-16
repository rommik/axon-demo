package com.rommik.graphqlserver;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;

import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class ShowMutation {
    @DgsData(parentType = "Mutation", field = "addShow")
    public Show addRating(DataFetchingEnvironment dataFetchingEnvironment) {


        String title = dataFetchingEnvironment.getArgument("title");
        Integer releaseYear = dataFetchingEnvironment.getArgument("year");
        System.out.println("New Show added -- Title " + title + " and year " + releaseYear + "") ;

        return new Show(title, releaseYear);
    }
}
