package Transformation;

import cucumber.api.Transformer;

/**
 * Created by vens on 3/13/2017.
 */
public class SalarycountTransformer extends Transformer<Integer>{

    @Override
    public Integer transform(String salary) {

        return salary.length();

    }
}
